package cris.hackathon.cosanostra.uiComponents.God;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import cris.hackathon.cosanostra.R;

public class GodActivity extends AppCompatActivity {

    private TextView peponTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_god);

        peponTextView = (TextView) findViewById(R.id.peponTextView);
    }
}
