package com.zsc.trade.mapper;

import com.zsc.trade.bean.Category;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface CategoryMapper {

    @Select("select * from category")
    List<Category> getAll();

    @Select("select % from category where id=#{id}")
    Category getCategoryById(Integer id);

    @Insert("insert into category(c_name) values(category=#{category} )")
    int insert(Category category);

    @Update("updata category srt c_name=#{c_name} where id=#{id}")
    void updata(Category category);

    @Delete("delete from category where id = #{id}")
    void delete(Integer id);
}
