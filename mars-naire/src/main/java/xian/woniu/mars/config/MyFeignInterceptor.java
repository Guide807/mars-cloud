package xian.woniu.mars.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.stereotype.Component;

/**
 * @author ：Gary Wang
 * @date ：Created By 2023/6/8
 */
@Component
public class MyFeignInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate requestTemplate) {
        // 在请求头中添加一个foo，值为haha
        requestTemplate.header("foo", "haha");
    }
}
