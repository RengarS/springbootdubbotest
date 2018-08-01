package com.aries.provider.repository;

import com.aries.entitys.UserDO;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository extends BaseMapper<UserDO> {
}
