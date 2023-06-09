package xian.woniu.mars.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;

public class MyLoadBalanceRule extends AbstractLoadBalancerRule {

    private int i;

    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }

    public Server choose(Object o) {
        ILoadBalancer loadBalancer = getLoadBalancer();
        List<Server> servers = loadBalancer.getAllServers();
        Server sever = servers.get(i++/3%servers.size());
        return sever;
    }
}
