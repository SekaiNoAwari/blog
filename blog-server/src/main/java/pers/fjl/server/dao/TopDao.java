package pers.fjl.server.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import pers.fjl.common.vo.BlogVo;

import java.util.List;

public interface TopDao extends BaseMapper<BlogVo> {

    @Select("SELECT b.blog_id, b.type_id, b.uid, b.content, b.recommend, b.create_time, b.first_picture, t.type_name, b.description, b.flag, b.update_time, b.title, b.is_top, u.avatar, u.nickname " +
            "FROM blog b,type t, user u " +
            "WHERE b.is_top='1' and b.type_id = t.type_id and b.uid=u.uid ")
    List<BlogVo> getTopBlogs();
}
