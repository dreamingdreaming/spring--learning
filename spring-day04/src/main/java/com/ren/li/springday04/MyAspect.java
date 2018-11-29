package com.ren.li.springday04;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 切面类
 *
 * @author renl
 * @date 2018-11-29
 */
@Aspect
public class MyAspect {
    @Pointcut(value = "execution(* com.ren.li.springday04.OrderDemo.update(..))")
    /*等于给切入点 取了一个id*/
    private void pointcut1(){}


    @Before(value = "execution(* com.ren.li.springday04.OrderDemo.save(..))")
    public void before(){
        System.out.println("前置增强");
    }

    @AfterReturning( returning = "result", value = "execution(* com.ren.li.springday04.OrderDemo.delete(..))" )
    public void after(Object result){
        System.out.println("后置增强" +  result);
    }

    @Around(value = "MyAspect.pointcut1()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前增强");
        Object proceed = joinPoint.proceed();
        System.out.println("环绕后增强");
        return proceed;
    }
}
