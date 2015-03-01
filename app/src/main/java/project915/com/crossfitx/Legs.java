package project915.com.crossfitx;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Legs extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legs);
        addButtonClickListener3();
    }

    private void addButtonClickListener3() {

        Button leg1 = (Button)findViewById(R.id.button20);
        leg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bodybuilding.com/exercises/main/popup/name/barbell-squat"));
                    startActivity(intent);
                }
            }
        });

        Button leg2 = (Button)findViewById(R.id.button21);
        leg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bodybuilding.com/exercises/main/popup/name/dumbbell-lunges"));
                    startActivity(intent);
                }
            }
        });

        Button leg3 = (Button)findViewById(R.id.button22);
        leg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bodybuilding.com/exercises/main/popup/name/leg-press"));
                    startActivity(intent);
                }
            }
        });

        Button leg4 = (Button)findViewById(R.id.button23);
        leg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bodybuilding.com/exercises/main/popup/name/leg-extensions"));
                    startActivity(intent);
                }
            }
        });

        Button leg5 = (Button)findViewById(R.id.button24);
        leg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bodybuilding.com/exercises/main/popup/name/barbell-deadlift"));
                    startActivity(intent);
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_legs, menu);
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
