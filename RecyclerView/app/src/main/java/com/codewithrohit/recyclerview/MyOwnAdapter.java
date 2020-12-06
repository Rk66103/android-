package com.codewithrohit.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MyOwnAdapter extends RecyclerView.Adapter<MyOwnAdapter.MyOwnHolder> {

    String[] data;
    String[] data2;
    int img[];
    Context ctx;
    private ViewGroup parent;


    public MyOwnAdapter(Context ct,String s1[], String s2[], int i1[]){

        ctx=ct;

        data=s1;
        data2=s2;
        img=i1;





    }

    @NonNull
    @Override
    public MyOwnAdapter.MyOwnHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater myInflator = LayoutInflater.from(ctx);
     View myOwnView=   myInflator.inflate(R.layout.my_row,parent,false);
     return new MyOwnHolder(myOwnView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyOwnAdapter.MyOwnHolder myOwnHolder, int i) {
        myOwnHolder.t1.setText(data[i]);
        myOwnHolder.t2.setText(data2[i]);
        myOwnHolder.myImage.setImageResource(img[i]);


    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class MyOwnHolder extends RecyclerView.ViewHolder {

        TextView t1,t2;
        ImageView myImage;

        public MyOwnHolder(@NonNull View itemView) {
            super(itemView);
            t1=(TextView)itemView.findViewById(R.id.t1);
            t2=(TextView)itemView.findViewById(R.id.t2);
            myImage=(ImageView)itemView.findViewById(R.id.imageView);

        }
    }
}
