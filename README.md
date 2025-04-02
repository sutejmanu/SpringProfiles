Two ways to call profiles
1. using properties file (spring.profile.active=dev or uat or prod)
2. using @Profile Annotation (use @Bean , so that bean will injected based on active profile)

port number 9090

In this example i have tried both
http://localhost:9090/valueFromProps

http://localhost:9090/valueFromProfileAnnotation
