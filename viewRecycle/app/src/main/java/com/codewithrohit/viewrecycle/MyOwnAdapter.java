package com.codewithrohit.viewrecycle;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class MyOwnAdapter extends RecyclerView.Adapter<MyOwnAdapter.MyOwnHolder> {

    String[] data1[];
    String[] data2[];
    int img[];
    Context ctx;


    public MyOwnAdapter(Context ct, String s1, String s2, int i1[]) {

        ctx = ct;
        data1 = s1;
        data2= s2;
        img = i1;


    }



    @NonNull
    @Override
    public MyOwnHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyOwnHolder myOwnHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyOwnHolder  extends RecyclerView.ViewHolder{
        public MyOwnHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
