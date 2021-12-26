package com.beeo_scope;

public class Movies {
    private String name;
    private int imageResourceId;
    public Movies[] movies;

    public static final Movies[] horrors = {
            new Movies("IT", R.drawable.it),
            new Movies("Pet Sematary", R.drawable.petsematary),
            new Movies("Scary Movie", R.drawable.scarymovie),
            new Movies("The Standford Prison Experiment", R.drawable.stanford)
    };
    public static final Movies[] adventures = {
            new Movies("Borat", R.drawable.borat),
            new Movies("Petualangan Sherina", R.drawable.sherina),
            new Movies("Meet The Spartans", R.drawable.spartan),
            new Movies("Summer Wars", R.drawable.summerwars)
    };
    public static final Movies[] sciFis = {
            new Movies("E.T.", R.drawable.et),
            new Movies("Ready Player One", R.drawable.readypo),
            new Movies("Sri Asih", R.drawable.sriasih),
            new Movies("2012", R.drawable.duadua)
    };

    private Movies(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
