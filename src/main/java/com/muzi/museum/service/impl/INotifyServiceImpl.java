package com.muzi.museum.service.impl;

import com.muzi.museum.bean.Notify;
import com.muzi.museum.dao.NotifyMapper;
import com.muzi.museum.service.INotifyService;
import com.muzi.museum.utils.CurrentTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class INotifyServiceImpl implements INotifyService {
    @Autowired
    private NotifyMapper notifyMapper;

    //查询所有的消息通知
    @Override
    public List<Notify> findAll() {
        return notifyMapper.selectAll();
    }

    @Override
    public Notify findNotifyById(int id) {
        return notifyMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insertNotify(Notify notify) {
        CurrentTime currentTime = new CurrentTime();
        notify.setCreateTime(currentTime.getTime());
        return notifyMapper.insert(notify);
    }

    @Override
    public int uodateNotifyById(Notify notify) {
        CurrentTime currentTime = new CurrentTime();
        notify.setUpdateTime(currentTime.getTime());
        return notifyMapper.updateByPrimaryKey(notify);
    }

    @Override
    public int deleteNotifyById(int id) {
        return notifyMapper.deleteByPrimaryKey(id);
    }
}
