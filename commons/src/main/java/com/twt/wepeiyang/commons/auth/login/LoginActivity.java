package com.twt.wepeiyang.commons.auth.login;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.orhanobut.hawk.Hawk;
import com.trello.rxlifecycle.components.support.RxAppCompatActivity;
import com.twt.wepeiyang.commons.R;
import com.twt.wepeiyang.commons.databinding.ActivityLoginBinding;

import java.util.logging.Handler;


/**
 * Created by retrox on 2016/11/27.
 */

public class LoginActivity extends RxAppCompatActivity {
    private static final String IS_LOGIN = "is_login";
    private static final String IS_KNOW_GPA_USAGE = "isknowgpausage";
    private static final String TOKEN = "token";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLoginBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_login);

        binding.setViewModel(new LoginViewModel(this));
//         Hawk.delete(IS_LOGIN);
//        Hawk.delete(TOKEN);
//        LoginViewModel viewModel = new LoginViewModel(this);
//        viewModel.twtuName.set("miss976885345");
//        viewModel.twtpasswd.set("JCYwin551100");
//        viewModel.onLoginClickCommand.execute();
    }
}
