package com.lihang.frescodemo;

import android.app.Application;
import android.support.v4.app.FragmentActivity;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.imagepipeline.decoder.SimpleProgressiveJpegConfig;

/**
 * Created by 一指流沙 on 2016/9/19.
 */
public class PhoenixApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
//        //基本使用初始化方法
//        Fresco.initialize(this);
        //渐进式JPEG图的初始化方法
        ImagePipelineConfig config = ImagePipelineConfig.newBuilder(this)
                .setProgressiveJpegConfig(new SimpleProgressiveJpegConfig())
                .build();
        Fresco.initialize(this,config);
    }
}
