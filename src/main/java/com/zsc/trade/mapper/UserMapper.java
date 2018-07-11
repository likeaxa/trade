package com.zsc.trade.mapper;


import com.zsc.trade.bean.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    @Select("select * from user ")
    List<User> getList();

    @Select("select * from user where id=#{id}")
    User getUserById(Integer id);

    @Insert("Insert into user(username,password,phone) values(#{username},#{password},#{phone})")
    int insert(User user);

    @Update("update user set username=#{username},password=#{password},phone=#{phone} where id=#{id}")
    void update(User user);

    @Delete("delete from user where id = #{id}")
    void delete(Integer id);


}
