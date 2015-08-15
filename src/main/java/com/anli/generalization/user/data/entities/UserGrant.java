package com.anli.generalization.user.data.entities;

import java.math.BigInteger;

public interface UserGrant {

    BigInteger MIN_GRANT_ID = BigInteger.valueOf(2000000000000000000L);
    BigInteger MAX_GRANT_ID = BigInteger.valueOf(2000000000000999999L);

    BigInteger getId();

    String getDescription();

    void setDescription(String description);
}
