package cn.bsd.learn.zujian.minecomponent;

import android.content.Context;
import android.content.Intent;

import cn.bsd.learn.zujian.componentlib.IMineService;

public class MineService implements IMineService {
    @Override
    public void launch(Context context, int userId) {
        Intent intent = new Intent(context,MineActivity.class);
        intent.putExtra("ID",userId);
        context.startActivity(intent);
    }
}
