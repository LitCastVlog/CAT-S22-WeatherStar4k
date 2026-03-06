package com.litcast.ws4kp

import android.app.Presentation
import android.content.Context
import android.os.Bundle
import android.view.Display
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient

class WeatherPresentation(context: Context, display: Display) :
    Presentation(context, display) {

    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        webView = WebView(context)
        setContentView(webView)

        val settings: WebSettings = webView.settings
        settings.javaScriptEnabled = true
        settings.domStorageEnabled = true
        settings.mediaPlaybackRequiresUserGesture = false
        settings.loadsImagesAutomatically = true
        settings.cacheMode = WebSettings.LOAD_DEFAULT

        webView.webViewClient = WebViewClient()

        val prefs = context.getSharedPreferences("ws4kp_prefs", Context.MODE_PRIVATE)
        val url = prefs.getString("url", null)

        if (url != null) {
            webView.loadUrl(url)
        }
    }
}