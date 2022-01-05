## 一、需要注意的问题
1.springboot+flyway,必须要用springboot-jdbc这个包，这样才会加载flyway的配置  
2.flyway的版本可能跟springboot冲突，所以最好使用dependencyManagement去管理jar包，这样就不会冲突了  
3.数据库会生成一个flyway_schema_history的表，用来每次启动校验db.migration里面的脚本，如果有新的就会执行，如果旧的被改动了，就会启动报错