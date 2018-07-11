/*package com.zsc.trade.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zsc.trade.bean.Category;
import com.zsc.trade.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
public class UserController {

    @Autowired
    private CategoryMapper categoryMapper;

    @RequestMapping("/listCategory")// 在参数里接受当前是第几页 start ，以及每页显示多少条数据 size。 默认值分别是0和5。
    public String listCategory(Model m, @RequestParam(value = "start",defaultValue = "0" )int start ,
                               @RequestParam(value = "size",defaultValue = "5") int size) throws Exception{
        //根据start,size进行分页，并且设置id 倒排序
        PageHelper.startPage(start,size);
        //因为PageHelper的作用，这里就好返回当前分页的集合
        List<Category> cs = categoryMapper.getAll();

        //创建PageInfo对象

        PageInfo<Category> page = new  PageInfo<>(cs);

        //把PageInfo放进model

        m.addAttribute("page",page);

        return "listCategory";

    }
}*/
