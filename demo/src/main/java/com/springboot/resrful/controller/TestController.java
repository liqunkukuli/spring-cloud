package com.springboot.resrful.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lujw on 2017/8/2.
 */
@RestController
@Api(value = "模拟" ,description = "这是一个测试restful的测试",position = 1)
public class TestController {

    @ApiOperation(value = "测试hello" , notes = "描述hello" ,position = 2)
    @ApiImplicitParam(name = "name" , value = "name值 长度1-50" , dataType = "String" , required = true , paramType = "query")
    @RequestMapping(value = "/hello" , method = RequestMethod.GET )
    public String hello(String name){
        return "测试";
    }
}
