package com.javaguru.phase1challenge.activities;

import android.net.http.SslError;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.javaguru.phase1challenge.R;

public class AboutAlcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        WebView abtAlc = findViewById(R.id.about_alc);
        WebSettings webSettings = abtAlc.getSettings();
        webSettings.setJavaScriptEnabled(true);
        abtAlc.setWebViewClient(new WebViewClient(){

            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }


        });

        abtAlc.loadUrl("https://andela.com/alc/");
    }
}
