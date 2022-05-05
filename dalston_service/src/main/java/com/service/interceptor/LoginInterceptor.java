package com.service.interceptor;

import com.service.annotation.LoginRequired;
import lombok.extern.log4j.Log4j;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description: 登录拦截器
 * @Title: LoginInterceptor
 * @Package com.service.interceptor
 * @Author: LiBing
 * @Copyright 版权归个人所有
 * @CreateTime: 2022/5/5 9:35
 */
@Log4j
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        log.info("LoginInterceptor 进入登录拦截器");

        HandlerMethod handlerMethod  = (HandlerMethod) handler;
        if(handlerMethod.getMethod().isAnnotationPresent(LoginRequired.class)){
            LoginRequired loginRequired = handlerMethod.getMethod().getAnnotation(LoginRequired.class);
            // 有LoginRequired注解说明需要登录，提示用户登录
            response.setContentType("application/json; charset=utf-8");
            response.getWriter().print("你访问的资源需要登录");
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
