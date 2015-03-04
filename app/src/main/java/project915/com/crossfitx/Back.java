package project915.com.crossfitx;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Back extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);
        addButtonClickListener5();
    }

    private void addButtonClickListener5() {

        Button back1 = (Button)findViewById(R.id.button14);
        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bodybuilding.com/exercises/main/popup/name/bent-over-barbell-row"));
                    startActivity(intent);
                }
            }
        });

        Button back2 = (Button)findViewById(R.id.button15);
        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bodybuilding.com/exercises/main/popup/name/v-bar-pulldown"));
                    startActivity(intent);
                }
            }
        });

        Button back3 = (Button)findViewById(R.id.button16);
        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bodybuilding.com/exercises/main/popup/name/hyperextensions-back-extensions"));
                    startActivity(intent);
                }
            }
        });

        Button back4 = (Button)findViewById(R.id.button17);
        back4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bodybuilding.com/exercises/main/popup/name/stiff-leg-barbell-good-morning"));
                    startActivity(intent);
                }
            }
        });

        Button back5 = (Button)findViewById(R.id.button18);
        back5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bodybuilding.com/exercises/main/popup/name/barbell-shrug-behind-the-back"));
                    startActivity(intent);
                }
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_back, menu);
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
