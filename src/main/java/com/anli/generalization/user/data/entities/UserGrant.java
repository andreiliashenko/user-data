package com.anli.generalization.user.data.entities;

import java.math.BigInteger;

public interface UserGrant {

    BigInteger getId();

    String getDescription();

    void setDescription(String description);
}
