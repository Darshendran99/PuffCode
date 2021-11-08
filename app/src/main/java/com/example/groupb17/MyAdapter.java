package com.example.groupb17;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyNewsHolder> {

    String data1[], data2[];
    int images[];
    Context context;

    public MyAdapter(Context ct, String s1[], String s2[], int img[]){
        context = ct;
        data1 = s1;
        data2 = s2;
        images = img;
    }

    @NonNull
    @Override
    public MyNewsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.news_row, parent, false);
        return new MyNewsHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyNewsHolder holder, int position) {
        holder.titleNews.setText(data1[position]);
        holder.descNews.setText(data2[position]);
        holder.newsImageView.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyNewsHolder extends RecyclerView.ViewHolder{

        TextView titleNews, descNews;
        ImageView newsImageView;

        public MyNewsHolder(@NonNull View itemView) {
            super(itemView);
            titleNews = itemView.findViewById(R.id.titleNews);
            descNews = itemView.findViewById(R.id.descNews);
            newsImageView = itemView.findViewById(R.id.newsImageView);
        }
    }
}
