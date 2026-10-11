package com.example.interceptors.interceptorhandler;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class LoggingInterceptors implements HandlerInterceptor {
@Override
public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object Handler){
    HandlerMethod method = (HandlerMethod) Handler;
    System.out.println(request.getMethod());
//    System.out.println(request.getRequestURI());
    System.out.println(method.getMethod().getName());



    return true;
 }
 @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response,
                                      Object handle,ModelAndView modelAndView){



 }

    @Override
    public void afterCompletion(HttpServletRequest request,HttpServletResponse response,Object handle,Exception e){

 }
}
