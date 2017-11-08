package com.example.administrator.htmltest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView wb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //将屏幕设置为全屏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //去掉标题栏
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        wb = (WebView)findViewById(R.id.webView);

        WebSettings webSettings= wb.getSettings();

        wb.getSettings().setJavaScriptEnabled(true);

        // webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        webSettings.setUseWideViewPort(true);//适应手机屏幕
        webSettings.setLoadWithOverviewMode(true);
        loadWeb();
    }

    private void loadWeb() {
        wb.loadUrl(" file:///android_asset/home/index.html ");

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
              //重写onKeyDown，当浏览网页，WebView可以后退时执行后退操作。
              if(keyCode == KeyEvent.KEYCODE_BACK && wb.canGoBack()){
                       wb.goBack();
                        return true;
                  }
                return super.onKeyDown(keyCode, event);
          }
}
