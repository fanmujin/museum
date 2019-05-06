package com.muzi.museum.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTime {
    private static SimpleDateFormat mSimpleDateFormat= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//将
    protected static final Logger logger = LoggerFactory.getLogger(CurrentTime.class);
    //获得当前时间
    public CurrentTime() {

    }

    public Timestamp getTime() {
        Date date = new Date();//获得系统时间
        String nowTime = mSimpleDateFormat.format(date);//将时间格式转换为标准格式
        Timestamp timestamp = Timestamp.valueOf(nowTime);//把时间转换
        //"2019-05-06 20:20:36"
        return timestamp;
    }
}
