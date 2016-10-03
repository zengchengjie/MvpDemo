package com.example.zcj.mvpdemo.view.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.zcj.mvpdemo.R;
import com.example.zcj.mvpdemo.presenter.Presenter;

/**
 * Created by zcj on 2016/10/3.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener, IUserView {
    private Button button_save;
    private Button button_load;

    private EditText editText_firstName;
    private EditText editText_lastName;
    private Presenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        presenter = new Presenter(this);
    }

    private void initView() {
        button_save = (Button) findViewById(R.id.save);
        button_load = (Button) findViewById(R.id.load);
        button_save.setOnClickListener(this);
        button_load.setOnClickListener(this);
        editText_firstName = (EditText) findViewById(R.id.first);
        editText_lastName = (EditText) findViewById(R.id.last);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.save:
                presenter.savaUser(getFirstName(), getLastName());
                break;
            case R.id.load:
                presenter.loadUser();
                break;
        }
    }


    @Override
    public String getFirstName() {
        return editText_firstName.getText().toString();
    }

    @Override
    public String getLastName() {
        return editText_lastName.getText().toString();
    }

    @Override
    public void setFirstName(String firstName) {

        editText_firstName.setText("first" + firstName);
    }

    @Override
    public void setLastName(String lastName) {
        editText_lastName.setText("last" + lastName);
    }
}
