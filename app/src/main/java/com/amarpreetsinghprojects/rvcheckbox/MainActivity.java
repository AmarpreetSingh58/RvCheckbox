package com.amarpreetsinghprojects.rvcheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Student> studentArrayList = new ArrayList<>();

        studentArrayList.add(new Student("Amarpreet Singh",false));
        studentArrayList.add(new Student("Axcel",false));
        studentArrayList.add(new Student("Blaze",false));
        studentArrayList.add(new Student("Modic",false));
        studentArrayList.add(new Student("Pawan Singh",false));
        studentArrayList.add(new Student("Hrsimran Singh",false));
        studentArrayList.add(new Student("Nikka",false));

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        StudentAdapter adapter = new StudentAdapter(studentArrayList,this);
        recyclerView.setAdapter(adapter);

        Button showButton = (Button)findViewById(R.id.showEnabled);
        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toast_String = "";
                Student s;
                for (int i = 0; i<studentArrayList.size();i++){
                    s=studentArrayList.get(i);
                    if (s.getCheck()) {
                        toast_String = toast_String + s.getName()+"\n";
                    }
                }

                Toast.makeText(getBaseContext(),toast_String,Toast.LENGTH_SHORT).show();
            }
        });


    }
}
