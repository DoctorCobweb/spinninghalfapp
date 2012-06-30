package au.com.spinninghalf;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AboutUs extends Activity {
public final static String ABOUT_US_URI = "http://www.spinninghalf.com.au";

	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aboutus);
		
		//register listener for the buy button
		Button aboutUsButton = (Button) findViewById(R.id.spinningHalfAboutUsSpinningHalfButton);
		aboutUsButton.setOnClickListener(aboutUsListener);
		
		
	}
	
	public OnClickListener aboutUsListener = new OnClickListener()
	{		
		//@Override
		public void onClick(View view) 
		{
			Intent aboutUsUriIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(ABOUT_US_URI));
			startActivity(aboutUsUriIntent);
		}
	};

}
