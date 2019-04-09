package com.muzi.museum.utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTime {
    //获得当前时间
    public CurrentTime() {
    }

    public Timestamp getTime() {
        Date date = new Date();//获得系统时间
        String nowTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);//将时间格式转换为标准格式
        Timestamp timestamp = Timestamp.valueOf(nowTime);//把时间转换
        return timestamp;
    }
}
