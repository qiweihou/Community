package com.qiweihou.community.mapper;

import com.qiweihou.community.dto.GithubUser;
import com.qiweihou.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author qiwei
 * @date 2020/1/11
 */
@Mapper
public interface UserMapper {

    @Insert("insert into user(name, account_id, token, gmt_create, gmt_modified) values" +
            " (#{name} ,#{accountId} ,#{token} ,#{gmtCreate} ,#{gmtModified}  )")
    void insert(User user);

}
