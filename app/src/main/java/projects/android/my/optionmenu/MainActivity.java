package projects.android.my.optionmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.txtName);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
       /* menu.add("About Us");
        menu.add("Contact Us");
        menu.add("Exit");*/
       getMenuInflater().inflate(R.menu.demomenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       super.onOptionsItemSelected(item);

        switch (item.getItemId())
        {
            case R.id.blue:
                textView.setTextColor(getResources().getColor(R.color.colorPrimary));
                break;
            case R.id.darkblue:textView.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                break;
            case R.id.pink:textView.setTextColor(getResources().getColor(R.color.colorAccent));

                break;
        }
        return true;
    }
}
