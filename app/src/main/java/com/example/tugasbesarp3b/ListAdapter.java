package com.example.tugasbesarp3b;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class ListAdapter extends BaseAdapter {
    private Activity activity;
    private ArrayList<data> ListAdapter;
    private TextView tvNama;
    private TextView score;

    public ListAdapter(Activity activity){
        this.activity = activity;
        this.ListAdapter = new ArrayList<data>();
    }

    @Override
    public int getCount() {
        return this.ListAdapter.size();
    }

    @Override
    public Object getItem(int position) {
        return this.ListAdapter.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v;
        if(convertView == null){
            v = this.activity.getLayoutInflater().inflate(R.layout.list_layout, null);
        }
        else{
            v = convertView;
        }
        this.tvNama = v.findViewById(R.id.tv_title_menu);
        this.score=v.findViewById(R.id.tv_title_score);
        this.tvNama.setText(this.ListAdapter.get(position).getNama());
        this.score.setText(Integer.toString(this.ListAdapter.get(position).getScore()));
        return v;
    }

    public void add(String nama, int score){
            this.ListAdapter.add(new data(nama,score));
        this.notifyDataSetChanged();
    }

    public void delete(int position){
        updatePresenter(position);
        this.ListAdapter.remove(position);
        this.notifyDataSetChanged();
    }

    public static void updatePresenter(int position){
        presenter.remove(position);
    }

}