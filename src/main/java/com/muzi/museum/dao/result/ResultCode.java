package com.muzi.museum.dao.result;

/**
 * 返回对象
 * @author muzi
 *
 */
public class ResultCode {
    private String code = "0000";

    private String msg;

    private boolean success;

    private Object data;

    public ResultCode(String code,String msg,boolean success,Object data){
        super();
        this.code = code;
        this.msg = msg;
        this.success = success;
        this.data = data;
    }
    public  ResultCode(String code,boolean success,Object data){
        super();
        this.code = code;
        this.success = success;
        this.data = data;
    }
    public  ResultCode(boolean success,Object data){
        super();
        this.success = success;
        this.data = data;
    }
    public  ResultCode(String code,String msg,boolean success){
        super();
        this.code = code;
        this.msg = msg;
        this.success = success;
    }

}
