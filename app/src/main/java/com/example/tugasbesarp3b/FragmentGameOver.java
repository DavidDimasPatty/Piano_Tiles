package com.example.tugasbesarp3b;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import static com.example.tugasbesarp3b.MainActivity.warna;

public class FragmentGameOver  extends Fragment implements View.OnClickListener{
    private FragmentListener listener;
    private Button playover;
    private Button scoreover;
    private Button home1;
    private TextView alas;

    public static FragmentGameOver newInstance(){
        FragmentGameOver over = new FragmentGameOver();
        return over;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.game_over,container,false);
        this.playover = view.findViewById(R.id.play_over);
        this.scoreover=view.findViewById(R.id.score_over);
        this.home1=view.findViewById(R.id.home);
        this.alas=view.findViewById(R.id.alasann);
        this.alas.setText(gameplay.bener);
        playover.setOnClickListener(this);
        scoreover.setOnClickListener(this);
        home1.setOnClickListener(this);
        if (warna==true) {
            view.setBackgroundColor(Color.BLUE);
        }
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof  FragmentListener){
            this.listener = (FragmentListener) context;
        } else{
            throw new ClassCastException(context.toString()
                    + " must implement FragmentListener");
        }
    }
    @Override
    public void onClick(View v) {
        if(v==this.playover){
            listener.changePage(5);
        }
        if(v==this.scoreover){
            listener.changePage(3);
        }
        if(v==this.home1){
            listener.changePage(1);
        }
    }

        public void settek(String k){
            this.alas.setText(k);
        }
}
