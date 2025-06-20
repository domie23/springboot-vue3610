package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 民宿信息：(HomeStayInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "HomeStayInformation")
public class HomeStayInformation implements Serializable {

    // HomeStayInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "home_stay_information_id")
    private Integer home_stay_information_id;

    // 管理编号
    @Basic
    private String management_no;
    // 民宿名称
    @Basic
    private String name_of_home_stay;
    // 民宿封面
    @Basic
    private String home_stay_cover;
    // 房间类型
    @Basic
    private String room_type;
    // 民宿规格
    @Basic
    private String home_stay_specifications;
    // 房间单价
    @Basic
    private Integer room_price;
    // 房间数量
    @Basic
    private Integer number_of_rooms;
    // 民宿详情
    @Basic
    private String home_stay_details;
    // 商家用户
    @Basic
    private Integer merchant_users;
    // 商家名称
    @Basic
    private String merchant_name;
    // 商家地址
    @Basic
    private String merchant_address;

    // 点击数
    @Basic
    private Integer hits;

    // 点赞数
    @Basic
    private Integer praise_len;












    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
