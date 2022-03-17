package com.aditya.common;

public class BaseException extends  Exception{

    String errString;
    Throwable t;
    Exception exception;
    String userId;

    public BaseException()
    {

    }
    public BaseException(String errString,String userId)
    {
        System.out.println("ERROR OCCURED  FOR USER ID "+ userId+"  "+ errString);
    }
    public BaseException(String message, Throwable cause, Exception e, String error) {
        super(message, cause);
        this.errString = errString;
        this.t = t;
        this.exception=e;
    }

    public String getErrString() {
        return errString;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setErrString(String errString) {
        this.errString = errString;
    }

    public Throwable getT() {
        return t;
    }

    public void setT(Throwable t) {
        this.t = t;
    }
}
