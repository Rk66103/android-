package com.codewithrohit.recycleagain2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;

public class MyOwnAdapter extends RecyclerView.Adapter<MyOwnAdapter.MyOwnHolder> {

    Context ctx;
    String data1[];
    String data2[];
    int img[];

    public MyOwnAdapter(Context ct, String s1[], String s2[], int i1[]){

        ctx=ct;
        data1 = s1;
        data2= s2;
        img= i1;




    }

    @NonNull
    @Override
    public MyOwnHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        LayoutInflater myInflate= LayoutInflater.from(ctx);

      View myOwn=  myInflate.inflate(R.layout.myown_row, parent,false);


        return new MyOwnHolder(myOwn);


    }

    @Override
    public void onBindViewHolder(@NonNull MyOwnHolder myOwnHolder, int i) {

        myOwnHolder.t1.setText(data1[i]);
        myOwnHolder.t2.setText(data2[i]);
        myOwnHolder.image.setImageResource(img[i]);

    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MyOwnHolder extends RecyclerView.ViewHolder {
        TextView t1,t2;
        ImageView image;
        public MyOwnHolder(@NonNull View itemView) {
            super(itemView);

            t1= (TextView)itemView.findViewById(R.id.t1);
            t2= (TextView)itemView.findViewById(R.id.t2);
            image= (ImageView)itemView.findViewById(R.id.imageView);
        }
    }
}