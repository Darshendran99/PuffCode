package com.example.groupb17;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class NewsFragments extends Fragment {

    String s1[], s2[], s3[];
    int images[] = {R.drawable.meta,R.drawable.quantum_ai,R.drawable.games_coding,R.drawable.google_play,R.drawable.elon_musk,R.drawable.intel};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_news, container, false);

        RecyclerView techNews = (RecyclerView) view.findViewById(R.id.techNews) ;
        s1 = getResources().getStringArray(R.array.newsTitle);
        s2 = getResources().getStringArray(R.array.newsDesc);
        s3 = getResources().getStringArray(R.array.newsLink);

        MyAdapter myAdapter = new MyAdapter(getActivity(), s1, s2, s3, images);
        techNews.setAdapter(myAdapter);
        techNews.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;
    }
    public void onResume(){
        super.onResume();
        // Set title bar
        ((MainActivity) getActivity())
                .setActionBarTitle("News");

    }
}