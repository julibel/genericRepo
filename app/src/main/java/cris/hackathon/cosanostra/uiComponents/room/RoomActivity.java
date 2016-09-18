package cris.hackathon.cosanostra.uiComponents.room;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import cris.hackathon.cosanostra.R;
import cris.hackathon.cosanostra.uiComponents.roomJoin.RoomJoinActivity;

public class RoomActivity extends AppCompatActivity {

    Button button;
    Button button2;
    Button button3;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);

        Bundle extras = getIntent().getExtras();

        button = (Button) findViewById(R.id.crearSala);
        button2 = (Button) findViewById(R.id.confirmar);
        button3 = (Button) findViewById(R.id.cancelar);
        editText = (EditText) findViewById(R.id.editText);

        if(extras != null){
            button.setVisibility(View.GONE);
            button3.setVisibility(View.GONE);
            editText.setEnabled(false);
            button2.setVisibility(View.VISIBLE);

            button3.setOnClickListener(new View.OnClickListener(){
                public void onClick(View arg0)
                {
                    //ver a donde te manda: pantalla inicial de la partida (no de la app)

                }
            });

        }else{
            button.setOnClickListener(new View.OnClickListener(){
                public void onClick(View arg0)
                {
                    editText.setEnabled(false);
                    button.setVisibility(View.GONE);
                    button2.setVisibility(View.VISIBLE);
                    button3.setVisibility(View.VISIBLE);
                }
            });

            button2.setOnClickListener(new View.OnClickListener(){
                public void onClick(View arg0)
                {
                    //llevar a otro lado (crear intent)
                }
            });

            button3.setOnClickListener(new View.OnClickListener(){
                public void onClick(View arg0)
                {
                    editText.setEnabled(true);
                    button3.setVisibility(View.GONE);
                    button2.setVisibility(View.GONE);
                    button.setVisibility(View.VISIBLE);
                }
            });
        }






    }
}
