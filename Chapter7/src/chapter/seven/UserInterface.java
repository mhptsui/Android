package chapter.seven;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.app.AlertDialog;
import android.content.DialogInterface;

public class UserInterface extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public boolean onCreateOptionsMenu(Menu menu) {
    	MenuInflater inflater = getMenuInflater();
    	inflater.inflate(R.menu.mainmenu, menu);
    	return true;
    }
    
    public boolean onOptionsItemSelected(MenuItem item) {
    	LinearLayout bkgr = (LinearLayout) findViewById(R.id.uilayout);
    	ImageView image = (ImageView) findViewById(R.id.imageView01);
    	
    	switch (item.getItemId()) {
    		case R.id.buttonone:
    			image.setImageResource(R.drawable.button1_normal);
    			return true;
    		case R.id.buttontwo:
    			image.setImageResource(R.drawable.button1_focused);
    			return true;
    		case R.id.buttonthree:
    			bkgr.setBackgroundResource(R.color.background2);
    			return true;
    		case R.id.buttonfour:
    			bkgr.setBackgroundResource(R.color.background);
    			return true;
    		case R.id.buttonfive:
    			
    		default:
    			return super.onOptionsItemSelected(item);
    	}
    }
}
