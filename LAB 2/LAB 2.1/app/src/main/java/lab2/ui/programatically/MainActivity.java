package lab2.ui.programatically;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    int clicks = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Button gameButton = new Button(this);
        gameButton.setText("Hello, I'm the button");
        setContentView(gameButton);
        gameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicks++;
                gameButton.setText("YOU HAVE PRESSED THE BUTTON "+clicks+" TIMES.");
            }
        });
    }

}
