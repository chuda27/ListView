package com.choirulhuda.belajarlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView lvCountry;
    private ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvCountry = findViewById(R.id.lv_country);

        adapter = ArrayAdapter.createFromResource(this, R.array.country_array,
                R.layout.support_simple_spinner_dropdown_item);
        lvCountry.setAdapter(adapter);
        lvCountry.setOnItemClickListener(this);

    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, adapter.getItem(i), Toast.LENGTH_SHORT).show();
    }
}