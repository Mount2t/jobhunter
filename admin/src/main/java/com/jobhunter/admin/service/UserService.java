package com.jobhunter.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jobhunter.admin.dao.entity.UserDO;
import com.jobhunter.admin.dto.resp.UserRespDTO;

/**
 * 用户接口层
 */
public interface UserService extends IService<UserDO> {

    /**
     * 根据用户名查询用户信息
     *
     * @param username 用户名
     * @return 用户返回实体
     */
    UserRespDTO getUserByUsername(String username);
}
