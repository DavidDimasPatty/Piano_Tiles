package com.example.tugasbesarp3b;


import android.util.Log;

import java.util.concurrent.ThreadLocalRandom;

public class ThreadTest implements Runnable {
    protected Thread thread;
    protected HandlerTest handler1;
    private gameplay gameplayy;
    private int i=10;

    public ThreadTest(HandlerTest handler1){
        this.handler1 = handler1;
        this.thread = new Thread(this);
    }
    public void start(){
        this.thread.start();
    }
    @Override
    public void run() {
        this.gameplayy=gameplay.newInstance();
           this.i=10;
            for ( i = 10; i < 16000; i = i + 10) {

                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                handler1.setPositionx(i, gameplayy.flag);

        }
    }


}
