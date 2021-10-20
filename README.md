# Android沉浸式(透明)状态栏框架
### 开发语言：java
### 开发工具：Android Studio
### 描述：
Android沉浸式(透明)状态栏框架，支持安卓4.0以上版本，简单易用，一行代码即可让状态栏更加美观。
### 框架使用示例：
---

* 1、添加依赖和配置：

```Java
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}

dependencies {
	implementation 'com.github.respost:OmgTranslucentStatusBar:1.0'
}
```
* 2、一行代码实现沉浸式(透明)状态栏，就是这么简单！

```Java
	/**
	 * 设置沉浸式(透明)状态栏
	 * 说明：
	 * 1、set(colorId)里的colorId为颜色ID
	 * 2、放在setContentView(R.layout.activity_main)之后调用
	 */
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //调用沉浸式(透明)状态栏
        OmgStatusBar.with(MainActivity.this).set(0x55000000);
    }
```