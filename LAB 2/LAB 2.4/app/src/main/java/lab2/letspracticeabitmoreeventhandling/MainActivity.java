package lab2.letspracticeabitmoreeventhandling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button english = findViewById(R.id.english);
        Button sverige = findViewById(R.id.sverige);
        Button suomeksi = findViewById(R.id.suomeksi);
        Button surprise = findViewById(R.id.surprise);
        final TextView textView = findViewById(R.id.textView);
        final EditText editText =  findViewById(R.id.editText);
        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Hi "+ editText.getText());
            }
        });
        sverige.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Hejjsan "+ editText.getText());
            }
        });
        suomeksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Terve "+ editText.getText());
            }
        });
        surprise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Hola "+ editText.getText());
            }
        });

    }

}
