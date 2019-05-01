package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView story;
    private Button top;
    private Button bottom;
    private int mIndex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        story=(TextView)findViewById(R.id.storyTextView);
        top=(Button)findViewById(R.id.buttonTop);
        bottom=(Button)findViewById(R.id.buttonBottom);
        mIndex=1;



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mIndex==1)
                {
                    story.setText(R.string.T3_Story);
                    top.setText(R.string.T3_Ans1);
                    bottom.setText(R.string.T3_Ans2);
                    mIndex=mIndex+1;
                }
                else if(mIndex==2)
                {
                    story.setText(R.string.T6_End);
                    top.setVisibility(View.GONE);
                    bottom.setVisibility(View.GONE);
                }
                else if(mIndex==6)
                {
                    story.setText(R.string.T3_Story);
                    top.setText(R.string.T3_Ans1);
                    bottom.setText(R.string.T3_Ans2);
                    mIndex=mIndex+4;
                }
                else if(mIndex==10)
                {
                    story.setText(R.string.T6_End);
                    top.setVisibility(View.GONE);
                    bottom.setVisibility(View.GONE);
                }


            }
        });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        bottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mIndex==1)
                {
                    story.setText(R.string.T2_Story);
                    top.setText(R.string.T2_Ans1);
                    bottom.setText(R.string.T2_Ans2);
                    mIndex=mIndex+5;
                }
                else if(mIndex==6)
                {
                    story.setText(R.string.T4_End);
                    top.setVisibility(View.GONE);
                    bottom.setVisibility(View.GONE);
                }
                else if(mIndex==2)
                {
                    story.setText(R.string.T5_End);
                    top.setVisibility(View.GONE);
                    bottom.setVisibility(View.GONE);
                }
                else if(mIndex==10)
                {
                    story.setText(R.string.T5_End);
                    top.setVisibility(View.GONE);
                    bottom.setVisibility(View.GONE);
                }

            }
        });


    }
}
