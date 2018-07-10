package com.zsc.trade.mapper;


import com.zsc.trade.bean.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper {

    @Select("select * from user ")
    List<User> getList();

    @Select("select * from user where id=#{id}")
    User getUserById(Integer id);

    @Insert("Insert into user(username,password,call_number) values(#{username},#{password},#{call_number})")
    int insertByUser(User user);

    @Update("updata user set username=#{username},password=#{paaaword},call_number=#{call_number} where id=#{id}")
    void updata(User user);

    @Delete("delete from user where id = #{id}")
    void delete(Integer id);


}
