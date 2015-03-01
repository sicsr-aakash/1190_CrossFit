package project915.com.crossfitx;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Shoulders extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoulders);
        addButtonClickListener4();
    }

    private void addButtonClickListener4() {

        Button shoulder1 = (Button)findViewById(R.id.button8);
        shoulder1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bodybuilding.com/exercises/main/popup/name/barbell-shoulder-press"));
                    startActivity(intent);
                }
            }
        });

        Button shoulder2 = (Button)findViewById(R.id.button9);
        shoulder2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bodybuilding.com/exercises/main/popup/name/one-arm-side-laterals"));
                    startActivity(intent);
                }
            }
        });

        Button shoulder3 = (Button)findViewById(R.id.button10);
        shoulder3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bodybuilding.com/exercises/main/popup/name/front-plate-raise"));
                    startActivity(intent);
                }
            }
        });

        Button shoulder4 = (Button)findViewById(R.id.button11);
        shoulder4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bodybuilding.com/exercises/main/popup/name/lying-rear-delt-raise"));
                    startActivity(intent);
                }
            }
        });

        Button shoulder5 = (Button)findViewById(R.id.button12);
        shoulder5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bodybuilding.com/exercises/main/popup/name/standing-low-pulley-deltoid-raise"));
                    startActivity(intent);
                }
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_shoulders, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
