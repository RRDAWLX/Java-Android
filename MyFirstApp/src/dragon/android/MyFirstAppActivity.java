package dragon.android;

import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MyFirstAppActivity extends Activity {
	public final static String EXTRA_MESSAGE = "dragon.android.message";
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void sendMessage(View view){
    	Intent intent = new Intent(this, DisplayMessageActivity.class);
    	EditText editText = (EditText)findViewById(R.id.edit_message);
    	String message = editText.getText().toString();
    	intent.putExtra(EXTRA_MESSAGE, message);
    	startActivity(intent);
    }
    
    public void invoke(View view){
    	Intent intent = new Intent(Intent.ACTION_SEND);

    	// Always use string resources for UI text. This says something like "Share this photo with"
    	String title = getResources().getText(R.string.chooser_title).toString();
    	// Create and start the chooser
    	Intent chooser = Intent.createChooser(intent, title);
    	startActivity(chooser);
    }
}