package com.example.tugasbesarp3b;

import java.util.ArrayList;

public class presenter {
    static ArrayList<data> alData = new ArrayList<data>();
    public static void addToList(String nama, int score){
        alData.add(new data(nama,score));
    }
    public static String getNama(int position){
        return alData.get(position).getNama();
    }
    public static int getTotalSize(){
        return alData.size();
    }
    public static int getScore(int position){
        return alData.get(position).getScore();
    }
    public static void remove(int position){
        alData.remove(position);
    }
}
