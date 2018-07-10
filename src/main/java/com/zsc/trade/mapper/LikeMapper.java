package com.zsc.trade.mapper;

import com.zsc.trade.bean.Like;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface LikeMapper {

    /**
     * private Integer id;
     *     private Integer user_id;
     *     private Integer produce_id;
     */

    @Select("select * from user_id=#{user_id}")
    List<Like>  getLikeByUid(Integer user_id);

    @Insert("insert into like(user_id,produce_id) values(user_id = #{user_id},produce_id=#{produce_id})")
   int insert(Like like);
    

    @Update("updata like set user_id = #{user_id},produce_id=#{produce_id} where id=#{id}")
   void  updata(Like like);

   @Delete("delete like from id = #{id}")
   void  delete(Integer id);

}
