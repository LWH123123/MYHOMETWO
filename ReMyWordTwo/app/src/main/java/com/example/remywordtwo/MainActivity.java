package com.example.remywordtwo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //李武辉  2019年5月29日19:37:41


        mRecycle = (RecyclerView) findViewById(R.id.recycle);
        mRecycle.setLayoutManager(new LinearLayoutManager(this));

        for (int i = 0; i < 20; i++) {
            Bean b = new Bean(null, "张志毅", 10 + i);
            Utils.insert(b);
        }


        List<Bean> load = Utils.load();

        ArrayList<Bean> ba = new ArrayList<>();

        ba.addAll(load);

        Log.i(TAG, "onCreate: 数据长度" + ba.size());


        Apdater apdater = new Apdater(load);


        mRecycle.setAdapter(apdater);
    }

    private static final String TAG = "MainActivity";





}
