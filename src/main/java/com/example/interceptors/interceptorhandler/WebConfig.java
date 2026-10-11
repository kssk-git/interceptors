package com.example.interceptors.interceptorhandler;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer  {

    public LoggingInterceptors loggingInterceptors;
    public AuthorizeInterceptors authorizeInterceptors;
    public AuthenticationInterceptors authenticationInterceptors;

    public WebConfig(AuthorizeInterceptors authorizeInterceptors, LoggingInterceptors loggingInterceptors, AuthenticationInterceptors authenticationInterceptors) {
        this.authorizeInterceptors = authorizeInterceptors;
        this.loggingInterceptors = loggingInterceptors;
        this.authenticationInterceptors = authenticationInterceptors;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(loggingInterceptors).order(2);
        registry.addInterceptor(authorizeInterceptors).order(3);
        registry.addInterceptor(authenticationInterceptors).order(1)
                .addPathPatterns("/api/students");

    }




}
