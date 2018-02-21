    package com.example.kenlin.myfirstapp

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

    class MainActivity : AppCompatActivity() {
    val webViewClient = WebViewClient()
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webview.webViewClient = webViewClient
        webview.settings.javaScriptEnabled = true
        webview.loadUrl("http://intranet.arbor.com.tw/")
    }
    override fun onBackPressed() {
        if (webview.canGoBack()) {
            webview.goBack()
        } else {
            super.onBackPressed()
        }
    }
}