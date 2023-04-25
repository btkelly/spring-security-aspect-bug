package com.example.demo

import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.springframework.security.config.web.server.ServerHttpSecurity
import org.springframework.stereotype.Component

@Aspect
@Component
class AspectTest {

    @Before(
        "execution(public * org.springframework.security.config.web.server.ServerHttpSecurity.authorizeExchange()) " +
            "&& target(serverHttpSecurity)"
    )
    fun updateServerHttpSecurity(serverHttpSecurity: ServerHttpSecurity) {
        println("We are here $serverHttpSecurity")
    }
}