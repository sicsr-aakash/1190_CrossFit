//we will be using adapters on the lists. referred -android docs
package project915.com.crossfitx;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.app.ListActivity;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.content.Intent;

import android.view.View;


public class LandingPageActivity extends ListActivity {
    private TextView text;

    private List<String> listValues;



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_landing_page);



        text = (TextView) findViewById(R.id.mainText);



        listValues = new ArrayList<String>();

        listValues.add("Arms");

        listValues.add("Back");

        listValues.add("Shoulder");

        listValues.add("Chest");

        listValues.add("Legs");

        listValues.add("Calculate BMI");



        // initiate the listadapter

        ArrayAdapter<String> myAdapter = new ArrayAdapter <String>(this,

                R.layout.row_layout, R.id.listText, listValues);



        // assign the list adapter

        setListAdapter(myAdapter);



    }



            // when an item of the list is clicked

    @Override

    protected void onListItemClick(ListView list, View view, int position, long id) {

        super.onListItemClick(list, view, position, id);


        Intent intent;
        switch (position) {
            case 0:
                intent = new Intent(this, Arms.class);
                startActivity(intent);
                break;

            case 1:
                intent = new Intent(this, Back.class);
                startActivity(intent);
                break;

            case 2:
                intent = new Intent(this, Shoulders.class);
                startActivity(intent);
                break;

            case 3 :
                intent = new Intent(this, Chest.class);
                startActivity(intent);
                break;

            case 4:
                intent = new Intent(this, Legs.class);
                startActivity(intent);
                break;

            case 5:
                intent = new Intent(this, bmi.class);
                startActivity(intent);
                break;

            default:
                break;
        }




        //String selectedItem = (String) getListView().getItemAtPosition(position);

        //String selectedItem = (String) getListAdapter().getItem(position);



        //text.setText("You clicked " + selectedItem + " at position " + position);

    }



}
