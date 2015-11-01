package dragon.android;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import dragon.Lottery.R;

public class Luck extends Activity {
    /** Called when the activity is first created. */
	private TextView red = null;
	private TextView blue = null;
	private Button luck = null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.align_bottom);
        
        red = (TextView)super.findViewById(R.id.red);
        blue = (TextView)super.findViewById(R.id.blue);
        luck = (Button)super.findViewById(R.id.luck);
        luck.setOnClickListener(new LuckyNumber());
    }
    
    private static void sort(int[] array){					//从小到大排序
    	for(int i = array.length - 1; i > 0; i--){
    		for(int j = 0; j < i; j++){
    			if(array[j] > array[j + 1]){
    				int temp = array[j];
    				array[j] = array[j + 1];
    				array[j + 1] = temp;
    			}
    		}
    	}
    }
    
    private class LuckyNumber implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			int[] redBall = new int[6];						//生成红球数
			for(int i = 0; i < 6;){
				boolean same = false;
				int temp = getLuckyNum(33);   				
				//int temp = (int)(Math.random() * 33 + 1);
				
				for(int j = 0; j <= i; j++){				//判断是否与之前的随机数相同
					if(temp == redBall[j]){
						same = true;
						break;
					}
				}
				
				if(!same){									//将符合要求的随机数加入数组中
					redBall[i] = temp;
					i++;
				}
			}
			
			Luck.this.sort(redBall);
			
			String redNums = "";
			for(int i = 0; i < 6; i++){
				if(redBall[i] < 10)
					redNums += "0" + redBall[i] + " ";
				else
					redNums += redBall[i] + " ";
			}
			
			int blueBall = getLuckyNum(16);			
			//int blueBall = (int)(System.currentTimeMillis() % 16 + 1);
			//int blueBall = (int)(Math.random()*16+1);
			
			Luck.this.red.setText("红球： " + redNums);
			if(blueBall < 10)
				Luck.this.blue.setText("篮球： " + 0 +blueBall);
			else
				Luck.this.blue.setText("篮球： " + blueBall);
		}
    }
    
    public int getLuckyNum(int n){         			//返回[1,n]内的一个随机整数
    	Random random = new Random();
    	return random.nextInt(n)+1;
    }
    
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		menu.add("退出");
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		super.finish();
		return super.onOptionsItemSelected(item);
	}
}