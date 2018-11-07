package com.rollean.zb.web.interceptor;

import com.rollean.zb.common.annotation.NoLogin;
import com.rollean.zb.domain.User;
import org.springframework.lang.Nullable;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.resource.ResourceHttpRequestHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by rollean.
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if(handler instanceof ResourceHttpRequestHandler){
            return true;
        }

        HandlerMethod method = (HandlerMethod) handler;
        Class<?> controllerType = method.getBeanType();

        if(method.getMethodAnnotation(NoLogin.class) != null || controllerType.getAnnotation(NoLogin.class) != null){
            return true;
        }


        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("loginUser");
        if(user != null ){
            return true;
        }

        response.sendRedirect("/home/index");
        return false;

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {

    }
}
