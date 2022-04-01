package org.bwf.study.config;

import org.bwf.study.dao.UserInfoMapper;
import org.bwf.study.interceptor.IdentityInter;
import org.bwf.study.util.RedisUntil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

//拦截器的配置
@Configuration
@Component
public class IntercepterConfig implements WebMvcConfigurer {

    @Resource
    private IdentityInter identityInter;

    public void addCorsMapping (CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedHeaders("*")
                .allowedMethods("*")
                .allowedOrigins("*");
    }

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", addcorsConfig());
        return new CorsFilter(source);
    }
    private CorsConfiguration addcorsConfig() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        List<String> list = new ArrayList<>();
        list.add("*");
        corsConfiguration.setAllowedOrigins(list);
    /*
    // 请求常用的三种配置，*代表允许所有，当时你也可以自定义属性（比如header只能带什么，只能是post方式等等）
    */
        corsConfiguration.addAllowedOrigin("*");
        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.addAllowedMethod("*");
        return corsConfiguration;
    }

    //需要拦截的地方
    public void addInterceptors (InterceptorRegistry registry){
        //这里是添加拦截器的方法，拦截器的名字叫 IdentityInter  ，拦截的路径是以 /val开头的所有路径
//        registry.addInterceptor(new IdentityInter()).addPathPatterns("/val/**");
        registry.addInterceptor(identityInter).addPathPatterns("/val/**");
    }
}
