package com.zhixiaoyou.ui;
import com.zhixiaoyou.ui.R;

 
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;  
import android.graphics.drawable.Drawable;
import android.os.Bundle;  
import android.view.LayoutInflater;
import android.view.View;  

import android.widget.LinearLayout;
import android.widget.TabHost;  
import android.widget.TextView;  


/** 
 * FragmentTabHost structure: 
 * <p/> 
 * fragmentTabHost->tabSpec->indicator->view->ImageView 
 * ->TextView 
 * ->tabSpec 
 */  
public class MainActivity extends AppCompatActivity {  
  
    private FragmentTabHost mTabHost;  
  
    MainTab[] mTabs = MainTab.values();
  
    @Override  
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.activity_main);  
  
        mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);  
  
        initTab();  
    }  
  
    private void initTab() {  

        //1.invoke setup method  
        mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);  
  
        for(MainTab t:mTabs){  
            //2.create TabSpec  
            TabHost.TabSpec spec = mTabHost.newTabSpec(getString(t.getResName()));  
  
            View indicator = LayoutInflater.from(getApplicationContext())
                    .inflate(R.layout.tab_indicator, null);
            TextView title = (TextView) indicator.findViewById(R.id.tab_title);
            Drawable drawable = this.getResources().getDrawable(t.getResIcon());
            title.setCompoundDrawablesWithIntrinsicBounds(null, drawable, null,
                    null);
            title.setText(getString(t.getResName()));  
            
            //4.set indicator for spec  
            spec.setIndicator(indicator);  
  
            //5.add spec to fragmentTabHost  
            mTabHost.addTab(spec, t.getClz(), null);  
        }  
  
        //È¥µô·Ö¸îÏß  
        mTabHost.getTabWidget().setShowDividers(LinearLayout.SHOW_DIVIDER_NONE);  
        mTabHost.setCurrentTab(2);  
  
    }  
}  