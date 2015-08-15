package com.anli.generalization.user.data.access;

import com.anli.generalization.user.data.entities.UserGrant;
import java.math.BigInteger;

public interface UserGrantProvider {

    UserGrant create(BigInteger id);

    UserGrant getById(BigInteger id);

    void remove(UserGrant grant);
}
