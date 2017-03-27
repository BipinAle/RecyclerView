package com.recyclerview.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.recyclerview.R;
import com.recyclerview.adapters.RecyclerAdapter;
import com.recyclerview.pojos.SingleRow;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<SingleRow> data;
    private int[] images = {R.mipmap.charlie, R.mipmap.mrbean, R.mipmap.jim};
    private String[] titles = {"Charlie Chaplin", "Mr.Bean", "Jim Carrey"};
    private String[] description = {"Sir Charles Spencer \"Charlie\" Chaplin, KBE was an English comic actor,....",
            "Mr. Bean is a British sitcom created by Rowan Atkinson and Richard Curtis, and starring Atkinson as the title character.",
            "James Eugene \"Jim\" Carrey is a Canadian-American actor, comedian, impressionist, screenwriter..."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            data.add(new SingleRow(titles[i], description[i], images[i]));
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(this,data);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerAdapter);
    }


}
