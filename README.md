# SpringBoot + SpringSecurity + Jwt权限验证
-设计了一个用户表，一个角色表，用户对应多个角色。
-成功登陆后会签发一个带有身份信息的Token。 
-创建一个Token的过滤器，用户每次请求时会对Token进行处理。（验证身份，放行，没登录的话会被拦截）




