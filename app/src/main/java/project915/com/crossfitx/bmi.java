package project915.com.crossfitx;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class bmi extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
    }

        public void calculateClickHandler(View view) {
            //connecting to the click of the calculator button

            if (view.getId() == R.id.calculatebutton) {
                // refer to the layout items we added in the xml
                EditText weightText = (EditText) findViewById(R.id.weighText);
                EditText heightText = (EditText) findViewById(R.id.heighText);
                TextView resultText = (TextView) findViewById(R.id.resultLabel);

                //get the values the user will enter into the fields we provided them

                float weight = Float.parseFloat(weightText.getText().toString());
                float height = Float.parseFloat(heightText.getText().toString());

                //calculate the bmi value

                float bmiValue = calculateBMI(weight, height);

                //meaning of bmi value

                String bmiInterpretation = interpretBMI(bmiValue);

                //value of the result text is here

                resultText.setText(bmiValue + "--" + bmiInterpretation);
            }
        }

    //formula to calculate the BMI INDEX

        private float calculateBMI(float weight, float height) {
            return (float) (weight * 4.88 / (height * height)); }

            //Give user the information about the BMI index he gets from the app!

    private String interpretBMI(float bmiValue) {

        if (bmiValue < 16) {


            return "Severly Underweight";

        }
        else if (bmiValue < 18.5)
        {
            return "Underweight";
        }
        else if (bmiValue < 25)
        {
            return "Normal";
        }
        else if (bmiValue < 30)
        {
            return "Overweight";
        }
        else
        {
            return "Obese";
        }
    }

}





