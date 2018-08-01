package com.aries.entitys;

import java.util.List;

public interface UserService {
    UserDO get(String id);

    List<UserDO> list();

    Boolean insert(UserDO userDO);
}
