package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adaptar extends RecyclerView.Adapter<Adaptar.ViewHolder> {
    private final Interface anInterface;
    private List<modelClass> userList;

    public Adaptar(List<modelClass> userList,Interface anInterface) {
        this.userList=userList;
        this.anInterface=anInterface;
    }


    @NonNull
    @Override
    public Adaptar.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cycle_element,parent,false);
        return new ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull Adaptar.ViewHolder holder, int position) {

        String name=userList.get(position).getName();
        String descrip=userList.get(position).getDescrip();
        int image=userList.get(position).getImage();

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(anInterface!=null){
                    int position=holder.getAdapterPosition();
                    if(position!=RecyclerView.NO_POSITION){
                        anInterface.onItemClick(position);
                    }
                }

            }
        });

        holder.setData(image,name,descrip);



    }

    @Override
    public int getItemCount() {

        return userList.size();
    }




    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView nameView;
        private TextView DescripView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //here use xml ids
            //give different name not like constructor
            imageView=itemView.findViewById(R.id.imageView);
            nameView=itemView.findViewById(R.id.nameView);
            DescripView=itemView.findViewById(R.id.descripView);


        }

        public void setData(int image, String name, String descrip) {

            imageView.setImageResource(image);
            nameView.setText(name);
            DescripView.setText(descrip);


        }
    }
}