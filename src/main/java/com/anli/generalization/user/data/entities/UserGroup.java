package com.anli.generalization.user.data.entities;

import java.math.BigInteger;
import java.util.Collection;

public interface UserGroup {

    BigInteger getId();

    String getName();

    void setName(String name);

    UserGroup getParent();

    void setParent(UserGroup parent);

    Collection<UserGroup> getChildren();

    Collection<UserGrant> getGrants(boolean hierarchically);

    Collection<UserGrant> getGrants();

    Collection<User> getUsers();

    void addUser(User user);

    void removeUser(User user);
}
