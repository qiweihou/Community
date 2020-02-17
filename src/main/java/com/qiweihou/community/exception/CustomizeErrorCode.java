package com.qiweihou.community.exception;

/**
 * @author qiwei
 * @date 2020/2/15
 */
public enum CustomizeErrorCode implements ICustomizeErrorCode{

    QUESTION_NOT_FOUND("问题不存在或已删除！");

    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    CustomizeErrorCode(String message) {
        this.message = message;
    }
}
