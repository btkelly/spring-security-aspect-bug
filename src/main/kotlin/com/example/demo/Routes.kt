package com.example.demo

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.EnableAspectJAutoProxy
import org.springframework.security.config.web.server.ServerHttpSecurity
import org.springframework.security.web.server.SecurityWebFilterChain

@Configuration
@EnableAspectJAutoProxy
class Routes {

    @Bean
    fun securityTest(serverHttpSecurity: ServerHttpSecurity): SecurityWebFilterChain {
        serverHttpSecurity
            .authorizeExchange()
            .anyExchange().authenticated()
            .and().httpBasic()
            .and().formLogin();
        return serverHttpSecurity.build();
    }

}