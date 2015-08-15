package com.anli.generalization.user.data.access;

import com.anli.generalization.user.data.entities.User;
import java.math.BigInteger;

public interface UserProvider {

    User create();

    User getById(BigInteger id);

    User getByLogin(String login);

    boolean loginExists(String login);

    void remove(User user);
}
