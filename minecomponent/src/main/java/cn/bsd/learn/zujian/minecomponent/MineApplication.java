package cn.bsd.learn.zujian.minecomponent;

import android.app.Application;

import cn.bsd.learn.zujian.componentlib.IAppComponent;
import cn.bsd.learn.zujian.componentlib.ServiceFactory;

public class MineApplication extends Application implements IAppComponent {
    private static Application application;

    public static Application getApplication(){
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initializa(this);
    }

    @Override
    public void initializa(Application app) {
        application = app;
        ServiceFactory.getInstance().setmMineService(new MineService());
    }
}
