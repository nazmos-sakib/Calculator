package sakib.calculator.com.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class WebViewActivity extends AppCompatActivity {

    WebView webView;
    Button button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        webView = findViewById(R.id.myWebView);

        webView.setWebViewClient(new WebViewClient());

        editText = findViewById(R.id.url);

        button = findViewById(R.id.goBtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //webView.loadUrl("https://"+editText.getText().toString());
                webView.loadUrl("https://github.com/nazmos-sakib");
            }
        });
    }

    @Override
    public void onBackPressed() {


        if(webView.canGoBack()){
            webView.goBack();
        }else{
            super.onBackPressed();
        }
    }

}
