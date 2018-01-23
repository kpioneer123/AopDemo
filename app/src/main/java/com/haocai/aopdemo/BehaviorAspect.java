package com.haocai.aopdemo;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Xionghu on 2018/1/23.
 * Desc: 切面
 * 你想要切下来的部分（代码逻辑功能重复模块）
 */
@Aspect
public class BehaviorAspect {
    private static final String TAG = "MainAspect";
    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    /**
     * 根据切点 切成什么样子
     *
     */
    @Pointcut("execution(@com.haocai.aopdemo.BehaviorTrace * *(..))")
    public void annoBehavior() {

    }
    /**
     * 切成什么样子之后，怎么去处理
     *
     */

    @Around("annoBehavior()")
    public Object dealPoint(ProceedingJoinPoint point) throws Throwable{
        //方法执行前
        MethodSignature methodSignature = (MethodSignature)point.getSignature();
        BehaviorTrace behaviorTrace = methodSignature.getMethod().getAnnotation(BehaviorTrace.class);
        String contentType = behaviorTrace.value();
        int type = behaviorTrace.type();
        Log.i(TAG,contentType+"使用时间：   "+simpleDateFormat.format(new Date()));
        long beagin=System.currentTimeMillis();
        //方法执行时
        Object object = null;
        try{
            object = point.proceed();
        }catch (Exception e){
            e.printStackTrace();
        }

        //方法执行完成
        Log.i(TAG,"消耗时间："+(System.currentTimeMillis()-beagin)+"ms");
        return object;
    }
}
