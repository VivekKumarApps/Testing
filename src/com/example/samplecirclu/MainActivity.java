package com.example.samplecirclu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	boolean running;
	ProgressWheel pw_two;
	//ProgressWheel pw_five;
	int progress = 0;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progress_wheel_activity);
        pw_two = (ProgressWheel) findViewById(R.id.progressBarTwo);
        
        
      
        
        Button spin = (Button) findViewById(R.id.btn_spin);
        spin.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				if(progress==360){
					progress=0;
				}
				progress+=90;
				pw_two.setProgress(progress);
				((TextView)findViewById(R.id.tvStatus)).setText(progress+"%\nReady");
			}
        });
	}
	
	@Override
	public void onPause() {
		super.onPause();
	}

}
