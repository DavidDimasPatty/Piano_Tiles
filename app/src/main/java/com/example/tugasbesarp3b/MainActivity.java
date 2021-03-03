package com.example.tugasbesarp3b;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.tugasbesarp3b.FragmentHomepage;
import com.example.tugasbesarp3b.FragmentListener;
import com.example.tugasbesarp3b.R;
import com.example.tugasbesarp3b.gameplay;

public class MainActivity extends AppCompatActivity implements FragmentListener, SensorEventListener {

    private FragmentHomepage fragment1;
    private gameplay game;
    private FragmentManager fragmentManager;
    private menu_fragment menu;
    private FragmentGameOver over;
    private username userr;
    private setting set;
    private static final float VALUE_DRIFT = 1 ;
    private SensorManager mSensorManager;
    private Sensor mSensorAccelerometer;
    private Sensor mSensorMagnetometer;
    private float[] accelerometerReading =new float[3];
    private float[] magnetometerReading = new float[3];
    public static boolean warna=false;
    public static  float pitch;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        this.fragment1 = FragmentHomepage.newInstance();
        this.game = gameplay.newInstance();
        this.menu=menu_fragment.newInstance();
        this.over=FragmentGameOver.newInstance();
        this.userr=username.newInstance();
        this.set=setting.newInstance();
add("david",900);
        this.fragmentManager = this.getSupportFragmentManager();
        FragmentTransaction ft = this.fragmentManager.beginTransaction();
        ft.add(R.id.fragment_container,this.fragment1);
        mSensorManager =(SensorManager) getSystemService(Context.SENSOR_SERVICE);
        this.mSensorAccelerometer=this.mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        this.mSensorMagnetometer=this.mSensorManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD);

        ft.commit();
    }

    @Override
    public void changePage(int page) {
        FragmentTransaction ft = this.fragmentManager.beginTransaction();
        if(page==1){
            ft.replace(R.id.fragment_container,this.fragment1)
                    .addToBackStack(null);
        }else if(page==2){
            ft.replace(R.id.fragment_container,this.game)
                    .addToBackStack(null);
        }
        else if(page==3){
            ft.replace(R.id.fragment_container,this.menu)
                    .addToBackStack(null);
        }
        else if(page==4){
            ft.replace(R.id.fragment_container,this.over)
                    .addToBackStack(null);
        }
        else if(page==5){
            ft.replace(R.id.fragment_container,this.userr)
                    .addToBackStack(null);
        }
        else if(page==6){
            ft.replace(R.id.fragment_container,this.set)
                    .addToBackStack(null);
        }
        ft.commit();
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        int sensorType=event.sensor.getType();

        switch (sensorType){
            case Sensor.TYPE_ACCELEROMETER:
                this.accelerometerReading =event.values.clone();
                break;
            case Sensor.TYPE_MAGNETIC_FIELD:
                this.magnetometerReading =event.values.clone();
                break;

        }

        final float[] rotationMatrix= new float[9];
        mSensorManager.getRotationMatrix(rotationMatrix,null,accelerometerReading,magnetometerReading);

        final float [] orientationAngles= new float[3];
        mSensorManager.getOrientation(rotationMatrix,orientationAngles);
        float azimuth=orientationAngles[0];
        pitch=orientationAngles[1];
        float roll=orientationAngles[2];


    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    @Override
    public void onPause(){
        super.onPause();
        mSensorManager.unregisterListener(this);
    }

    @Override
    public void onResume(){
        super.onResume();
        if(mSensorAccelerometer!=null){
            mSensorManager.registerListener(this, mSensorAccelerometer,SensorManager.SENSOR_DELAY_NORMAL);
        }

        if(mSensorMagnetometer!=null){
            mSensorManager.registerListener(this, mSensorMagnetometer,SensorManager.SENSOR_DELAY_NORMAL);
        }
    }

    public void add(String nama, int score){
        presenter.addToList(nama, score);
    }
    }