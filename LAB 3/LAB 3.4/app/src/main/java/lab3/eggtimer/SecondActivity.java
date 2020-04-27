package lab3.eggtimer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String time = getIntent().getStringExtra("time");
        Integer countdown = Integer.parseInt(time);
        final TextView timeleft = findViewById(R.id.timeleft);
        new CountDownTimer(countdown*1000, 1000) {

            public void onTick(long millisUntilFinished) {
                timeleft.setText("" + millisUntilFinished / 1000);
            }

            public void onFinish() {
                MediaPlayer mediaPlayer;
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.alarm);
                mediaPlayer.start();
                finish();
            }
        }.start();

    }
}
