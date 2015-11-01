package dragon.android;


import android.app.Activity;
import android.os.Bundle;
import com.google.ads.*;
import dragon.WatchAD.R;

public class WatchAD extends Activity {
    /** Called when the activity is first created. */
	private AdView adView = null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        adView = new AdView(this, AdSize.BANNER, "a1502ce2f5be5d5");
        
        super.setContentView(adView);
        
        AdRequest request = new AdRequest();
        
        
        adView.loadAd(request);
    }

	@Override
	protected void onDestroy() {
		if(adView != null){
			adView.destroy();
		}
		// TODO Auto-generated method stub
		super.onDestroy();
	}
}