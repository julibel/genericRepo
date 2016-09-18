package cris.hackathon.cosanostra.uiComponents.thief;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import cris.hackathon.cosanostra.R;

public class ThiefActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thief);

        ImageView img= (ImageView) findViewById(R.id.imageView_thief);
        img.setImageResource(R.mipmap.ic_thief);

        Button myButton = new Button(this);
        myButton.setText("Push Me");

        LinearLayout ll = (LinearLayout)findViewById(R.id.linearLayout_buttons);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        ll.addView(myButton, lp);
    }
}
