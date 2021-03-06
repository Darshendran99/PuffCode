package com.example.groupb17;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class NewsFragments extends Fragment {
    //Create String and integer arrays
    String title[], desc[], link[];
    //initialise images
    int images[] = {R.drawable.meta,R.drawable.quantum_ai,R.drawable.games_coding,R.drawable.google_play,R.drawable.elon_musk,R.drawable.intel};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_news, container, false);
        //initiate RecyclerView
        RecyclerView techNews = (RecyclerView) view.findViewById(R.id.techNews) ;
        //Store newsTitle, newsDesc, newsLink into respective String arrays
        title = getResources().getStringArray(R.array.newsTitle);
        desc = getResources().getStringArray(R.array.newsDesc);
        link = getResources().getStringArray(R.array.newsLink);
        //initialise MyAdapter class with parameters
        MyAdapter myAdapter = new MyAdapter(getActivity(), title, desc, link, images);
        techNews.setAdapter(myAdapter);
        techNews.setLayoutManager(new LinearLayoutManager(getActivity()));

/*
        Button urlBtn = (Button) view.findViewById(R.id.urlBtn);
        urlBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer-tech.com/news/2021/oct/25/google-slashes-its-play-store-cut-for-more-developers/"));
                startActivity(browserIntent);
            }
        });

 */

        return view;
    }
    //Create a public onResume method
    public void onResume(){
        super.onResume();
        // Set title bar Name to respective Fragment
        ((MainActivity) getActivity())
                .setActionBarTitle("News");

    }
}