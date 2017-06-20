package com.amarpreetsinghprojects.rvcheckbox;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by kulvi on 06/19/17.
 */

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.ViewHolder> {

    ArrayList<Student> studentArrayList;
    Context context;

    public StudentAdapter(ArrayList<Student> studentArrayList, Context c) {
        this.studentArrayList = studentArrayList;
        this.context = c;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater l = LayoutInflater.from(context);
        View v = l.inflate(R.layout.single_list_item,parent,false);
        ViewHolder vH = new ViewHolder(v);
        return vH;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        final Student s = studentArrayList.get(position);

        holder.name.setText(s.getName());

        holder.checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                s.setCheck(isChecked);
                Toast.makeText(context,"Positon Clicked : "+ position,Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return studentArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        CheckBox checkBox;
        public ViewHolder(View itemView) {
            super(itemView);

            name = (TextView)itemView.findViewById(R.id.name);
            checkBox = (CheckBox)itemView.findViewById(R.id.checkbox);
        }
    }
}
