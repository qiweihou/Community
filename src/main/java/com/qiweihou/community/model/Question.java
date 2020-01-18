package com.qiweihou.community.model;

import lombok.Data;

/**
 * @author qiwei
 * @date 2020/1/14
 */
@Data
public class Question {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;

}
