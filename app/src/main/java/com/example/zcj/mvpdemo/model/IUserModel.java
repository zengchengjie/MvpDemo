package com.example.zcj.mvpdemo.model;

import com.example.zcj.mvpdemo.bean.User;

/**
 * Created by zcj on 2016/10/3.
 */
public interface IUserModel {
    void setFirstName(String firstName);

    void setLastName(String lastName);

    User load();

}
