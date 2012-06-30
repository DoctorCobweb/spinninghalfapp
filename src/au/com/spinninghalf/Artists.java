package au.com.spinninghalf;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Artists extends Activity {
public final static String ARTISTS_URI = "http://www.spinninghalf.com.au";
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.artists);
		
		//register listener for the buy button
		Button artistsbutton = (Button) findViewById(R.id.artistsButtonTest);
		artistsbutton.setOnClickListener(artistsListener);
		
		
	}
	
	public OnClickListener artistsListener = new OnClickListener()
	{		
		//@Override
		public void onClick(View view) 
		{
			Intent artistsUriIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(ARTISTS_URI));
			startActivity(artistsUriIntent);
		}
	};

}
