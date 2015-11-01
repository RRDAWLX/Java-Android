package dragon.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Catalog extends Activity {
    /** Called when the activity is first created. */
	private ListView listView = null;
	private String[] lesson = {"第一课","第二课","第三课","第四课",
			"第五课","第六课","第七课","第八课","第九课","第十课",
			"第十一课","第十二课","第十三课","第十四课","第十五课"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        listView = (ListView)super.findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lesson);
        listView.setAdapter(adapter);
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main_menu, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		super.onOptionsItemSelected(item);
		switch(item.getItemId()){
		case R.id.exit:
			exit();
			return true;
		default:
			return false;
		}
	}

	public void exit(){
		this.finish();
		System.exit(0);
	}
}