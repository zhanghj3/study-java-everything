package com.yancheng.entity;


import com.yancheng.enums.CountryEnum;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * 1) 默认会将驼峰的字段名转成下划线
 * 2) @Table可以指定生成的表明
 * 3) @Column可以指定数据库的字段名,长度,不为空啥的
 * 4) @Enumerated(EnumType.STRING)插入数据库的是varchar
 */
@Entity
@Table(name = "jpa_user")
public class Route {
    @Id
    @GeneratedValue()
    private Integer id;
    @Column(name="route_id",length = 40)
    private String routeId;
    @Enumerated(EnumType.STRING)
    private CountryEnum routeCountry;
    @CreationTimestamp
    private LocalDateTime createTime;

    @Override
    public String toString() {
        return "Route{" +
                "id=" + id +
                ", routeId='" + routeId + '\'' +
                ", routeCountry=" + routeCountry +
                ", createTime=" + createTime +
                '}';
    }

    public Route(String routeId, CountryEnum routeCountry, LocalDateTime createTime) {
        this.routeId = routeId;
        this.routeCountry = routeCountry;
        this.createTime = createTime;
    }

    public Route(){

    }
}
