package cn.mvc.controllers;


import cn.mvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParamsController {

    //如果类型未匹配就会报错

//如果请求的参数与处理方法不一致
//@RequestParam 管理请求参数
//    value  用来重命名参数
//    required true 必须传输参数 如果没传入就会400错误
//    fasle 不一定要传入参数
//    defaultValue 在没有传入参数时默认传入

//    处理数据类型乱码：
//POST: 在serviet获取参数之前 设置req.setCharacterEncoding("UTF-8");但是在每个获取参数都要设置
//    所以我们会用过滤器来处理编码问题（最终解决方案）
//使用springmvc提供给我们的编码过滤器来解决POST乱码问题



    @RequestMapping("/params01")
    public String params01(@RequestParam(value="username",defaultValue = "CC") String name){
        System.out.println(name);
        return "/index.jsp";
    }

//    处理复杂参数乱码问题

//    复杂数据类型参数自动绑定

    @RequestMapping("/params02")
    public String params02(User user){
        System.out.println(user);
        return "/index.jsp";
    }
}
