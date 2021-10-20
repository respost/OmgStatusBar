package com.xiao7.status.library;

import android.app.Activity;
import androidx.fragment.app.Fragment;

/**
 * 沉浸式(透明)状态栏类
 * 封装的框架主体
 *
 /**
 * @author 安阳 QQ：15577969
 * @version 1.0
 * @team 美奇软件开发工作室
 * @date 2021/10/20 14:09
 */
public final class OmgStatusBar {
    //对象
    private Object object;
    /**
     * 构造方法
     */
    private OmgStatusBar(Object object) {
        this.object = object;
    }

    /**
     *  with函数是将某对象作为函数的参数，在函数块内可以通过 this 指代该对象。
     *  返回值为函数块的最后一行或指定return表达式。
     */
    public static OmgStatusBar with(Activity activity){
        return new OmgStatusBar(activity);
    }
    public static OmgStatusBar with(Fragment fragment){
        return new OmgStatusBar(fragment);
    }

    /**
     * 设置为沉浸式(透明)状态栏
     * 说明：需要在setContentView之后才可以调用
     * @param colorId 颜色ID
     * @return
     */
    public OmgStatusBar set(int colorId){
        Activity activity = (Activity)this.object;
        //当FitsSystemWindows设置 true 时，会在屏幕最上方预留出状态栏高度的 padding
        StatusBarUtils.setRootViewFitsSystemWindows(activity, false);
        //设置状态栏透明
        StatusBarUtils.setTranslucentStatus(activity);
        //设置状态使用深色文字图标风格
        if (!StatusBarUtils.setStatusBarDarkTheme(activity, true)) {
            //设置一个半透明（半透明+白=灰）颜色的状态栏
            StatusBarUtils.setStatusBarColor(activity, colorId);
        }
        return this;
    }

}
