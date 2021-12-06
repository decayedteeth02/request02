package cn.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/Mapping")
public class MappingController {
    @RequestMapping("/Mapping01")
    public String mapping01(){
        System.out.println("映射成功");
        return "/index.jsp";
    }

//    @RequestMapping(value = "/Mapping02",method = RequestMethod.POST)
    @PostMapping("/method")//等同于上面
    @GetMapping
    @DeleteMapping
    @PutMapping
    public String mapping02(){
        System.out.println("请求方式");
        return "/index.jsp";
    }

//    params = {"username"}//参数必有什么值
//    params = {"!username"}//参数必没有什么值
//    params = {"username=cc"}参数必须等于什么值
//    params = {"!username=cc"}参数不必须等于什么值
    @RequestMapping(value = "/params",params = {"!username"})//对参数的映射
    public String mapping03(){
        System.out.println("请求参数");
        return "/index.jsp";
    }

    @RequestMapping(value = "/heards",headers = {""})//对参数的映射
    public String mapping04(){
        System.out.println("请头参数");
        return "/index.jsp";
    }

    @RequestMapping(value = "/consumes",consumes = {""})//对参数的映射
    public String mapping05(){
        System.out.println("请求的内容类型映射");
        return "/index.jsp";
    }

}
