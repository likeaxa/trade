package com.zsc.trade.mapper;

import com.zsc.trade.bean.Produce;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ProduceMapper {

    /**
     *   private Integer id;
     *     private String name;
     *     private String price;
     *     private String creating_time;
     *     private String text;
     *     private Integer c_id;
     *     private Integer image;
     */

    @Select("select * from produce")
    List<Produce> getAll();
    @Select("select * from produce where id=#{id}")
    Produce getProduceById(Integer id);

    @Insert("insert into produce(name ,price,creating_time,text,c_id,image) values ( name=#{name},price=#{price},creating=#{creating},text=#{text},c_id=#{c_id},image=#{image})")
    int Insert(Produce produce);

    @Update("updata produce set name=#{name},price=#{price},creating=#{creating},text=#{text},c_id=#{c_id},image=#{image} where id=#{id}")
    void updata(Produce produce);
    @Delete("delete from produce id = #{id}")
    void delete(Integer id);
}