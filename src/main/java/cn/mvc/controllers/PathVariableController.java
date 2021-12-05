package cn.mvc.controllers;

import cn.mvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//@PathVariable
//专门用来获取url目录级别的参数
//例子： http://localhost:8080/request02/path/user02/123/xuxu
//比如说获得123  @RequestMapping("/user/{id})
//@PathVariable("id") Integer id

//如果是当个参数接受必须使用@PathVariable来声明对应参数占位符名字

@Controller
@RequestMapping("/path")

public class PathVariableController {

//    获取用户实体
    @RequestMapping("/user/{id}/{username}")
    public String path01(@PathVariable("id") Integer id,@PathVariable("username") String name){
        System.out.println(id);
        System.out.println(name);
        return "/index.jsp";
    }

    @RequestMapping("/user02/{id}/{name}")
    public String path02(User user){
        System.out.println(user);

        return "/index.jsp";
    }
}
