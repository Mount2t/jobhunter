package com.jobhunter.admin.dto.resp;


import lombok.Data;

/**
 *用户返回参数响应
 */
@Data
public class UserActualRespDTO {
    /**
     * id
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 电话号码
     */
    private String phone;

    /**
     * 邮箱
     */
    private String mail;

    /**
     * 用户角色
     */
    private String role;
}
