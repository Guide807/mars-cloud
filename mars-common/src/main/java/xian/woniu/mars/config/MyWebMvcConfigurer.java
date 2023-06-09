package xian.woniu.mars.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author ：Gary Wang
 * @date ：Created By 2023/6/8
 */
@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer {
    //解决跨域问题
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")//允许所有的请求路径访问跨域资源
                .allowedOrigins("*")//允许所有的请求域名访问跨域资源
                .allowedHeaders("*")//允许所有的请求头访问跨域资源
                .allowedMethods("*");//允许所有的请求方法访问跨域资源
    }
}
