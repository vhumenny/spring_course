package com.vladimirgumennyi.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.vladimirgumennyi.spring.aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
