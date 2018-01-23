
package com.haocai.aopdemo;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Main";
    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }
    /**
     * 摇一摇的模块
     *
     * @param view
     */
    @BehaviorTrace(value = "摇一摇",type = 1)
    public  void mShake(View view)
    {
        //摇一摇的代码逻辑
        {
            SystemClock.sleep(3000);
            Log.i(TAG," 摇到一个红包");

        }
    }
    /**
     * 语音的模块
     *
     * @param view
     */
    @BehaviorTrace(value = "语音:",type = 1)
    public  void mAudio(View view)
    {
        //语音代码逻辑
        {
            SystemClock.sleep(3000);
            Log.i(TAG,"发语音：我要到一个红包啦");
        }
    }
    /**
     * 打字模块
     *
     * @param view
     */
    @BehaviorTrace(value = "打字:",type = 1)
    public  void mText(View view)
    {
        //打字模块逻辑
        {
            SystemClock.sleep(3000);
            Log.i(TAG,"打字逻辑，我摇到了一个大红包");

        }

    }


//    /**
//     * 摇一摇的模块
//     *
//     * @param view
//     */
//    @BehaviorTrace(value = "摇一摇",type = 1)
//    public  void mShake(View view)
//    {
//            SystemClock.sleep(3000);
//            Log.i(TAG,"  摇到一个嫩模：  约不约");
//    }
//
//    /**
//     * 摇一摇的模块
//     *
//     * @param view
//     */
//    public  void mShake(View view)
//    {
//
//        long beagin=System.currentTimeMillis();
//        Log.i(TAG,"摇一摇：  使用时间：   "+simpleDateFormat.format(new Date()));
//        //摇一摇的代码逻辑
//        {
//            SystemClock.sleep(3000);
//
//            Log.i(TAG," 摇到一个红包");
//
//        }
//        //事件统计逻辑
//        Log.i(TAG,"消耗时间：  "+(System.currentTimeMillis()-beagin)+"ms");
//
//    }

//    /**
//     * 语音的模块
//     *
//     * @param view
//     */
//    public  void mAudio(View view)
//    {
//        long beagin=System.currentTimeMillis();
//        Log.i(TAG,"语音：  使用时间：   "+simpleDateFormat.format(new Date()));
//        //语音代码逻辑
//        {
//            SystemClock.sleep(3000);
//
//            Log.i(TAG,"发语音：我要到一个红包啦");
//
//        }
//       //事件统计逻辑
//        Log.i(TAG,"消耗时间：  "+(System.currentTimeMillis()-beagin)+"ms");
//    }
//
//    /**
//     * 打字模块
//     *
//     * @param view
//     */
//    public  void mText(View view)
//    {
//        //统计用户行为 的逻辑
//        Log.i(TAG,"文字：  使用时间：   "+simpleDateFormat.format(new Date()));
//        long beagin=System.currentTimeMillis();
//
//        //打字模块逻辑
//        {
//            SystemClock.sleep(3000);
//            Log.i(TAG,"打字逻辑，我摇到了一个大红包");
//
//        }
//        //事件统计逻辑
//        Log.i(TAG,"消耗时间：  "+(System.currentTimeMillis()-beagin)+"ms");
//    }

}
