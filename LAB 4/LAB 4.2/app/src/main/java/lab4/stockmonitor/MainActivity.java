package lab4.stockmonitor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Apple
        final TextView apple = findViewById(R.id.apple);
        String url = "https://financialmodelingprep.com/api/company/price/AAPL?datatype=json";
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        String price = "";
                        try {
                            price = response.getJSONObject("AAPL").getString("price");
                        }
                        catch (JSONException err) {
                            Toast.makeText(getApplicationContext(),err.toString(),Toast.LENGTH_LONG).show();
                        }
                        apple.setText("Apple: " + price + " USD");
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getApplicationContext(),error.toString(),Toast.LENGTH_LONG).show();

                    }
                });
        queue.add(jsonObjectRequest);

        //Google
        final TextView google = findViewById(R.id.google);
        url = "https://financialmodelingprep.com/api/company/price/GOOGL?datatype=json";
        jsonObjectRequest = new JsonObjectRequest
                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        String price = "";
                        try {
                            price = response.getJSONObject("GOOGL").getString("price");
                        }
                        catch (JSONException err) {
                            Toast.makeText(getApplicationContext(),err.toString(),Toast.LENGTH_LONG).show();
                        }
                        google.setText("Alphabet (Google): " + price + " USD");
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getApplicationContext(),error.toString(),Toast.LENGTH_LONG).show();

                    }
                });
        queue.add(jsonObjectRequest);

        //Facebook
        final TextView facebook = findViewById(R.id.facebook);
        url = "https://financialmodelingprep.com/api/company/price/FB?datatype=json";
        jsonObjectRequest = new JsonObjectRequest
                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        String price = "";
                        try {
                            price = response.getJSONObject("FB").getString("price");
                        }
                        catch (JSONException err) {
                            Toast.makeText(getApplicationContext(),err.toString(),Toast.LENGTH_LONG).show();
                        }
                        facebook.setText("Facebook : " + price + " USD");
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getApplicationContext(),error.toString(),Toast.LENGTH_LONG).show();

                    }
                });
        queue.add(jsonObjectRequest);

        //Nokia
        final TextView nokia = findViewById(R.id.nokia);
        url = "https://financialmodelingprep.com/api/company/price/NOK?datatype=json";
        jsonObjectRequest = new JsonObjectRequest
                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        String price = "";
                        try {
                            price = response.getJSONObject("NOK").getString("price");
                        }
                        catch (JSONException err) {
                            Toast.makeText(getApplicationContext(),err.toString(),Toast.LENGTH_LONG).show();
                        }
                        nokia.setText("Nokia : " + price + " USD");
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getApplicationContext(),error.toString(),Toast.LENGTH_LONG).show();
                    }
                });
        queue.add(jsonObjectRequest);

    }
}
