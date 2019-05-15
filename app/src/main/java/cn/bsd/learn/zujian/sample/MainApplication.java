package cn.bsd.learn.zujian.sample;

import android.app.Application;

import cn.bsd.learn.zujian.componentlib.AppConfig;
import cn.bsd.learn.zujian.componentlib.IAppComponent;

public class MainApplication extends Application implements IAppComponent {

    private static MainApplication application;

    public static MainApplication getApplication(){
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initializa(this);
    }

    @Override
    public void initializa(Application app) {
        //将主app的上下文传到login以及mine application中
        for(String component: AppConfig.COMPONENTS){
            try {
                Class<?> clazz = Class.forName(component);
                Object object = clazz.newInstance();
                if(object instanceof IAppComponent){
                    ((IAppComponent) object).initializa(this);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
