package cn.mvc.controllers;


import cn.mvc.entity.Role;
import cn.mvc.entity.User;
import cn.mvc.entity.UserDTO;
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

//复杂数据类型：
//    对象
//    不用加上参数名字，直接传入该对象属性名字
//    如果是包装类型的单个变量 直接输入名字=表单个元素name name="id"
//        数组 =保证这一数组都是同一个name name="alias"
//    List必须加上【索引】   name="hobbies[0]" 如果List<User>:name="user[0].name"
//    map必须加上【key】    name="map["key"]"

    @RequestMapping("/params01")
    public String params01(@RequestParam(value="username",defaultValue = "CC") String name){
        System.out.println(name);
        return "/index.jsp";
    }

//    处理复杂参数乱码问题

//    复杂数据类型参数自动绑定

    @RequestMapping("/params02")
    public String params02(UserDTO userDTO){
        System.out.println(userDTO);

        return "/index.jsp";
    }
}
