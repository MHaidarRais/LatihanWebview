package com.example.macbookpro.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView webVi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webVi = (WebView) findViewById(R.id.webV);
        String url = "http://9gag.com";
        webVi.getSettings().setJavaScriptEnabled(true);
        webVi.setFocusable(true);
        webVi.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        webVi.getSettings().setDomStorageEnabled(true);
        webVi.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        webVi.getSettings().setDatabaseEnabled(true);
        webVi.getSettings().setAppCacheEnabled(true);
        webVi.loadUrl(url);
        webVi.setWebViewClient(new WebViewClient());


    }

    @Override
    public void onBackPressed() {
        if (webVi.canGoBack()){
            super.onBackPressed();
        }

    }
}
