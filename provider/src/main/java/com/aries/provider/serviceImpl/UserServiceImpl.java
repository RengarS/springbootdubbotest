package com.aries.provider.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.aries.entitys.UserDO;
import com.aries.entitys.UserService;
import com.aries.provider.service.UserRepoService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepoService userRepoService;

    @Override
    public UserDO get(String id) {
        return userRepoService.selectById(id);
    }

    @Override
    public List<UserDO> list() {
        return userRepoService.selectList(new EntityWrapper<UserDO>()
                .where("1=1"));
    }

    @Override
    public Boolean insert(UserDO userDO) {
        return userRepoService.insert(userDO);
    }
}
