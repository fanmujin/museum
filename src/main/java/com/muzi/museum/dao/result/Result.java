package com.muzi.museum.dao.result;

import com.muzi.museum.dao.enums.ResultCode;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

import static com.muzi.museum.dao.enums.ResultCode.USER_LOGIN_ERROR;

/**
 * Created by MUZI on 17/5/24.
 */
@Data
public class Result implements Serializable {
    private static final long serialVersionUID = -3948389268046368059L;
    protected static final Logger logger = LoggerFactory.getLogger(Result.class);

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getTest() {
        return test;
    }

    public void setTest(int test) {
        this.test = test;
    }

    private Integer code;

    private String msg;

    private Object data;

    private int test;

    public Result() {}

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static Result success() {
        Result result = new Result();
        result.setResultCode(ResultCode.SUCCESS);
        return result;
    }

    public static Result success(Object data) {
        Result result = new Result();
        result.setResultCode(ResultCode.SUCCESS);
        result.setData(data);
        return result;
    }

    public static Result failure(ResultCode resultCode) {
        Result result = new Result();
        result.setResultCode(resultCode);
        return result;
    }

    public static Result failure(ResultCode resultCode, Object data) {
        Result result = new Result();
        result.setResultCode(resultCode);
        result.setData(data);
        return result;
    }
    public static Result failure() {
        Result result = new Result();
        result.setResultCode(ResultCode.USER_LOGIN_ERROR);
        return result;
    }

    public void setResultCode(ResultCode code) {
        this.code = code.code();
        this.msg = code.message();
    }


}
