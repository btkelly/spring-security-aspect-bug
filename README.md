# Spring Boot Aspect Bug

This is a sample application for a Spring Boot bug report related to creating and Aspect around Spring security class `ServerHttpSecurity`.

This occurs on startup and can be reproduced by simply running the app via `./gradlew bootRun`. You should receive a startup error with the following stacktrace.

```java
Caused by: java.lang.IllegalArgumentException: No visible constructors in class org.springframework.security.config.annotation.web.reactive.ServerHttpSecurityConfiguration$ContextAwareServerHttpSecurity
	at org.springframework.cglib.core.ClassLoaderAwareGeneratorStrategy.generate(ClassLoaderAwareGeneratorStrategy.java:57) ~[spring-core-6.0.8.jar:6.0.8]
	at org.springframework.cglib.core.AbstractClassGenerator.generate(AbstractClassGenerator.java:362) ~[spring-core-6.0.8.jar:6.0.8]
	at org.springframework.cglib.proxy.Enhancer.generate(Enhancer.java:575) ~[spring-core-6.0.8.jar:6.0.8]
	at org.springframework.cglib.core.AbstractClassGenerator$ClassLoaderData.lambda$new$1(AbstractClassGenerator.java:103) ~[spring-core-6.0.8.jar:6.0.8]
	at org.springframework.cglib.core.internal.LoadingCache.lambda$createEntry$1(LoadingCache.java:52) ~[spring-core-6.0.8.jar:6.0.8]
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264) ~[na:na]
	at org.springframework.cglib.core.internal.LoadingCache.createEntry(LoadingCache.java:57) ~[spring-core-6.0.8.jar:6.0.8]
	at org.springframework.cglib.core.internal.LoadingCache.get(LoadingCache.java:34) ~[spring-core-6.0.8.jar:6.0.8]
	at org.springframework.cglib.core.AbstractClassGenerator$ClassLoaderData.get(AbstractClassGenerator.java:126) ~[spring-core-6.0.8.jar:6.0.8]
	at org.springframework.cglib.core.AbstractClassGenerator.create(AbstractClassGenerator.java:313) ~[spring-core-6.0.8.jar:6.0.8]
	at org.springframework.cglib.proxy.Enhancer.createHelper(Enhancer.java:562) ~[spring-core-6.0.8.jar:6.0.8]
	at org.springframework.cglib.proxy.Enhancer.createClass(Enhancer.java:407) ~[spring-core-6.0.8.jar:6.0.8]
	at org.springframework.aop.framework.ObjenesisCglibAopProxy.createProxyClassAndInstance(ObjenesisCglibAopProxy.java:62) ~[spring-aop-6.0.8.jar:6.0.8]
	at org.springframework.aop.framework.CglibAopProxy.buildProxy(CglibAopProxy.java:213) ~[spring-aop-6.0.8.jar:6.0.8]
	... 36 common frames omitted
```