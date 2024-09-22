package com.cache;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class MovieRecommendation {

 /*   //L1 cache implementation
    private static final int max_entries = 100;
    private final Map<String,String> recentMovieCache = new LinkedHashMap<String,String>(100,0.75f,true)
    {
        protected boolean removeEldestEntry(Map.Entry<String,String> eldest)
        {
            return size() > max_entries;
        }
    };
    //L2 cache implemantation
    private static final int max_entries_l2 = 1000;
    private final Map<String, String> popularMovieCache = new LinkedHashMap<String,String>(1000,0.75f,true){
        protected boolean removeEldestEntry(Map.Entry<String, String> eldest)
        {
            return size() > max_entries_l2;
        }
    }
*/
    public static void main(String[] args) {

        Map<String,String> recentMovieCache = new LinkedHashMap<String,String>(100,0.75f,true);
        Map<String, String> popularMovieCache = new LinkedHashMap<String,String>(1000,0.75f,true);

        String []generes = {"Action", "Comedy", "Drama", "Horror", "Romance","Sci-Fi", "Thriller"};

        //write code to generate random 1000 movies
        for(int i = 0; i<2000; i++)
        {
            String movie = "movie"+i;
            String genre = generes[new Random().nextInt(generes.length)];
            popularMovieCache.put(movie,genre);
        }

        //write code to generate most viewd movies
        for(int i = 0; i<100; i++)
        {
            String movie = "movie"+i;
            recentMovieCache.put(movie,"Recently viewed");
        }


        
    }
    
}
