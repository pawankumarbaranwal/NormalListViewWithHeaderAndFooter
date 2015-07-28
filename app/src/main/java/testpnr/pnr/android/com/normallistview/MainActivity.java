package testpnr.pnr.android.com.normallistview;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends ActionBarActivity {

    ListView list;
    String[] names={"Pawan","Nadeem","Sahil","Santosh","Javed","Naman","Sidhant"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        list=(ListView)findViewById(R.id.lvName);
        View header = getLayoutInflater().inflate(R.layout.header, null);
        View footer = getLayoutInflater().inflate(R.layout.footer, null);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,names);
        list.addHeaderView(header);
        list.addFooterView(footer);
        list.setAdapter(adapter);

    }

}
