package mr_auspicious.shivam_kr_shiv.com.menus4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> info = new ArrayList<>();
        info.add("Ram");
        info.add("Rakesh");
        info.add("Rajan");
        info.add("Rajesh");
        info.add("Raman");
        info.add("Rajan");
        info.add("Ramesh");


        ListView listView = (ListView) findViewById(R.id.list); //Declaring the listview

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getBaseContext(),android.R.layout.simple_list_item_1,info); //Declaring the Array Adapter

        listView.setAdapter(arrayAdapter); // Setting the listview to the array adapter...

        registerForContextMenu(listView);
    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Context Menu");
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu); //Inflating the menu layout...
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch(item.getItemId()){

            case R.id.option1:
                Toast.makeText(getBaseContext(), "Option 1", Toast.LENGTH_LONG).show();
                return true;

            case R.id.option2:
                Toast.makeText(getBaseContext(), "Option 2", Toast.LENGTH_LONG).show();
                return true;

            case R.id.option3:
                Toast.makeText(getBaseContext(), "Option 3", Toast.LENGTH_LONG).show();
                return true;

        }
        return super.onContextItemSelected(item);
    }


}
