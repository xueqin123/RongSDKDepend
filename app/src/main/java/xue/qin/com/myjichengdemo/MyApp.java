package xue.qin.com.myjichengdemo;

import android.app.Application;

import io.rong.imkit.RongIM;

/**
 * Created by qinxue on 2018/2/2.
 */

public class MyApp extends Application {
    public static final String APP_KEY = "sfci50a7s4q5i";
    @Override
    public void onCreate() {
        super.onCreate();
        RongIM.init(this,APP_KEY);
    }
}
