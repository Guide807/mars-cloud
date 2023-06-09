package xian.woniu.mars.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：Gary Wang
 * @date ：Created By 2023/6/7
 */
@Configuration
public class RestTemplateConfig {
    @Bean
    @LoadBalanced//注意必须加
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
