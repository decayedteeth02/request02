package cn.mvc.controllers;

import cn.mvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//Tomcat 7以上只支持GET/POST/HEAD



@Controller
@RequestMapping("/rest")
public class RestController {

    //获取
    @GetMapping("/user/{id}")
    public String get(@PathVariable("id") Integer id){
        System.out.println("查询用户");
        System.out.println(id);
        return "/index.jsp";
    }

    //新增
    @PostMapping("/user")
    public String add(User user){
        System.out.println("增加用户");
        System.out.println(user);
        return "/index.jsp";
    }

    //修改
    @PutMapping ("/user/{id}")
    public String updata(User user){
        System.out.println("修改用户");
        System.out.println(user);
        return "/index.jsp";
    }

    //删除
    @DeleteMapping ("/user/{id}")
    public String delete(@PathVariable("id") Integer id){
        System.out.println("删除用户");
        System.out.println(id);
        return "/index.jsp";
    }

}
