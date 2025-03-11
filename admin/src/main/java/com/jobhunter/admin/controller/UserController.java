package com.jobhunter.admin.controller;

import cn.hutool.core.bean.BeanUtil;
import com.jobhunter.admin.common.convention.result.Result;
import com.jobhunter.admin.common.convention.result.Results;
import com.jobhunter.admin.dto.resp.UserActualRespDTO;
import com.jobhunter.admin.dto.resp.UserRespDTO;
import com.jobhunter.admin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户管理控制层
 */
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    /**
     *根据用户名查询用户信息
     */
    @GetMapping("/api/job-hunter/admin/v1/user/{username}")
    public Result<UserRespDTO> getUserByUsername(@PathVariable("username") String  username){
        return Results.success(userService.getUserByUsername(username));
    }

    /**
     *根据用户名查询无脱敏用户信息
     */
    @GetMapping("/api/job-hunter/admin/v1/actual/user/{username}")
    public Result<UserActualRespDTO> getActualUserByUsername(@PathVariable("username") String  username){
        return Results.success(BeanUtil.toBean(userService.getUserByUsername(username), UserActualRespDTO.class));
    }
}
