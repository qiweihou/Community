package com.qiweihou.community.exception;

/**
 * @author qiwei
 * @date 2020/2/14
 */
public class CustomizeException extends RuntimeException{

    private String message;

    public CustomizeException(ICustomizeErrorCode errorCode) {
        this.message = errorCode.getMessage();
    }

    public CustomizeException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
