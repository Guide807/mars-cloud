package xian.woniu.mars.config;

/**
 * @author ：Gary Wang
 * @date ：Created By 2023/6/10
 */
//@Component
//public class AuthGlobalFilter implements GlobalFilter, Ordered {
//
//    // 过滤器逻辑
//    @Override
//    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//        // 统一鉴权逻辑
//        String token = exchange.getRequest().getQueryParams().getFirst("token");
//        if (!StringUtils.equals("admin", token)) {
//            // 认证失败
//            System.out.println("认证失败");
//            exchange.getResponse()    .setStatusCode(HttpStatus.UNAUTHORIZED);
//            return exchange.getResponse().setComplete();
//        }
//
//        // 放行
//        return chain.filter(exchange);
//    }
//
//    // 标识当前过滤器的优先级，返回的数字越小，优先级越高
//    @Override
//    public int getOrder() {
//        return 0;
//    }
//}
