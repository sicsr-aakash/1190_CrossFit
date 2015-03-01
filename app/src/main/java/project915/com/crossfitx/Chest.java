package project915.com.crossfitx;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Chest extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest);
        addButtonClickListener2();
    }

    private void addButtonClickListener2() {

        Button chest1 = (Button)findViewById(R.id.button26);
        chest1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bodybuilding.com/exercises/main/popup/name/barbell-bench-press-medium-grip"));
                    startActivity(intent);
                }
            }
        });

        Button chest2 = (Button)findViewById(R.id.button27);
        chest2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bodybuilding.com/exercises/main/popup/name/incline-dumbbell-press"));
                    startActivity(intent);
                }
            }
        });

        Button chest3 = (Button)findViewById(R.id.button28);
        chest3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bodybuilding.com/exercises/main/popup/name/dumbbell-flyes"));
                    startActivity(intent);
                }
            }
        });

        Button chest4 = (Button)findViewById(R.id.button29);
        chest4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bodybuilding.com/exercises/main/popup/name/dips-chest-version"));
                    startActivity(intent);
                }
            }
        });

        Button chest5 = (Button)findViewById(R.id.button30);
        chest5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bodybuilding.com/exercises/main/popup/name/pushups"));
                    startActivity(intent);
                }
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_chest, menu);
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
