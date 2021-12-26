package com.beeo_scope;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SciFiFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        RecyclerView adventureRecycler = (RecyclerView) inflater.inflate(
                R.layout.fragment_sci_fi, container, false);

        String[] sciFiNames = new String[Movies.sciFis.length];
        for (int i = 0; i < sciFiNames.length; i++) {
            sciFiNames[i] = Movies.sciFis[i].getName();
        }

        int[] sciFiImages = new int[Movies.sciFis.length];
        for (int i = 0; i < sciFiImages.length; i++) {
            sciFiImages[i] = Movies.sciFis[i].getImageResourceId();
        }

        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(sciFiNames, sciFiImages);
        adventureRecycler.setAdapter(adapter);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        adventureRecycler.setLayoutManager(layoutManager);
        return adventureRecycler;

    }
}