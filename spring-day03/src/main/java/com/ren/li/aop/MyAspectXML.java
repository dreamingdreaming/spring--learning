package com.ren.li.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.w3c.dom.ProcessingInstruction;

/**
 * 切面类
 *
 * 增强的方法 都分装到这一个类里面
 * @author renl
 * @date 2018-11-28
 */
public class MyAspectXML {

    /*前置通知*/
    public void checkPri(){
        System.out.println("权限校验！");
    }
    /*后置通知*/
    public void log(String result){
        System.out.println("logging");
        System.out.println(result);
    }

    /**
     * 性能监控
     * 环绕通知
     * @return
     */
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前通知===========");
        /*相当于执行目标程序*/
        Object proceed = joinPoint.proceed();
        System.out.println("环绕后通知==============");

        return proceed;
    }

    /*异常抛出通知*/
    public void afterThrowing(Throwable rx){
        System.out.println("异常抛出通知==========="+rx.getMessage());
    }

    /*最终通知：相当于finally代码块中内容*/
    public void after(){
        System.out.println("最终异常=============");
    }
}
