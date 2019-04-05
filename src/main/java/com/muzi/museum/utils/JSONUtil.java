package com.muzi.museum.utils;

import java.util.List;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * JSON工具类
 * @author pibigstar
 *
 */
public class JSONUtil {

    /**
     * java对象转换为JSON字符串
     * @param object
     * @return
     */
    public static String ObjectToJSON(Object object) {
        return JSON.toJSONString(object);
    }

    /**
     * JSON字符串转换为Java对象
     * @param json
     * @param obj
     * @return
     */
    public static <T> T jSONToObject(String json, Class<T> obj) {
        JSONObject jsonObject = JSON.parseObject(json);
        return (T) JSON.toJavaObject(jsonObject, obj);
    }
    /**
     * List集合转换为JSON字符串
     * @param list
     * @return
     */
    public static <T> String listToJSON(List<T> list) {
        return JSONArray.toJSONString(list);
    }

    /**
     * 将JSON字符串转换为List集合
     * @param json
     * @param obj
     * @return
     */
    public static <T> List<T> JSONToList(String json,Class<T> obj){
        return JSON.parseArray(json, obj);
    }

}
