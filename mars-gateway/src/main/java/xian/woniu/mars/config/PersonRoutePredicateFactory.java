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
@Component//自定义断言myname=zhangsan
public class PersonRoutePredicateFactory  extends AbstractRoutePredicateFactory<PersonRoutePredicateFactory.Config> {
    public PersonRoutePredicateFactory() {
        super(PersonRoutePredicateFactory.Config.class);
    }
    @Override
    public Predicate<ServerWebExchange> apply(PersonRoutePredicateFactory.Config config) {
        return  new Predicate<ServerWebExchange>(){
            @Override
            public boolean test(ServerWebExchange serverWebExchange) {
                //接收age请求参数
                String nameStr = serverWebExchange.getRequest().getQueryParams().getFirst("myname");
                //如果不为空，则进行路由逻辑判断
                if(StringUtils.isNotEmpty(nameStr)){
                    return nameStr.equals("zhangsan");
                }
                return false;
            }
        };
    }

    //读取配置文件的参数，并封装到Config内部类对象中
    @Override
    public List<String> shortcutFieldOrder() {
        //该集合中元素的顺序，必须和配置文件中文件的顺序一致
        return Arrays.asList("name");
    }
    //该类用于封装配置文件中对应的参数
    public static class Config{
        private String name;

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }
}
