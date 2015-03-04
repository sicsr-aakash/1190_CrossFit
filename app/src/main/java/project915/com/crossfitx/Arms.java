package project915.com.crossfitx;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import static android.view.View.OnClickListener;


public class Arms extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arms);
        addButtonClickListener();
    }

    private void addButtonClickListener() {

        Button arms1 = (Button)findViewById(R.id.button);
        arms1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bodybuilding.com/exercises/main/popup/name/standing-dumbbell-reverse-curl"));
                    startActivity(intent);
                }
            }
        });

        Button arms2 = (Button)findViewById(R.id.button2);
        arms2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bodybuilding.com/exercises/main/popup/name/close-grip-barbell-bench-press"));
                    startActivity(intent);
                }
            }
        });

        Button arms3 = (Button)findViewById(R.id.button3);
        arms3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bodybuilding.com/exercises/main/popup/name/ez-bar-skullcrusher"));
                    startActivity(intent);
                }
            }
        });

        Button arms4 = (Button)findViewById(R.id.button4);
        arms4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bodybuilding.com/exercises/main/popup/name/hammer-curls"));
                    startActivity(intent);
                }
            }
        });

        Button arms5 = (Button)findViewById(R.id.button4);
        arms5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bodybuilding.com/exercises/main/popup/name/cable-one-arm-tricep-extension"));
                    startActivity(intent);
                }
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_arms, menu);
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
