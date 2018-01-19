    package com.example.kenlin.myfirstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webview = WebView(this)
        setContentView(webview)
        webview.settings.javaScriptEnabled = true
        webview.setWebViewClient(WebViewClient())
        webview.loadUrl("http://intranet.arbor.com.tw/")

    }
}
