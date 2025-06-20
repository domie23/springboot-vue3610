package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 退房信息：(CheckOutInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "CheckOutInformation")
public class CheckOutInformation implements Serializable {

    // CheckOutInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "check_out_information_id")
    private Integer check_out_information_id;

    // 预定号
    @Basic
    private String reservation_no;
    // 管理编号
    @Basic
    private String management_no;
    // 民宿名称
    @Basic
    private String name_of_home_stay;
    // 房间类型
    @Basic
    private String room_type;
    // 民宿规格
    @Basic
    private String home_stay_specifications;
    // 房间单价
    @Basic
    private Integer room_price;
    // 商家用户
    @Basic
    private Integer merchant_users;
    // 商家名称
    @Basic
    private String merchant_name;
    // 商家地址
    @Basic
    private String merchant_address;
    // 普通用户
    @Basic
    private Integer ordinary_users;
    // 预定数量
    @Basic
    private Integer scheduled_quantity;
    // 预定天数
    @Basic
    private Integer scheduled_days;
    // 支付金额
    @Basic
    private String payment_amount;
    // 预定日期
    @Basic
    private Timestamp scheduled_date;
    // 退房日期
    @Basic
    private Timestamp check_out;
    // 备注
    @Basic
    private String remarks;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
