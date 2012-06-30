package au.com.spinninghalf;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Venues extends Activity {
public final static String VENUES_URI = "http://www.spinninghalf.com.au";
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.venues);
		
		//register listener for the buy button
		Button venuesButton = (Button) findViewById(R.id.venuesButtonTest);
		venuesButton.setOnClickListener(venuesListener);
		
		
	}
	
	public OnClickListener venuesListener = new OnClickListener()
	{		
		//@Override
		public void onClick(View view) 
		{
			Intent venuesUriIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(VENUES_URI));
			startActivity(venuesUriIntent);
		}
	};

}
