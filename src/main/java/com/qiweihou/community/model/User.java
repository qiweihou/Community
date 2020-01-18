package com.qiweihou.community.model;

import lombok.Data;

/**
 * @author qiwei
 * @date 2020/1/11
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private long gmtCreate;
    private long gmtModified;
    private String avatarUrl;
}
