package au.com.spinninghalf;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Rehearsals extends Activity {
public final static String REHEARSALS_URI = "http://www.spinninghalf.com.au";
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.rehearsals);
		
		//register listener for the buy button
		Button rehearsalsbutton = (Button) findViewById(R.id.rehearsalsButtonTest);
		rehearsalsbutton.setOnClickListener(rehearsalsListener);
		
		
	}
	
	public OnClickListener rehearsalsListener = new OnClickListener()
	{		
		//@Override
		public void onClick(View view) 
		{
			Intent rehearsalsUriIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(REHEARSALS_URI));
			startActivity(rehearsalsUriIntent);
		}
	};

}
