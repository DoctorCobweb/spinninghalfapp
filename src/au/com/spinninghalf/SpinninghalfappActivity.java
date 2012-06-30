package au.com.spinninghalf;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;


public class SpinninghalfappActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void gigGuideMainMenu (View view){
    	Intent gigGuideMainMenuIntent = new Intent(this, GigGuide.class);
    	startActivity(gigGuideMainMenuIntent);
    }
    
    public void rehearsalsMainMenu (View view){
    	Intent rehearsalsMainMenuIntent = new Intent(this, Rehearsals.class);
    	startActivity(rehearsalsMainMenuIntent);
    }
    
    public void artistsMainMenu (View view){
    	Intent artistsMainMenuIntent = new Intent(this, Artists.class);
    	startActivity(artistsMainMenuIntent);
    }
    
    public void venuesMainMenu (View view){
    	Intent venuesMainMenuIntent = new Intent(this, Venues.class);
    	startActivity(venuesMainMenuIntent);
    }
    
    public void aboutUsMainMenu (View view){
    	Intent aboutUsMainMenuIntent = new Intent(this, AboutUs.class);
    	startActivity(aboutUsMainMenuIntent);
    }
    
    public void contactMainMenu (View view){
    	Intent contactMainMenuIntent = new Intent(this, Contact.class);
    	startActivity(contactMainMenuIntent);
    }
    

    
}