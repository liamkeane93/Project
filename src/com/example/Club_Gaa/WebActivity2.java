package com.example.Club_Gaa;

import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by Liam on 31/03/2016.
 */
public class WebActivity2 extends MyActivity{

    private WebView webView;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.webcontent);

        webView = (WebView) findViewById(R.id.webView);

        webView.getSettings().setJavaScriptEnabled(true);

        webView.loadUrl("http://www.galwaygaa.ie/gaafixtures/fixturelist.php?countyBoardID=12&daysPrevious=14&resultsOnly=y&compStyle=hurling&reverseDateOrder=Y");


    }

}