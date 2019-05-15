package cn.bsd.learn.zujian.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import cn.bsd.learn.zujian.componentlib.ServiceFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ServiceFactory.getInstance().getmLoginService().launch(MainActivity.this,"");
            }
        });
        findViewById(R.id.gozujian).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ServiceFactory.getInstance().getmMineService().launch(MainActivity.this,1);
            }
        });
        findViewById(R.id.showUI).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                ServiceFactory.getInstance().getmLoginService().newUserInfoFragment(getSupportFragmentManager(),R.id.container,bundle);
            }
        });
    }
}
