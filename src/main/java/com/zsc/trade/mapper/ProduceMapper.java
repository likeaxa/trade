package com.zsc.trade.mapper;

import com.zsc.trade.bean.Product;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProduceMapper {

    /**
     *   private Integer id;
     *     private String name;
     *     private String price;
     *     private String gmt_create;
     *     private String description;
     *     private Integer cate_id;
     *     private Integer is_sold;
     */

    @Select("select * from produce")
    List<Product> getAll();
    @Select("select * from produce where id=#{id}")
    Product getProduceById(Integer id);

    @Insert("insert into produce(name ,price,gmt_create,description,cate_id,is_sold) " +
            "values ( name=#{name},price=#{price},gmt_create=#{gmt_create},description=#{description},cate_id=#{cate_id},is_sold=#{is+sold})")
    int Insert(Product produce);

    @Update("update produce set name=#{name},price=#{price},gmt_create=#{gmt_create}," +
            "description=#{description},cate_id=#{cate_id},is_sold=#{is_sold} where id=#{id}")
    void update(Product produce);
    @Delete("delete from produce id = #{id}")
    void delete(Integer id);
}