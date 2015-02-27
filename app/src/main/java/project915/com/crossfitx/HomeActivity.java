package project915.com.crossfitx;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.content.Intent;


public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final Button button = (Button)findViewById(R.id.mainpagebut1);
       button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {

                Intent myIntent = new Intent(HomeActivity.this, LandingPageActivity.class);

                HomeActivity.this.startActivity(myIntent);
            }
        });
    }
}





