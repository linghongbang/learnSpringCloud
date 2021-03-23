package com.atguigu.myRule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
//        return new RandomRule();//随机算法
        return new RandomRule_ZY();//自定义算法一台调用5次再切换
    }
}
