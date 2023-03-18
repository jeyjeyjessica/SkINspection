package jessica.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class FindHospitalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_hospital);
        // Find the WebView by its unique ID
        WebView webView = findViewById(R.id.web);

        // loading http://www.google.com url in the WebView.
        webView.loadUrl("https://www.google.com/maps/search/dermatologist+in+chembur+east/@19.0593167,72.8895124,15z/data=!3m1!4b1");

        // this will enable the javascript.
        webView.getSettings().setJavaScriptEnabled(true);

        // WebViewClient allows you to handle
        // onPageFinished and override Url loading.
        webView.setWebViewClient(new WebViewClient());
    }
}