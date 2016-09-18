package cris.hackathon.cosanostra.uiComponents.god;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Handler;
import android.widget.Toast;

import cris.hackathon.cosanostra.Init;
import cris.hackathon.cosanostra.R;


public class GodActivity extends AppCompatActivity {

    TextView timerTextView;
    long startTime = 0;

    //runs without a timer by reposting this handler at the end of the runnable
    Handler timerHandler = new Handler();
    Runnable timerRunnable = new Runnable() {

        @Override
        public void run() {
            long millis = System.currentTimeMillis() - startTime;
            int seconds = (int) (millis / 1000);
            int minutes = seconds / 60;
            seconds = seconds % 60;

            timerTextView.setText(String.format("%d:%02d", minutes, seconds));

            timerHandler.postDelayed(this, 500);
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_god);

        final AlertDialog alertDialog = new AlertDialog.Builder(this).create();


        ImageView img= (ImageView) findViewById(R.id.imageView_god);
        img.setImageResource(R.mipmap.ic_god);

        final ImageButton imgButton = (ImageButton) findViewById(R.id.imageButton_accept);
        imgButton.setImageResource(R.drawable.ic_done_black_24dp);

        final ImageButton imgButton_Police = (ImageButton) findViewById(R.id.imageButton_acceptPolice);
        imgButton_Police.setImageResource(R.drawable.ic_done_black_24dp);

        final ImageButton imgButton_Medic = (ImageButton) findViewById(R.id.imageButton_acceptMedic);
        imgButton_Medic.setImageResource(R.drawable.ic_done_black_24dp);

        final TextView textTimer = (TextView) findViewById(R.id.timerTextView);

       imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new CountDownTimer(10000, 1000) {
                    public void onTick(long millisUntilFinished) {
                        alertDialog.setTitle("Tienes ");
                        alertDialog.setMessage("00:"+ (millisUntilFinished/1000));
                        alertDialog.show();
                        textTimer.setTextColor(Color.RED);
                        //here you can have your logic to set text to edittext
                    }

                    public void onFinish() {
                        //textTimer.setText("Listo!");
                        alertDialog.hide();
                       // imgButton.setEnabled(false);
                    }

                }.start();
            }
            });

        imgButton_Police.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new CountDownTimer(10000, 1000) {
                    public void onTick(long millisUntilFinished) {
                        textTimer.setText("" + millisUntilFinished / 1000);
                        textTimer.setTextColor(Color.RED);
                        //here you can have your logic to set text to edittext
                    }

                    public void onFinish() {
                        textTimer.setText("Listo!");
                        imgButton_Police.setEnabled(false);
                    }

                }.start();
            }
        });

        imgButton_Medic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new CountDownTimer(10000, 1000) {
                    public void onTick(long millisUntilFinished) {
                        textTimer.setText("" + millisUntilFinished / 1000);
                        textTimer.setTextColor(Color.RED);
                        //here you can have your logic to set text to edittext
                    }

                    public void onFinish() {
                        textTimer.setText("Listo!");
                        imgButton_Medic.setEnabled(false);
                    }

                }.start();
            }
        });






    }
}
