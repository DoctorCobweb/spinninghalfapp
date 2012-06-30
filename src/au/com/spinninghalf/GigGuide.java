package au.com.spinninghalf;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



public class GigGuide extends Activity {
	public final static String GIGGUIDE_URI = "http://www.spinninghalf.com.au";
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gigguide);
		
		//register listener for the buy button
		Button gigguidebutton = (Button) findViewById(R.id.gigguideButtonTest);
		gigguidebutton.setOnClickListener(gigguideListener);
		
		
	}
	
	public OnClickListener gigguideListener = new OnClickListener()
	{		
		//@Override
		public void onClick(View view) 
		{
			Intent gigguideUriIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(GIGGUIDE_URI));
			startActivity(gigguideUriIntent);
		}
	};

}
