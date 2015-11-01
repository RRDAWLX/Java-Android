package dragon.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class AppActivity extends Activity {
    
    
    private WebView webview = null;
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        this.webview = (WebView)super.findViewById(R.id.webview);
        String data = "http://www.baidu.com";
        webview.loadData(data, "text/html", "UTF-8");
    }
}