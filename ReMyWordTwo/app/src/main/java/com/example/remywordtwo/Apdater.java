package com.example.remywordtwo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.youth.banner.Banner;

import java.util.List;

public class Apdater extends RecyclerView.Adapter<Apdater.MyAPdater> {


    private List<Bean> ar;

    public Apdater(List<Bean> ar) {
        this.ar = ar;
    }

    @NonNull
    @Override
    public MyAPdater onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        return new MyAPdater(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAPdater myAPdater, int i) {

        Bean bean = ar.get(i);

        myAPdater.picture.setImageResource(R.drawable.bqw);
        myAPdater.name.setText(bean.getName());

        myAPdater.age.setText(bean.getAge()+"  ");




    }

    @Override
    public int getItemCount() {
        return ar.size();
    }

    public class MyAPdater extends RecyclerView.ViewHolder{
        ImageView picture;
        TextView name;
        TextView age;
        public MyAPdater(@NonNull View itemView) {
            super(itemView);
            picture = itemView.findViewById(R.id.picture);
            name=itemView.findViewById(R.id.name);
            age = itemView.findViewById(R.id.age);

        }
    }
}
