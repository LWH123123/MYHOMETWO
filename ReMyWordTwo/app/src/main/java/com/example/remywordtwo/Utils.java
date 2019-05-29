package com.example.remywordtwo;

import android.util.Log;

import com.example.remywordtwo.dao.BeanDao;
import com.example.remywordtwo.dao.DaoSession;

import java.util.List;

public class Utils {


    public static Bean queryItem(Bean b) {

        DaoSession daoSession = MyApplication.getDaoSession();


        Bean unique = daoSession.queryBuilder(Bean.class)
                .where(BeanDao.Properties.Age.eq(b.getAge()))
                .build()
                .unique();


        return unique;

    }


    public static void insert(Bean b) {
        DaoSession daoSession = MyApplication.getDaoSession();

        if (queryItem(b) == null) {

            daoSession.insert(b);

        } else {

            Log.i(TAG, "insert: 以经有这个数据");
        }


    }


    public static List<Bean> load() {
        DaoSession daoSession = MyApplication.getDaoSession();


        List<Bean> beans = daoSession.loadAll(Bean.class);

        return beans;
    }


    private static final String TAG = "Utils";


}
