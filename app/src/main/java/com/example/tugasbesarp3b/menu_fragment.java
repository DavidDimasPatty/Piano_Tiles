package com.example.tugasbesarp3b;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import java.util.Objects;

import static com.example.tugasbesarp3b.MainActivity.warna;

public class menu_fragment extends Fragment {

    private ListAdapter adapter;
    private ListView list;

    public static menu_fragment newInstance(){
        menu_fragment mf = new menu_fragment();
        return mf;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.menu_fragment, container, false);
        getActivity().setTitle("Score");
        if (warna==true) {
            v.setBackgroundColor(Color.BLUE);
        }

        this.adapter = new ListAdapter((MainActivity) getActivity());
        this.list = v.findViewById(R.id.menu_lv_view);
        this.list.setAdapter(this.adapter);
        if (warna==true) {
            v.setBackgroundColor(Color.BLUE);
        }
        for(int i = 0; i < presenter.getTotalSize() ; i++){

            this.adapter.add(presenter.getNama(i), presenter.getScore(i));
        }

        return v;
    }


}
