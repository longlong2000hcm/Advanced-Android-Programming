package lab3.externalactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button map = findViewById(R.id.map);
        Button call = findViewById(R.id.call);
        final EditText editText = findViewById(R.id.editText);
        Button go = findViewById(R.id.go);

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri location = Uri.parse("geo:0,0?q=Kotkantie+1,+Oulu");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);;
                startActivity(mapIntent);
            }
        });

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri number = Uri.parse("tel:040 1415510");
                Intent callIntent = new Intent(Intent.ACTION_VIEW, number);
                startActivity(callIntent);
            }
        });

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse(editText.getText().toString());
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(webIntent);
            }
        });
    }
}
