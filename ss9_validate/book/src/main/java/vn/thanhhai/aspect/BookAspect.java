//package vn.thanhhai.aspect;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.After;
//import org.aspectj.lang.annotation.Aspect;
//import org.springframework.stereotype.Component;
//
//@Aspect
//@Component
//public class BookAspect {
//
//    @After("execution(* vn.thanhhai.controller.BookController.oder(..))")
//    public void logAfterMethodBookController(JoinPoint joinPoint){
//        String oderMethod = joinPoint.getSignature().getName();
//        System.out.println("é"+ oderMethod + "sai");
//    }
//
//}
