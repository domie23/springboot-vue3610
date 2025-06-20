package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 咨询信息：(ConsultationInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "ConsultationInformation")
public class ConsultationInformation implements Serializable {

    // ConsultationInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "consultation_information_id")
    private Integer consultation_information_id;

    // 民宿名称
    @Basic
    private String name_of_home_stay;
    // 房间类型
    @Basic
    private String room_type;
    // 民宿规格
    @Basic
    private String home_stay_specifications;
    // 商家用户
    @Basic
    private Integer merchant_users;
    // 商家名称
    @Basic
    private String merchant_name;
    // 商家地址
    @Basic
    private String merchant_address;
    // 咨询用户
    @Basic
    private Integer consult_users;
    // 咨询内容
    @Basic
    private String consultation_content;
    // 咨询日期
    @Basic
    private Timestamp consultation_date;



    // 审核状态
    @Basic
    private String examine_state;








    // 审核回复
    @Basic
    private String examine_reply;



    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
