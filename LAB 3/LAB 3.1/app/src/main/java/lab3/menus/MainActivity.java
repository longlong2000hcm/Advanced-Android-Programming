package lab3.menus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        TextView textView = findViewById(R.id.textView);
        switch (item.getItemId()) {
            case R.id.red:
                textView.setText("RED");
                textView.setBackgroundColor(0xffff0000);
                textView.invalidate();
                break;
            case R.id.green:
                textView.setText("GREEN");
                textView.setBackgroundColor(0xff00ff00);
                textView.invalidate();
                break;
            case R.id.blue:
                textView.setText("BLUE");
                textView.setBackgroundColor(0xff0000ff);
                textView.invalidate();
                break;
            case R.id.yellow:
                textView.setText("YELLOW");
                textView.setBackgroundColor(0xffffff00);
                textView.invalidate();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}
