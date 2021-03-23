package com.atguigu.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration//相当于applicationContext.xml.bean方法注入
public class ConfigBean {

    @Bean
    @LoadBalanced//开启负载均衡
    public RestTemplate getRestTemplate(){

        return new RestTemplate();
    }

    @Bean
    public IRule myRule(){
//        return new RandomRule();//用随机算法替代默认的轮询
        return new RoundRobinRule();//轮询

    }
}
