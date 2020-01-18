package com.qiweihou.community.mapper;

import com.qiweihou.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author qiwei
 * @date 2020/1/14
 */
@Mapper
public interface QuestionMapper {

    @Insert("insert into question(title, description, gmt_create, gmt_modified, creator, tag) values (" +
            "#{title} ,#{description} ,#{gmtCreate} ,#{gmtModified} ,#{creator} ,#{tag} )")
    void create(Question question);

    @Select("select * from question")
    List<Question> list();
}



