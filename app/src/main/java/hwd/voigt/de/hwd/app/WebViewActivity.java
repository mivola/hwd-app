package hwd.voigt.de.hwd.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {

    private static final String HWD_URL = "http://hwd.michavoigt.de";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.hwd_web_view);

        WebView hwdWebView = (WebView) findViewById(R.id.hwdWebView);
        hwdWebView.setWebViewClient(new WebViewClient());
        hwdWebView.loadUrl(HWD_URL);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
    }

}
