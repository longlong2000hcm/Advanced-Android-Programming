package lab3.zoo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.zip.Inflater;

public class MammalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView wolf = findViewById(R.id.wolf);
        ImageView bear = findViewById(R.id.bear);
        ImageView elephant = findViewById(R.id.elephant);
        ImageView lamb = findViewById(R.id.lamb);
        wolf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer;
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.wolf_sound);
                mediaPlayer.start();
            }
        });
        bear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer;
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.bear_sound);
                mediaPlayer.start();
            }
        });
        elephant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer;
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.elephant_sound);
                mediaPlayer.start();
            }
        });
        lamb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer;
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.lamb_sound);
                mediaPlayer.start();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mammals:
                Intent intent = new Intent(getApplicationContext(),MammalActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.birds:
                intent = new Intent(getApplicationContext(),BirdActivity.class);
                startActivity(intent);
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
