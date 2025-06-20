package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 商家用户：(MerchantUsers)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "MerchantUsers")
public class MerchantUsers implements Serializable {

    // MerchantUsers编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "merchant_users_id")
    private Integer merchant_users_id;

    // 商家名称
    @Basic
    private String merchant_name;
    // 商家地址
    @Basic
    private String merchant_address;
    // 营业执照
    @Basic
    private String business_license;



    // 审核状态
    @Basic
    private String examine_state;









    // 用户编号
    @Id
    @Column(name = "user_id")
    private Integer userId;


    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
