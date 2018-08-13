package com.example.niloofar.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listObj=findViewById(R.id.lv_name);

        Country Iran=new Country("Iran",88997788);
        Country Germany=new Country("Germany",88765);
        Country Irland=new Country("Irland",9983);
        Country china=new Country("china",99886657);

        ArrayList<Country> dataset=new ArrayList<>();

        dataset.add(Iran);
        dataset.add(Germany);
        dataset.add(Irland);
        dataset.add(china);

        CountryListAdaptor listAdaptor=new CountryListAdaptor(getApplicationContext(),R.layout.country_list_template,dataset);

        listObj.setAdapter(listAdaptor);
    }
}
