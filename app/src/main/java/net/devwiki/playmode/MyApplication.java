package net.devwiki.playmode;

import android.app.Application;
import android.content.Context;

/**
 * APP的Application
 * Created by Administrator on 2015/9/16 0016.
 */
public class MyApplication extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }

    public static Context getContext(){
        return context;
    }
}
