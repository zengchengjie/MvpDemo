package com.example.zcj.mvpdemo.presenter;

import android.util.Log;
import android.widget.Toast;

import com.example.zcj.mvpdemo.bean.User;
import com.example.zcj.mvpdemo.model.IUserModel;
import com.example.zcj.mvpdemo.model.UserModel;
import com.example.zcj.mvpdemo.view.activity.IUserView;

/**
 * Created by zcj on 2016/10/3.
 */
public class Presenter {
    private IUserModel iUserModel;
    private IUserView iUserView;

    public Presenter(IUserView iUserView) {
        this.iUserView = iUserView;
        iUserModel = new UserModel();
    }

    //通过model的实例，将数据传入 最终以user对象的方式存储数据
    public void savaUser(String firstName, String lastName) {
        iUserModel.setFirstName(firstName);
        Log.d("test","firstName"+firstName);
        iUserModel.setLastName(lastName);
        Log.d("test", "lastName"+lastName);
    }

    //view层将数据从通过load方法将user对象中取出来
    public void loadUser() {
        User user = iUserModel.load();

        iUserView.setFirstName(user.getFirstName());
        iUserView.setLastName(user.getLastName());
    }
}
