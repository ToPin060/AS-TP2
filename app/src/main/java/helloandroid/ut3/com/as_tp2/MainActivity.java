package helloandroid.ut3.com.as_tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int counter = 0;
    private TextView tv = null;
    private ImageView iv = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Load toto layout
        setContentView(R.layout.toto);

        // Get the TextView1
        tv = (TextView) findViewById(R.id.textView1);
        tv.setText("Bienvenue chez vous");

        iv = (ImageView) findViewById(R.id.imageView1);
    }

    public void mehtodeBouton(View view) {
        // Update counter
        counter++;
        tv.setText("" + counter);

        // Hide image
        iv.setVisibility(View.INVISIBLE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.totomenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu_item_app) {
            tv.setText("" + getString(R.string.menu_item_app_name));
            return true;
        }
        if (item.getItemId() == R.id.menu_item_quit) {
            System.exit(0);
            return true;
        }
        return false;
    }
}