package com.example.groupb17;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

// extend to RecyclerView.Adapter
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyNewsHolder> {
    //Create variables and context
    String news1[], news2[], news3[];
    int newsImages[];
    Context context;

    //Create a MyAdapter with variables and context as parameters
    public MyAdapter(Context ctNews, String title[], String desc[], String link[], int images[]){
        //Store variables and context inside constructors
        context = ctNews;
        news1 = title;
        news2 = desc;
        news3 = link;
        newsImages = images;
    }
    // Auto implemented Method
    @NonNull
    @Override
    public MyNewsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Create LayoutInflater object
        LayoutInflater inflater = LayoutInflater.from(context);
        //Store Inflater news_row.xml in View
        View view = inflater.inflate(R.layout.news_row, parent, false);
        return new MyNewsHolder(view);
    }
    // Auto implemented Method
    @Override
    public void onBindViewHolder(@NonNull MyNewsHolder holder, int position) {
        //setText to TextView and setImageResource toImageView
        holder.titleNews.setText(news1[position]);
        holder.descNews.setText(news2[position]);
        holder.linkNews.setText(news3[position]);
        holder.newsImageView.setImageResource(newsImages[position]);
    }
    // Auto implemented Methods
    @Override
    public int getItemCount() {
        return newsImages.length;
    }

    //extend generated class to RecyclerView.ViewHolder
    public class MyNewsHolder extends RecyclerView.ViewHolder{
        // Initiate TextView and ImageView
        TextView titleNews, descNews, linkNews;
        ImageView newsImageView;

        //Constructor auto generated
        public MyNewsHolder(@NonNull View itemView) {
            super(itemView);
            //findViewById for TextView and ImageView from news_row.xml
            titleNews = itemView.findViewById(R.id.titleNews);
            descNews = itemView.findViewById(R.id.descNews);
            linkNews = itemView.findViewById(R.id.linkNews);
            newsImageView = itemView.findViewById(R.id.newsImageView);
        }
    }
}
