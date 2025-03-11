package com.jobhunter.admin.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jobhunter.admin.dao.entity.UserDO;
import com.jobhunter.admin.dao.mapper.UserMapper;
import com.jobhunter.admin.dto.resp.UserRespDTO;
import com.jobhunter.admin.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * 用户接口实现层
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO>implements UserService {

    @Override
    public UserRespDTO getUserByUsername(String username) {
        LambdaQueryWrapper<UserDO> queryWrapper = Wrappers.lambdaQuery(UserDO.class)
                .eq(UserDO::getUsername,username);
        UserDO userDO = baseMapper.selectOne(queryWrapper);
        if (userDO == null) {
            // 若查询结果为空，返回 null，调用者可根据返回值判断是否存在该用户
            //throw new ClientException(UserErrorCodeEnum.USER_NULL);
            return null;
        }
        UserRespDTO result = new UserRespDTO();
        BeanUtils.copyProperties(userDO,result);
        return result;
    }
}
