package com.example.remywordtwo;

import android.app.Application;

import com.example.remywordtwo.dao.DaoMaster;
import com.example.remywordtwo.dao.DaoSession;

public class MyApplication extends Application {


    private static DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();


        DaoMaster.DevOpenHelper sss = new DaoMaster.DevOpenHelper(this, "sss");
        DaoMaster daoMaster = new DaoMaster(sss.getWritableDatabase());

        daoSession = daoMaster.newSession();








    }


    public static DaoSession getDaoSession() {
        return daoSession;

    }
}
