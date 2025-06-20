package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 房间类型：(RoomType)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "RoomType")
public class RoomType implements Serializable {

    // RoomType编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_type_id")
    private Integer room_type_id;

    // 房间类型
    @Basic
    private String room_type;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
