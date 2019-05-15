package cn.bsd.learn.zujian.logincomponent;

import android.app.Application;

import cn.bsd.learn.zujian.componentlib.IAppComponent;
import cn.bsd.learn.zujian.componentlib.ServiceFactory;

public class LoginApplication extends Application implements IAppComponent {

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
        ServiceFactory.getInstance().setmLoginService(new LoginService());
    }
}
