package com.example.zcj.mvpdemo.model;

import com.example.zcj.mvpdemo.bean.User;

/**
 * Created by zcj on 2016/10/3.
 */
public class UserModel implements IUserModel {
    private String firstName;
    private String lastName;

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //使用对象装载数据，作为外界获取数据的一个通道 而不是直接从model中获取数据
    @Override
    public User load() {
        User user= new User(firstName,lastName);
        return user;
    }

}
