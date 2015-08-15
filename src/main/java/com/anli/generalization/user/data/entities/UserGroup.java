package com.anli.generalization.user.data.entities;

import java.math.BigInteger;
import java.util.Collection;

public interface UserGroup {

    BigInteger getId();

    String getName();

    void setName(String name);

    UserGroup getParent();

    Collection<UserGroup> getChildren();

    void addChild(UserGroup child);

    void removeChild(UserGroup child);

    Collection<UserGrant> getGrants(boolean hierarchically);

    Collection<UserGrant> getGrants();

    Collection<User> getUsers();

    void addUser(User user);

    void removeUser(User user);
}
