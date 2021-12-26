package com.beeo_scope;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HomeFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        RecyclerView homeRecycler = (RecyclerView) inflater.inflate(
                R.layout.fragment_home, container, false);
        int hl = Movies.horrors.length;
        int al = Movies.adventures.length;
        int sl = Movies.sciFis.length;
        int total = hl + al + sl;
        int i = 0;
        String[] moviesNames = new String[total];
        for (i = 0; i < hl; i++) {
            moviesNames[i] = Movies.horrors[i].getName();
        }
        for (i = hl; i < hl + al; i++) {
            moviesNames[i] = Movies.adventures[i - hl].getName();
        }
        for (i = hl + al; i < total; i++) {
            moviesNames[i] = Movies.sciFis[i - hl - al].getName();
        }

        int[] moviesImages = new int[total];
        for (i = 0; i < hl; i++) {
            moviesImages[i] = Movies.horrors[i].getImageResourceId();
        }
        for (i = hl; i < hl + al; i++) {
            moviesImages[i] = Movies.adventures[i - hl].getImageResourceId();
        }
        for (i = hl + al; i < total; i++) {
            moviesImages[i] = Movies.sciFis[i - hl - al].getImageResourceId();
        }

        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(moviesNames, moviesImages);
        homeRecycler.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        homeRecycler.setLayoutManager(layoutManager);
        return homeRecycler;
    }

}