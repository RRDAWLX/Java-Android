package dragon.applyforjobs;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Jobs extends Activity {
	//private Button button_1 = null;
	//private Button button_2 = null;
	private WebView webView = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jobs);
		
		webView = (WebView)super.findViewById(R.id.web);
		webView.getSettings().setBuiltInZoomControls(false);
		webView.getSettings().setJavaScriptEnabled(true);
		webView.setWebViewClient(new WebViewClient(){
			@Override
			public boolean shouldOverrideUrlLoading(WebView view, String url) {
				// TODO Auto-generated method stub
				view.loadUrl(url);
				return true;
			}
		});
		webView.loadUrl("file:/android_asset/html/web1.html");
		
		/*button_1 = (Button)super.findViewById(R.id.button1);
		button_1.setOnClickListener(new OnClickListener(){
			public void onClick(View view){
				webView.loadUrl("file:/android_asset/html/web1.html");
			}
		});
		
		button_2 = (Button)super.findViewById(R.id.button2);
		button_2.setOnClickListener(new OnClickListener(){
			public void onClick(View view){
				webView.loadUrl("file:/android_asset/html/web2.html");
			}
		});*/
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		menu.add("ÍË³ö");
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		super.finish();
		return super.onOptionsItemSelected(item);
	}
	
	
}
