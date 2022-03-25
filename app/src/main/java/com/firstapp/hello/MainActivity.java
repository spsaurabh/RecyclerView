package com.firstapp.hello;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
//Recycler view demo application
public class MainActivity extends AppCompatActivity {

    String s1[],s2[];
    RecyclerView recyclerView;
    int images[] = {R.drawable.india, R.drawable.pakistan,R.drawable.afg,R.drawable.bangla,R.drawable.aus,R.drawable.ire,R.drawable.netherland,R.drawable.newzealand,};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        s1= getResources().getStringArray(R.array.Teams);
        s2= getResources().getStringArray(R.array.Teams);

        MyAdapter myAdapter = new MyAdapter(this,s1,s2,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}