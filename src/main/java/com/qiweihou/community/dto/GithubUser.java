package com.qiweihou.community.dto;

import lombok.Data;

/**
 * @author qiwei
 * @date 2020/1/10
 */
@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatar_url;
}
