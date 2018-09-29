package com.example.dc11.helloworld__app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //On click listener for button to change color
        findViewById(R.id.changeTColor).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log printed out in logcat to test if onclick works
                Log.i("David","Button clicked");

                //text view ID && change color of text view
                ((TextView)findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.colorAccent));
            }
        });
        //Change Background Color
        findViewById(R.id.changeVColor).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.orange));


            }
        });
        //Change Text in textView
        findViewById(R.id.changeText).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Grab the text the user inputted
                //Put the text into our text view once the 'change text' button is clicked
                String newText = ((EditText)findViewById(R.id.editText)).getText().toString();

                if(TextUtils.isEmpty(newText)){
                    ((TextView)findViewById(R.id.textView)).setText("Hello from David!");

                }else {
                    ((TextView)findViewById(R.id.textView)).setText(newText);

                }
                 //((TextView)findViewById(R.id.textView)).setText("Bye !");


            }
        });

        //Reset to original starting screen
        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Reset Text Color
                ((TextView)findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.white));
                //Reset Background Color
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.colorPrimary));

                //Reset Static Text
                ((TextView)findViewById(R.id.textView)).setText("Hello from David!");

            }
        });


        //


    }


}
