package cn.ksling.examination.config;

import cn.ksling.examination.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("/login");
        registry.addViewController("/login").setViewName("/login");
        registry.addViewController("/login.html").setViewName("/login");
        registry.addViewController("/index.html").setViewName("/login");
        registry.addViewController("/noPermission").setViewName("/noPermission");
    }

    @Bean
    public LoginInterceptor loginInterceptor() {
        return new LoginInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor()).addPathPatterns("/admin/**");
        registry.addInterceptor(loginInterceptor()).addPathPatterns("/user/**");
        registry.addInterceptor(loginInterceptor()).addPathPatterns("/print");
        registry.addInterceptor(loginInterceptor()).addPathPatterns("/upload");
    }
}
