package com.muzi.museum.service;

import com.muzi.museum.bean.Notify;

import java.util.List;

public interface INotifyService {
    //查询所有的通知
    public List<Notify> findAll();
    //通过id查询通知
    public Notify findNotifyById(int id);
    //添加新的通知
    public int insertNotify(Notify notify);
    //修改原有的通知
    public int uodateNotifyById(Notify notify);
    //删除原有的通知消息
    public int deleteNotifyById(int id);
}
