package com.muzi.museum.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import com.muzi.museum.bean.DDoc;
import com.muzi.museum.dao.DDocMapper;
import com.muzi.museum.service.IDDocService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import java.util.List;



@Service
public class IDDocServiceImpl implements IDDocService {
    @Autowired DDocMapper dDocMapper;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    private static final Logger LOGGER = LoggerFactory.getLogger(IDDocServiceImpl.class);
    @Override
    public List<DDoc> findAll() {
        return dDocMapper.findAll();
    }

    @Override
    public int insert(DDoc dDoc) {
        return dDocMapper.insert(dDoc);
    }

    @Override

    public DDoc selectByPrimaryKey(int id) {
        //缓存中获取信息
        String key = "ddoc:" + id;
        //缓存存在
        boolean haskey = stringRedisTemplate.hasKey(key);
        if(haskey){
            String json = stringRedisTemplate.opsForValue().get(key);
            DDoc dDoc = JSONObject.parseObject(json,DDoc.class);
            LOGGER.info("从缓存中读取到DDoc"+"id:"+dDoc.getId());
            return dDoc;
        }
        else {
            DDoc dDoc;
            //从DB中获取用户的值
            dDoc = dDocMapper.selectByPrimaryKey(id);
            //写入缓存
            if (dDoc != null) {
                stringRedisTemplate.opsForValue().set(key, JSON.toJSONString(dDoc));
                LOGGER.info("DDoc写入缓存" + "id:" + dDoc.getId());
            }
            return dDoc;
        }
    }

    @Override
    public int deleteByPrimaryKey(int id) {
        return dDocMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(DDoc dDoc) {
        return dDocMapper.updateByPrimaryKey(dDoc);
    }
}
