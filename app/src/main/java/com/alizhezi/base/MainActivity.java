package com.alizhezi.base;


import android.os.Bundle;


import com.alizhezi.aibaseui.AliBaseListActivity;
import com.alizhezi.aibaseui.DemoListAdapter;
import com.alizhezi.base.lifecycle.LifecycleActivity;
import com.alizhezi.base.navigation.NavigationActivity;

public class MainActivity extends AliBaseListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected DemoListAdapter.DemoInfo[] bindData() {


        return DEMOS;
    }


    private DemoListAdapter.DemoInfo[] DEMOS = {

            new DemoListAdapter.DemoInfo("Navigation", "测试", NavigationActivity.class),
            new DemoListAdapter.DemoInfo("LifecycleActivity", "Lifecycle测试", LifecycleActivity.class),


            //new DemoInfo("自定义View", "自定义View 使用demo", CustomActivity.class),
    };
}
