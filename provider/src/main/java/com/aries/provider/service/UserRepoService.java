package com.aries.provider.service;


import com.aries.entitys.UserDO;
import com.aries.provider.repository.UserRepository;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class UserRepoService extends ServiceImpl<UserRepository, UserDO> {
}
