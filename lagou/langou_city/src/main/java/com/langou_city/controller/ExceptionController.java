package com.langou_city.controller;

import com.lagou.lagou_common.entity.Result;
import com.lagou.lagou_common.entity.StatusCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ControllerAdvice注解是Spring3.2中新增的注解，学名是Controller增强器，作用是给Controller控制器添加统一的操作或处理。
 *
 * 对于@ControllerAdvice，我们比较熟知的用法是结合@ExceptionHandler用于全局异常的处理，但其作用不止于此。ControllerAdvice拆开来就是Controller Advice，
 * 关于Advice，在Spring的AOP中，是用来封装一个切面所有属性的，包括切入点和需要织入的切面逻辑。这里ControllerAdvice也可以这么理解，
 * 其抽象级别应该是用于对Controller进行切面环绕的，而具体的业务织入方式则是通过结合其他的注解来实现的。@ControllerAdvice是在类上声明的注解，
 * 其用法主要有三点：
 *
 * 1.结合方法型注解@ExceptionHandler，用于捕获Controller中抛出的指定类型的异常，从而达到不同类型的异常区别处理的目的。
 *
 * 2.结合方法型注解@InitBinder，用于request中自定义参数解析方式进行注册，从而达到自定义指定格式参数的目的。
 *
 * 3.结合方法型注解@ModelAttribute，表示其注解的方法将会在目标Controller方法执行之前执行。
 *
 * 从上面的讲解可以看出，@ControllerAdvice的用法基本是将其声明在某个bean上，然后在该bean的方法上使用其他的注解来指定不同的织入逻辑。
 * 不过这里@ControllerAdvice并不是使用AOP的方式来织入业务逻辑的，而是Spring内置对其各个逻辑的织入方式进行了内置支持。
 */
@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(Exception.class)//程序发生错误后
    @ResponseBody //也可以返回页面
    public Result error(Exception e){
        return new Result(false, StatusCode.ACCESSERROR,"服务器忙",e.getMessage());
    }
}
