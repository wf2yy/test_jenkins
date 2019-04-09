package com.example.jenkinsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: chengde
 * @Date: 2018/8/24 10:50
 * @Description:
 */
@RestController
public class StudentController {


    @GetMapping("/hello")
    public String hello(){
        return "hello ,jenkins !!!!";
    }







}
