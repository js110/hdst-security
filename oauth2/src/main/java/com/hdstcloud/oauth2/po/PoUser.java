
package com.hdstcloud.oauth2.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@TableName("user")
public class PoUser {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 账号
     * 
     */
    @TableField("account")
    private String account;
    /**
     * 用户名
     * 
     */
    @TableField("username")
    private String username;
    /**
     * 密码
     * 
     */
    @TableField("password")
    private String password;
    /**
     * 手机号
     * 
     */
    @TableField("phone")
    private String phone;
    /**
     * 邮箱
     * 
     */
    @TableField("email")
    private String email;
    /**
     * 生日
     * 
     */
    @TableField("birthday")
    private LocalDate birthday;
    /**
     * 性别
     * 
     */
    @TableField("sex")
    private String sex;
    /**
     * 创建时间
     * 
     */
    @TableField("create_time")
    private LocalDateTime createTime;
    /**
     * 用户状态
     * 
     */
    @TableField("status")
    private String status;
    /**
     * 详细地址
     * 
     */
    @TableField("address")
    private String address;
    /**
     * 备注
     * 
     */
    @TableField("remark")
    private String remark;
    /**
     * 工作状态
     * 
     */
    @TableField("work_status")
    private String workStatus;
    /**
     * 用户签名
     * 
     */
    @TableField("token")
    private String token;
    /**
     * 来自organization_position的外键
     * 
     */
    @TableField("organization_position_id")
    private Long organizationPositionId;

    public PoUser() {
    }

}
