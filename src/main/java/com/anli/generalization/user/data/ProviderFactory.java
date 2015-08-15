package com.anli.generalization.user.data;

import com.anli.generalization.user.data.access.UserGrantProvider;
import com.anli.generalization.user.data.access.UserGroupProvider;
import com.anli.generalization.user.data.access.UserProvider;

public interface ProviderFactory {

    UserGrantProvider getUserGrantProvider();

    UserGroupProvider getUserGroupProvider();

    UserProvider getUserProvider();
}
