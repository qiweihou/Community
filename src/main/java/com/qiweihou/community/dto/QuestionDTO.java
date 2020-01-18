package com.qiweihou.community.dto;

import com.qiweihou.community.model.User;
import lombok.Data;

/**
 * @author qiwei
 * @date 2020/1/18
 */
@Data
public class QuestionDTO {
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
    private User user;
}
