/*
*Course: COMP3074
* Name: Hoa Nguyen
* Student Number: 100959069
* */
package com.example.hoa.clicktester;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.view.View.OnClickListener;
public class MainActivity extends AppCompatActivity implements OnClickListener {
    //message will show accordingly to user action
    private String message="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //This is used to locate the button in the UI.
        View button = findViewById(R.id.button);

        //This is used to locate the red block in the UI.
        View block1 = findViewById(R.id.top_left);

        //This is used to locate the green block in the UI.
        View block2 = findViewById(R.id.top_right);

        //This is used to locate the yellow block in the UI.
        View block3 = findViewById(R.id.bottom_left);

        //This  is used to locate the blue block in the UI.
        View block4 = findViewById(R.id.bottom_right);

        //Assign short click listener to button and color blocks
        button.setOnClickListener(this);
        block1.setOnClickListener(this);
        block2.setOnClickListener(this);
        block3.setOnClickListener(this);
        block4.setOnClickListener(this);

        //Assign long click listener to button and color blocks
        block1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                message= "Long click top left block";
                longClick();
                return true;
            }
        });

        block2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                message= "Long click top right block";
                longClick();
                return true;
            }
        });

        block3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                message= "Long click bottom left block";
                longClick();
                return true;
            }
        });

        block4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                message= "Long click bottom right block";
                longClick();
                return true;
            }
        });
    }
    //this method will be called when user short click on button or color blocks
    @Override
    public void onClick(View v)
    {
        switch(v.getId())
        {

            case R.id.top_left:
                message = "Short click top left block";
                Toast.makeText(this,message, Toast.LENGTH_SHORT).show();
                break;
            case R.id.top_right:
                message = "Short click top right block";
                Toast.makeText(this,message, Toast.LENGTH_SHORT).show();
                break;
            case R.id.bottom_left:
                message = "Short click bottom left block";
                Toast.makeText(this,message, Toast.LENGTH_SHORT).show();
                break;
            case R.id.bottom_right:
                message = "Short click bottom right block";
                Toast.makeText(this,message, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button:
                message = "Button has been clicked";
                Toast.makeText(this,message, Toast.LENGTH_SHORT).show();
                finish();
                break;

        }
    }



    public void longClick()
    {
        Toast.makeText(this,message, Toast.LENGTH_LONG).show();
    }
}
