package com.example.tugasbesarp3b;

import android.content.Context;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import static androidx.core.content.ContextCompat.getSystemService;
import static com.example.tugasbesarp3b.MainActivity.pitch;
import static com.example.tugasbesarp3b.MainActivity.warna;

public class setting extends Fragment implements View.OnClickListener {
    private FragmentListener listener;
    private static final float VALUE_DRIFT = 0 ;
    private Sensor mSensorAccelerometer;
    private Sensor mSensorMagnetometer;
    private  MainActivity main;
    private float[] accelerometerReading =new float[3];
    private float[] magnetometerReading = new float[3];
    private Button rotate;
    private View view;
    private TextView col;

    public static setting newInstance(){
        setting set = new setting();
        return set;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        this.view = inflater.inflate(R.layout.setting,container,false);
        this.rotate = view.findViewById(R.id.rotate);
        this.col=view.findViewById(R.id.war);

        rotate.setOnClickListener(this);
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
        if(v==this.rotate) {
            if(Math.abs(pitch)<-1.5){
                warna=false;
            }

            if(Math.abs(pitch)>1.5){
                warna=true;
                view.setBackgroundColor(Color.BLUE);
            }


            if(Math.abs(pitch)>1.9){
                warna=true;

                view.setBackgroundColor(Color.BLUE);
            }
            Log.d("TAG", "onCreateView: "+warna);
            col.setText(""+warna);
        }
    }
    }
