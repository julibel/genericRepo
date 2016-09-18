package cris.hackathon.cosanostra.uiComponents.roomJoin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import cris.hackathon.cosanostra.R;
import cris.hackathon.cosanostra.uiComponents.room.RoomActivity;

public class RoomJoinActivity extends AppCompatActivity {

    Button button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_join);

        button4 = (Button) findViewById(R.id.button4);
//algo de aca rompe la app
        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0)
            {
                Intent intent = new Intent(RoomJoinActivity.this, RoomActivity.class);
                intent.putExtra("previousActivity","RoomJoin");
                startActivity(intent);
            }
        });





    }
}
