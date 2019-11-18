package com.fishinwater.moduledome.application;

import android.app.Application;

/**
 * 1. 整个程序的入口
 * 2. 做初始化工作（一些常用的三方库的初始化）
 * 3. 为应用的其他模块提供上下文
 *
 * 主要以单例的模式存在
 * @author fishinwater-1999
 * @version 2019-11-18
 */
public class ImoocApplication extends Application {

    private static ImoocApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static ImoocApplication getInstance() {
        return instance;
    }
}
