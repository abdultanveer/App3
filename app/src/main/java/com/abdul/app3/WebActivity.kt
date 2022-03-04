package com.abdul.app3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Base64
import android.webkit.WebView
import androidx.webkit.WebViewAssetLoader

class WebActivity : AppCompatActivity() {
    lateinit var webview:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        webview = findViewById(R.id.webView)

        val assetLoader = WebViewAssetLoader.Builder()
            .addPathHandler("/assets/", WebViewAssetLoader.AssetsPathHandler(this))
            .addPathHandler("/res/", WebViewAssetLoader.ResourcesPathHandler(this))
            .build()
        webview.webViewClient = LocalContentWebViewClient(assetLoader)
        webview.loadUrl("https://appassets.androidplatform.net/assets/index.html")

       /* val unencodedHtml =
            "<html><body>'%23' is the percent code for ‘#‘ </body></html>";
        val encodedHtml = Base64.encodeToString(unencodedHtml.toByteArray(), Base64.NO_PADDING)
        webview.loadData(encodedHtml, "text/html", "base64")*/
       // webview.loadUrl("https://yahoo.com")

    }
}