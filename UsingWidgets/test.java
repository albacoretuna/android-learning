package my.aad.second;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.app.Activity;

public class ActTwo extends Activity {
	private TextView tv; 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_act_two);
		tv = (TextView) this.findViewById(R.id.textView2);
	}

public void report(View v){
	if(v.getId()== R.id.button1)
		tv.setText(R.string.areport);
	else
		tv.setText(R.string.ireport); 
}

}
