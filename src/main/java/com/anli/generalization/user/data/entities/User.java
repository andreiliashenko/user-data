package com.anli.generalization.user.data.entities;

import java.math.BigInteger;
import java.util.Collection;

public interface User {

    BigInteger getId();
    
    String getName();
    
    void setName(String name);
    
    String getLogin();
    
    void setLogin(String login);
    
    void setPassword(String password);
    
    boolean checkPassword(String password);
    
    Collection<UserGroup> getUserGroups();
}
