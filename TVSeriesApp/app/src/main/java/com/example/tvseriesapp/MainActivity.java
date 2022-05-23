package com.example.tvseriesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import com.SeriesList;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private  SeriesList seriesList = new SeriesList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickChoose(View view) {
        TextView textView = findViewById(R.id.series_text);
        Spinner spinner = findViewById(R.id.genre_list);
        String getList = String.valueOf(spinner.getSelectedItem());

        List<String> listTv = seriesList.getListTv(getList);
        StringBuilder listModified = new StringBuilder();
        for (String lists: listTv) {
            listModified.append(lists).append('\n');
        }
        textView.setText(listModified);

    }
}