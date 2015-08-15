package com.anli.generalization.user.data.access;

import com.anli.generalization.user.data.entities.UserGroup;
import java.math.BigInteger;

public interface UserGroupProvider {

    UserGroup create();

    UserGroup getById(BigInteger id);

    void remove(UserGroup group);
}
