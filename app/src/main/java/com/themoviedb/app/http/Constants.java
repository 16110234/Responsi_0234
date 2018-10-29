package com.themoviedb.app.http;

public class Constants {


    public static String API_KEY="edcb801148e4f0438cf484b9a73d5eb9";
    private static String API_END_POINT="https://api.themoviedb.org/3/";

    public static String IMAGE_BASE_PATH="https://image.tmdb.org/t/p/w185";
    public static String IMAGE_BASE_PATH_W300="https://image.tmdb.org/t/p/w300";


    public static String MIN_YEAR_FILTER="&primary_release_date.gte=";
    public static String MAX_YEAR_FILTER="&primary_release_date.lte=";

    public static String GET_MOVIES = API_END_POINT+ "discover/movie?api_key="+ API_KEY+ "&sort_by=popularity.desc";

}
