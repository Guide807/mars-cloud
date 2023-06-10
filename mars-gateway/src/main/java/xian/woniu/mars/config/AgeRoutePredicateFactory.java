package xian.woniu.mars.config;

import org.apache.commons.lang.StringUtils;
import org.springframework.cloud.gateway.handler.predicate.AbstractRoutePredicateFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author ：Gary Wang
 * @date ：Created By 2023/6/10
 */
@Component
public class AgeRoutePredicateFactory extends AbstractRoutePredicateFactory<AgeRoutePredicateFactory.Config> {
    public AgeRoutePredicateFactory() {
        super(AgeRoutePredicateFactory.Config.class);
    }
    @Override
    public Predicate<ServerWebExchange> apply(AgeRoutePredicateFactory.Config config) {
        return  new Predicate<ServerWebExchange>(){
            @Override
            public boolean test(ServerWebExchange serverWebExchange) {
                //接收age请求参数
                String ageStr = serverWebExchange.getRequest().getQueryParams().getFirst("age");
                //如果不为空，则进行路由逻辑判断
                if(StringUtils.isNotEmpty(ageStr)){
                    int age = Integer.parseInt(ageStr);
                    return age>config.getMinAge() && age<config.getMaxAge();
                }
                return false;
            }
        };
    }

    //读取配置文件的参数，并封装到Config内部类对象中
    @Override
    public List<String> shortcutFieldOrder() {
        //该集合中元素的顺序，必须和配置文件中文件的顺序一致
        return Arrays.asList("minAge","maxAge");
    }
    //该类用于封装配置文件中对应的参数
    public static class Config{

        private int minAge;
        private int maxAge;

        public int getMaxAge() {
            return maxAge;
        }
        public void setMaxAge(int maxAge) {
            this.maxAge = maxAge;
        }
        public int getMinAge() {
            return minAge;
        }
        public void setMinAge(int minAge) {
            this.minAge = minAge;
        }
    }
}
