package com.yueming.springmybatis.DAO;

import com.yueming.springmybatis.VO.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Select("select * from users where userId=${userId}")
    User getUser(@Param("userId") String usrId);
}
