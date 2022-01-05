## 1.引入jar包
spring-boot-starter-data-jpa
## 2.配置application.yml数据源
## 3.写实体类，可以生成数据库表
## 4.增加接口实现Repository接口或者其子接口，就可以直接使用一些默认方法
## 5.Repository
1.是空接口，标记接口，没有方法  
2.只要实现了Repository或者其子接口，就会被Spring纳入容器管理，不需要加额外的注解  
3.如果没有实现上面接口，则需要用注解@RepositoryDefination  
4.子接口有CrudRepository,PagingAndSortingRepository...  
5.可以自定义SQL,使用@Query注解,也可以用原生的SQL  
6.CRUD需要用@Transactional+@Query+@Modifying  
7.也可以用CrudRepository来实现更新删除等操作  
8.查询条件，分页，排序可以用JpaSpecificationExecutor
