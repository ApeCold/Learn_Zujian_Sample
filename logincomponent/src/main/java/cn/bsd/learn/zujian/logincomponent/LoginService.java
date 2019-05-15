package cn.bsd.learn.zujian.logincomponent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import cn.bsd.learn.zujian.componentlib.ILoginService;

public class LoginService implements ILoginService {
    @Override
    public void launch(Context context, String targetClass) {
        Intent intent = new Intent(context,LoginActivity.class);
        intent.putExtra(LoginActivity.EXTRA_TARGET_CLASS,targetClass);
        context.startActivity(intent);
    }

    @Override
    public Fragment newUserInfoFragment(FragmentManager fragmentManager, int ViewId, Bundle bundle) {
        UserInfoFragment fragment = new UserInfoFragment();
        fragment.setArguments(bundle);
        fragmentManager.beginTransaction().add(ViewId,fragment).commit();
        return fragment;
    }
}
