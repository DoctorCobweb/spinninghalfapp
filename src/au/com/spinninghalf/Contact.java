package au.com.spinninghalf;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Contact extends Activity {
public final static String CONTACT_FACEBOOK_URI = "http://www.facebook.com/pages/Spinning-Half/227917577236619";
public final static String CONTACT_TWITTER_URI = "http://www.twitter.com/spinning_half";
public final static String CONTACT_YOUTUBE_URI = "http://www.youtube.com/user/spinninghalfstudios?feature=mhee";
public final static String CONTACT_SPINNINGHALF_URI = "http://www.spinninghalf.com.au";
	
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.contact);
		
		//register listener for the buttons
		Button contactFacebookButton = (Button) findViewById(R.id.spinningHalfContactFacebookButton);
		contactFacebookButton.setOnClickListener(contactFacebookListener);
		
		Button contactTwitterButton = (Button) findViewById(R.id.spinningHalfContactTwitterButton);
		contactTwitterButton.setOnClickListener(contactTwitterListener);
		
		Button contactYoutubeButton = (Button) findViewById(R.id.spinningHalfContactYoutubeButton);
		contactYoutubeButton.setOnClickListener(contactYoutubeListener);
		
		Button contactSpinningHalfButton = (Button) findViewById(R.id.spinningHalfContactSpinningHalfButton);
		contactSpinningHalfButton.setOnClickListener(contactSpinningHalfListener);
		
		
	}
	
	public OnClickListener contactSpinningHalfListener = new OnClickListener()
	{		
		//@Override
		public void onClick(View view) 
		{
			Intent contactSpinningHalfUriIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(CONTACT_SPINNINGHALF_URI));
			startActivity(contactSpinningHalfUriIntent);
		}
	};
	
	public OnClickListener contactFacebookListener = new OnClickListener()
	{		
		//@Override
		public void onClick(View view) 
		{
			Intent contactFacebookUriIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(CONTACT_FACEBOOK_URI));
			startActivity(contactFacebookUriIntent);
		}
	};
	
	public OnClickListener contactTwitterListener = new OnClickListener()
	{		
		//@Override
		public void onClick(View view) 
		{
			Intent contactTwitterUriIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(CONTACT_TWITTER_URI));
			startActivity(contactTwitterUriIntent);
		}
	};
	
	public OnClickListener contactYoutubeListener = new OnClickListener()
	{		
		//@Override
		public void onClick(View view) 
		{
			Intent contactYoutubeUriIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(CONTACT_YOUTUBE_URI));
			startActivity(contactYoutubeUriIntent);
		}
	};
	

}
