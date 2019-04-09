package com.muzi.museum.service.impl;


import com.muzi.museum.bean.Type_picture;
import com.muzi.museum.bean.Typee;
import com.muzi.museum.bean.extend.TypeeVM;
import com.muzi.museum.dao.Type_pictureMapper;
import com.muzi.museum.dao.TypeeMapper;
import com.muzi.museum.dao.extend.TypeeVMMapper;
import com.muzi.museum.service.ITypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ITypeServiceImpl  implements ITypeService {
    @Autowired
    private TypeeMapper typeeMapper;
    @Autowired
    private TypeeVMMapper typeeVMMapper;
    @Autowired
    private Type_pictureMapper type_pictureMapper;
    @Override

    public List<TypeeVM> findAll() {
        return typeeVMMapper.selectAll();
    }
    //插入名俗类别
    @Override
    public int insert(Typee typee) {
        return typeeMapper.insert(typee);
    }

    @Override
    public void saveOrupdateTypeeVM(TypeeVM typeeVM) {
        //0.分离TyppeVM 分离出Typee and Type_picture
        List<Type_picture> type_pictures = typeeVM.getType_pictures();
        //分离出typee对象
        Typee typee = new Typee();
        typee.setId(typeeVM.getId());
        typee.setTypeName(typeeVM.getTypeName());
        typee.setTypeDescription(typeeVM.getTypeDescription());
        //typee 类型对象 ，type_picture 类型图片对象
        // 1.判断保存还是修改
        /*
         * 保存名俗类别
         * 保存名俗图片
         * */
        //当id为空的时候做保存操作
        if (typee.getId() == null){
            //保存名俗类别
            typeeMapper.insert(typee);
        for (Type_picture picture : type_pictures) {
            //保存名俗类别的id
            picture.setTypeId(typee.getId());
            //保存名俗类别的图片
            type_pictureMapper.insert(picture);
        }
    }
            //当id不为空的时候做修改操作
            else{
               /*修改
               * 1.1 修改名俗类别信息
               */
               typeeMapper.updateByPrimaryKey(typee);
               /*
               * 2.1 修改名俗图片信息(添加，修改，删除)
               * 3.1 删除原来的名俗照片
               */
                type_pictureMapper.deleteByType_id(typee.getId());
                /*
               * 3.2 重新添加图片
               * */
            for (Type_picture picture : type_pictures) {
                //保存名俗类别的id
                picture.setTypeId(typee.getId());
                System.out.println(typee.getId());
                //保存名俗类别的图片
                type_pictureMapper.insert(picture);
               }
            }
        }
    }
