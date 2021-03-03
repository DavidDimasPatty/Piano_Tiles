package com.example.tugasbesarp3b;

import android.graphics.Color;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

import java.net.Inet4Address;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class HandlerTest extends Handler {
    protected final static int MSG_SET_X_OUTPUT = 0;
    protected gameplay gameplayy;


    public HandlerTest(gameplay gameplayy){
        this.gameplayy = gameplayy;
    }
    @Override
    public void handleMessage(Message msg) {
        if(msg.what == HandlerTest.MSG_SET_X_OUTPUT){
            int parameter=(Integer) msg.obj;
            this.gameplayy.x=parameter;
            this.gameplayy.initiateCanvas2(this.gameplayy.x,this.gameplayy.x+400);
        }
    }

    public void setPositionx(int positionx,boolean flag){
        Message msg = new Message();
        if(flag==true){
        msg.what = MSG_SET_X_OUTPUT;
        msg.obj = positionx;
        this.sendMessage(msg);}
        else{
            msg.what = MSG_SET_X_OUTPUT;
            msg.obj = 10;
            this.sendMessage(msg);
        }
    }

}