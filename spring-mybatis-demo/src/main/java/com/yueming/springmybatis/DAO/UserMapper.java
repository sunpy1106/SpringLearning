package com.yueming.springmybatis;

import com.yueming.springmybatis.VO.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Select("select * from users where id=${userId}")
    User getUser(@Param("userId") String usrId);
}
