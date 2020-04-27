package lab2.more.complex.ui.programmatically;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {
    List<String> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Parent layout
        LinearLayout parent = new LinearLayout(getApplicationContext());
        parent.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        parent.setOrientation(LinearLayout.VERTICAL);

        //Button bar layout
        LinearLayout btnBar = new LinearLayout(getApplicationContext());
        btnBar.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        btnBar.setOrientation(LinearLayout.HORIZONTAL);
        parent.addView(btnBar);

        //Buttons
        Button add = new Button(this);
        add.setText("ADD");
        final Button edit = new Button(this);
        edit.setText("EDIT");
        Button remove = new Button(this);
        remove.setText("REMOVE");
        btnBar.addView(add);
        btnBar.addView(edit);
        btnBar.addView(remove);

        //Edit text
        final EditText editText =  new EditText(this);
        parent.addView(editText);

        //List View
        final ListView listView = new ListView(this);
        parent.addView(listView);

        //apply layout
        setContentView(parent);
        list =  new ArrayList<>();
        list.add("Afghanistan");
        list.add("Albania");
        list.add("Algeria");
        list.add("Andorra");
        ArrayAdapter adapter = new ArrayAdapter<String>(getApplicationContext(),R.layout.item,list);
        listView.setAdapter(adapter);

        //add button onclick listener
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                list.add(text);
                ArrayAdapter adapter = new ArrayAdapter<String>(getApplicationContext(),R.layout.item,list);
                listView.setAdapter(adapter);
            }
        });

        //remove button onclick listener
        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                int index = list.indexOf(text);
                list.remove(index);
                ArrayAdapter adapter = new ArrayAdapter<String>(getApplicationContext(),R.layout.item,list);
                listView.setAdapter(adapter);
            }
        });

    }

}
