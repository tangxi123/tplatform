package com.tserve.point;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {
    @Pointcut("execution(** com.tserve.point.ConcertPerformance.perform(..))")
    public void performance1(){}

    @Around("performance1()")
    public void watchPerformance(ProceedingJoinPoint jp){
        try{
            System.out.println("Silencing cell phones");
            System.out.println("Taking seats");
            jp.proceed();
            System.out.println("CLAP CLAP CLAP!!!");
        }catch (Throwable e){
            System.out.println("Demanding a refund");
        }
    }

//    @Before("performance1()")
//    public void silenceCellPhones(){
//        System.out.println("Silencing cell phones");
//    }
//
//    @Before("performance1()")
//    public void takeSeats(){
//        System.out.println("Taking seats");
//    }
//
//    @AfterReturning("performance1()")
//    public void applause(){
//        System.out.println("CLAP CLAP CLAP!!!");
//    }
//
//    @AfterThrowing("performance1()")
//    public void demandRefund(){
//        System.out.println("Demanding a refund");
//    }


}
