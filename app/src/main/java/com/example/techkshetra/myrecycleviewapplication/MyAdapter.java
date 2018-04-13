package com.example.techkshetra.myrecycleviewapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    Context context;
    ArrayList<Bitmap> images = new ArrayList<Bitmap>();

    public MyAdapter(Context context) {
        this.context = context;
        images.add(BitmapFactory.decodeResource(context.getResources(), R.drawable.app_1));
        images.add(BitmapFactory.decodeResource(context.getResources(), R.drawable.app1_2));
        images.add(BitmapFactory.decodeResource(context.getResources(), R.drawable.app_mb3));
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View View = LayoutInflater.from(context).inflate(R.layout.row, parent,false);

        return new ViewHolder(View);
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
        holder.imageView.setImageBitmap(images.get(position));

    }

    @Override
    public int getItemCount() {
        return images.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        public ViewHolder(View itemView){
            super(itemView);
            imageView  = (ImageView) itemView.findViewById(R.id.my_imageView);
        }
    }
}
