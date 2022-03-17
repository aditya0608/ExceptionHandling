package com.aditya.common;

public class BusinessException extends BaseException{



    public BusinessException(String errString,String userId)
    {
    super(errString,userId);
    }
    public BusinessException(String message,Throwable t,Exception e,String error)
    {
        super(message,t,e,error);
    }
}
