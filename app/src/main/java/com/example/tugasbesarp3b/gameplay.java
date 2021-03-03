package com.example.tugasbesarp3b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.solver.widgets.Rectangle;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;

import java.util.Random;

public class gameplay extends Fragment  {
    public static FragmentGameOver fgo;
    private FragmentListener listener;
    private Button start;
    private ImageView ivCanvas;
    private Button stop;
    private Bitmap mBitmap;
    public  Canvas mCanvas;
    private Rect r;
    private TextView score;
    private username usere;
    public static boolean flag=false;
    private HandlerTest hantes;
    public static int x = 10;
    public static int y = 10;
    public static int z;
    private Rect rect1;
    private Rect rect2;
    private Rect rect3;
    private Rect rect4;
    private Rect rect5;
    private Rect rect6;
    private Rect rect7;
    private Rect rect8;
    private Rect rect9;
    private Rect rect10;
    private Rect rect11;
    private Rect rect12;
    private Rect rect13;
    private Rect rect14;
    private Rect rect15;
    private Rect rect16;
    private Rect rect17;
    private Rect rect18;
    private Rect rect19;
    private Rect rect20;
    private Rect rect21;
    private Rect rect22;
    private Rect rect23;
    private Rect rect24;
    private Rect rect25;
    private Rect rect26;
    private Rect rect27;
    private Rect rect28;
    private Rect rect29;
    private Rect rect30;
    public static boolean warna1=false;
    public static boolean warna2=false;
    public static boolean warna3=false;
    public static boolean warna4=false;
    public static boolean warna5=false;
    public static boolean warna6=false;
    public static boolean warna7=false;
    public static boolean warna8=false;
    public static boolean warna9=false;
    public static boolean warna10=false;
    public static boolean warna11=false;
    public static boolean warna12=false;
    public static boolean warna13=false;
    public static boolean warna14=false;
    public static boolean warna15=false;
    public static boolean warna16=false;
    public static boolean warna17=false;
    public static boolean warna18=false;
    public static boolean warna19=false;
    public static boolean warna20=false;
    public static boolean warna21=false;
    public static boolean warna22=false;
    public static boolean warna23=false;
    public static boolean warna24=false;
    public static boolean warna25=false;
    public static boolean warna26=false;
    public static boolean warna27=false;
    public static boolean warna28=false;
    public static boolean warna29=false;
    public static boolean warna30=false;
    public static String bener="";


        public static gameplay newInstance(){
            gameplay game = new gameplay();
            return game;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
            View view = inflater.inflate(R.layout.game_play,container,false);

            this.ivCanvas=view.findViewById(R.id.iv_canvas);
            this.score=view.findViewById(R.id.score);
            this.fgo=new FragmentGameOver();
            this.usere=username.newInstance();

            add("david",900);
            this.ivCanvas.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    int action = event.getAction();
                    int xa = (int) event.getX();
                    int y = (int) event.getY();

                    if(y>=1600 && (warna1==false ||
                            warna2==false ||
                            warna3==false ||
                            warna4==false ||
                            warna5==false ||
                            warna6==false ||
                            warna7==false ||
                            warna8==false ||
                            warna9==false ||
                            warna10==false ||
                            warna11==false ||
                            warna12==false ||
                            warna13==false ||
                            warna14==false ||
                            warna15==false ||
                            warna16==false ||
                            warna17==false ||
                            warna18==false ||
                            warna19==false ||
                            warna20==false ||
                            warna21==false ||
                            warna22==false ||
                            warna23==false ||
                            warna24==false ||
                            warna25==false ||
                            warna26==false ||
                            warna27==false ||
                            warna28==false ||
                            warna29==false ||
                            warna30==false )
                            ){
                                listener.changePage(4);
                                add(usere.k,Integer.parseInt(score.getText().toString()));
                              bener="Kamu telat memencet salah satu tiles!";
                                flag=false;
                                    }

                    if((y>=rect1.centerY()-200&&y<=rect1.centerY()+200) && (xa>=rect1.centerX()-100&&xa<=rect1.centerX()+100)&&warna1==true||
                            (y>=rect2.centerY()-200&&y<=rect2.centerY()+200) && (xa>=rect2.centerX()-100&&xa<=rect2.centerX()+100)&&warna2==true||
                            (y>=rect3.centerY()-200&&y<=rect3.centerY()+200) && (xa>=rect3.centerX()-100&&xa<=rect3.centerX()+100)&&warna3==true||
                            (y>=rect4.centerY()-200&&y<=rect4.centerY()+200) && (xa>=rect4.centerX()-100&&xa<=rect4.centerX()+100)&&warna4==true||
                            (y>=rect5.centerY()-200&&y<=rect5.centerY()+200) && (xa>=rect5.centerX()-100&&xa<=rect5.centerX()+100)&&warna5==true||
                            (y>=rect6.centerY()-200&&y<=rect6.centerY()+200) && (xa>=rect6.centerX()-100&&xa<=rect6.centerX()+100)&&warna6==true||
                            (y>=rect7.centerY()-200&&y<=rect7.centerY()+200) && (xa>=rect7.centerX()-100&&xa<=rect7.centerX()+100)&&warna7==true||
                            (y>=rect8.centerY()-200&&y<=rect8.centerY()+200) && (xa>=rect8.centerX()-100&&xa<=rect8.centerX()+100)&&warna8==true||
                            (y>=rect9.centerY()-200&&y<=rect9.centerY()+200) && (xa>=rect9.centerX()-100&&xa<=rect9.centerX()+100)&&warna9==true||
                            (y>=rect10.centerY()-200&&y<=rect10.centerY()+200) && (xa>=rect10.centerX()-100&&xa<=rect10.centerX()+100)&&warna10==true||
                            (y>=rect11.centerY()-200&&y<=rect11.centerY()+200) && (xa>=rect11.centerX()-100&&xa<=rect11.centerX()+100)&&warna11==true||
                            (y>=rect12.centerY()-200&&y<=rect12.centerY()+200) && (xa>=rect12.centerX()-100&&xa<=rect12.centerX()+100)&&warna12==true||
                            (y>=rect13.centerY()-200&&y<=rect13.centerY()+200) && (xa>=rect13.centerX()-100&&xa<=rect13.centerX()+100)&&warna13==true||
                            (y>=rect14.centerY()-200&&y<=rect14.centerY()+200) && (xa>=rect14.centerX()-100&&xa<=rect14.centerX()+100)&&warna14==true||
                            (y>=rect15.centerY()-200&&y<=rect15.centerY()+200) && (xa>=rect15.centerX()-100&&xa<=rect15.centerX()+100)&&warna15==true||
                            (y>=rect16.centerY()-200&&y<=rect16.centerY()+200) && (xa>=rect16.centerX()-100&&xa<=rect16.centerX()+100)&&warna16==true||
                            (y>=rect17.centerY()-200&&y<=rect17.centerY()+200) && (xa>=rect17.centerX()-100&&xa<=rect17.centerX()+100)&&warna17==true||
                            (y>=rect18.centerY()-200&&y<=rect18.centerY()+200) && (xa>=rect18.centerX()-100&&xa<=rect18.centerX()+100)&&warna18==true||
                            (y>=rect19.centerY()-200&&y<=rect19.centerY()+200) && (xa>=rect19.centerX()-100&&xa<=rect19.centerX()+100)&&warna19==true||
                            (y>=rect20.centerY()-200&&y<=rect20.centerY()+200) && (xa>=rect20.centerX()-100&&xa<=rect20.centerX()+100)&&warna20==true||
                            (y>=rect21.centerY()-200&&y<=rect21.centerY()+200) && (xa>=rect21.centerX()-100&&xa<=rect21.centerX()+100)&&warna21==true||
                            (y>=rect22.centerY()-200&&y<=rect22.centerY()+200) && (xa>=rect22.centerX()-100&&xa<=rect22.centerX()+100)&&warna22==true||
                            (y>=rect23.centerY()-200&&y<=rect23.centerY()+200) && (xa>=rect23.centerX()-100&&xa<=rect23.centerX()+100)&&warna23==true||
                            (y>=rect24.centerY()-200&&y<=rect24.centerY()+200) && (xa>=rect24.centerX()-100&&xa<=rect24.centerX()+100)&&warna24==true||
                            (y>=rect25.centerY()-200&&y<=rect25.centerY()+200) && (xa>=rect25.centerX()-100&&xa<=rect25.centerX()+100)&&warna25==true||
                            (y>=rect26.centerY()-200&&y<=rect26.centerY()+200) && (xa>=rect26.centerX()-100&&xa<=rect26.centerX()+100)&&warna26==true||
                            (y>=rect27.centerY()-200&&y<=rect27.centerY()+200) && (xa>=rect27.centerX()-100&&xa<=rect27.centerX()+100)&&warna27==true||
                            (y>=rect28.centerY()-200&&y<=rect28.centerY()+200) && (xa>=rect28.centerX()-100&&xa<=rect28.centerX()+100)&&warna28==true||
                            (y>=rect29.centerY()-200&&y<=rect29.centerY()+200) && (xa>=rect29.centerX()-100&&xa<=rect29.centerX()+100)&&warna29==true||
                            (y>=rect30.centerY()-200&&y<=rect30.centerY()+200) && (xa>=rect30.centerX()-100&&xa<=rect30.centerX()+100)&&warna30==true)
                    {
                        listener.changePage(4);
                        add(usere.k,Integer.parseInt(score.getText().toString()));

                     bener="Kamu memencet tiles lebih dari 1 kali!";
                        flag=false;
                    }



                   if ((y>=rect1.centerY()-200&&y<=rect1.centerY()+200) && (xa>=rect1.centerX()-100&&xa<=rect1.centerX()+100)||
                           (y>=rect2.centerY()-200&&y<=rect2.centerY()+200) && (xa>=rect2.centerX()-100&&xa<=rect2.centerX()+100)||
                           (y>=rect3.centerY()-200&&y<=rect3.centerY()+200) && (xa>=rect3.centerX()-100&&xa<=rect3.centerX()+100)||
                           (y>=rect4.centerY()-200&&y<=rect4.centerY()+200) && (xa>=rect4.centerX()-100&&xa<=rect4.centerX()+100)||
                           (y>=rect5.centerY()-200&&y<=rect5.centerY()+200) && (xa>=rect5.centerX()-100&&xa<=rect5.centerX()+100)||
                           (y>=rect6.centerY()-200&&y<=rect6.centerY()+200) && (xa>=rect6.centerX()-100&&xa<=rect6.centerX()+100)||
                           (y>=rect7.centerY()-200&&y<=rect7.centerY()+200) && (xa>=rect7.centerX()-100&&xa<=rect7.centerX()+100)||
                           (y>=rect8.centerY()-200&&y<=rect8.centerY()+200) && (xa>=rect8.centerX()-100&&xa<=rect8.centerX()+100)||
                           (y>=rect9.centerY()-200&&y<=rect9.centerY()+200) && (xa>=rect9.centerX()-100&&xa<=rect9.centerX()+100)||
                           (y>=rect10.centerY()-200&&y<=rect10.centerY()+200) && (xa>=rect10.centerX()-100&&xa<=rect10.centerX()+100)||
                           (y>=rect11.centerY()-200&&y<=rect11.centerY()+200) && (xa>=rect11.centerX()-100&&xa<=rect11.centerX()+100)||
                           (y>=rect12.centerY()-200&&y<=rect12.centerY()+200) && (xa>=rect12.centerX()-100&&xa<=rect12.centerX()+100)||
                           (y>=rect13.centerY()-200&&y<=rect13.centerY()+200) && (xa>=rect13.centerX()-100&&xa<=rect13.centerX()+100)||
                           (y>=rect14.centerY()-200&&y<=rect14.centerY()+200) && (xa>=rect14.centerX()-100&&xa<=rect14.centerX()+100)||
                           (y>=rect15.centerY()-200&&y<=rect15.centerY()+200) && (xa>=rect15.centerX()-100&&xa<=rect15.centerX()+100)||
                           (y>=rect16.centerY()-200&&y<=rect16.centerY()+200) && (xa>=rect16.centerX()-100&&xa<=rect16.centerX()+100)||
                           (y>=rect17.centerY()-200&&y<=rect17.centerY()+200) && (xa>=rect17.centerX()-100&&xa<=rect17.centerX()+100)||
                           (y>=rect18.centerY()-200&&y<=rect18.centerY()+200) && (xa>=rect18.centerX()-100&&xa<=rect18.centerX()+100)||
                           (y>=rect19.centerY()-200&&y<=rect19.centerY()+200) && (xa>=rect19.centerX()-100&&xa<=rect19.centerX()+100)||
                           (y>=rect20.centerY()-200&&y<=rect20.centerY()+200) && (xa>=rect20.centerX()-100&&xa<=rect20.centerX()+100)||
                           (y>=rect21.centerY()-200&&y<=rect21.centerY()+200) && (xa>=rect21.centerX()-100&&xa<=rect21.centerX()+100)||
                           (y>=rect22.centerY()-200&&y<=rect22.centerY()+200) && (xa>=rect22.centerX()-100&&xa<=rect22.centerX()+100)||
                           (y>=rect23.centerY()-200&&y<=rect23.centerY()+200) && (xa>=rect23.centerX()-100&&xa<=rect23.centerX()+100)||
                           (y>=rect24.centerY()-200&&y<=rect24.centerY()+200) && (xa>=rect24.centerX()-100&&xa<=rect24.centerX()+100)||
                           (y>=rect25.centerY()-200&&y<=rect25.centerY()+200) && (xa>=rect25.centerX()-100&&xa<=rect25.centerX()+100)||
                           (y>=rect26.centerY()-200&&y<=rect26.centerY()+200) && (xa>=rect26.centerX()-100&&xa<=rect26.centerX()+100)||
                           (y>=rect27.centerY()-200&&y<=rect27.centerY()+200) && (xa>=rect27.centerX()-100&&xa<=rect27.centerX()+100)||
                           (y>=rect28.centerY()-200&&y<=rect28.centerY()+200) && (xa>=rect28.centerX()-100&&xa<=rect28.centerX()+100)||
                           (y>=rect29.centerY()-200&&y<=rect29.centerY()+200) && (xa>=rect29.centerX()-100&&xa<=rect29.centerX()+100)||
                           (y>=rect30.centerY()-200&&y<=rect30.centerY()+200) && (xa>=rect30.centerX()-100&&xa<=rect30.centerX()+100)
                   ){
                        switch (action) {
                            case MotionEvent.ACTION_DOWN:
                                            score.setText(Integer.toString(Integer.parseInt(score.getText().toString()) + 10));
                                            if((y>=rect1.centerY()-200&&y<=rect1.centerY()+200) && (xa>=rect1.centerX()-100&&xa<=rect1.centerX()+100)){
                                                Log.d("TAG", "onTouch: "+y);
                                                warna1=true;
                                            }
                                            if( (y>=rect2.centerY()-200&&y<=rect2.centerY()+200) && (xa>=rect2.centerX()-100&&xa<=rect2.centerX()+100)){
                                                warna2=true;
                                            }
                                            if((y>=rect3.centerY()-200&&y<=rect3.centerY()+200) && (xa>=rect3.centerX()-100&&xa<=rect3.centerX()+100)){
                                                warna3=true;
                                            }

                                            if((y>=rect4.centerY()-200&&y<=rect4.centerY()+200) && (xa>=rect4.centerX()-100&&xa<=rect4.centerX()+100)){
                                                warna4=true;
                                            }
                                            if((y>=rect5.centerY()-200&&y<=rect5.centerY()+200) && (xa>=rect5.centerX()-100&&xa<=rect5.centerX()+100)){
                                                warna5=true;
                                            }
                                            if((y>=rect6.centerY()-200&&y<=rect6.centerY()+200) && (xa>=rect6.centerX()-100&&xa<=rect6.centerX()+100)){
                                                warna6=true;
                                            }
                                            if((y>=rect7.centerY()-200&&y<=rect7.centerY()+200) && (xa>=rect7.centerX()-100&&xa<=rect7.centerX()+100)){
                                                warna7=true;
                                            }
                                            if((y>=rect8.centerY()-200&&y<=rect8.centerY()+200) && (xa>=rect8.centerX()-100&&xa<=rect8.centerX()+100)){
                                            warna8=true;
                                               }
                                            if((y>=rect9.centerY()-200&&y<=rect9.centerY()+200) && (xa>=rect9.centerX()-100&&xa<=rect9.centerX()+100)){
                                                warna9=true;
                                            }
                                            if((y>=rect10.centerY()-200&&y<=rect10.centerY()+200) && (xa>=rect10.centerX()-100&&xa<=rect10.centerX()+100)){
                                            warna10=true;
                                             }
                                            if((y>=rect11.centerY()-200&&y<=rect11.centerY()+200) && (xa>=rect11.centerX()-100&&xa<=rect11.centerX()+100)){
                                                warna11=true;
                                            }
                                            if((y>=rect12.centerY()-200&&y<=rect12.centerY()+200) && (xa>=rect12.centerX()-100&&xa<=rect12.centerX()+100)){
                                            warna12=true;
                                              }

                                            if((y>=rect13.centerY()-200&&y<=rect13.centerY()+200) && (xa>=rect13.centerX()-100&&xa<=rect13.centerX()+100)){
                                                warna13=true;
                                            }
                                            if((y>=rect14.centerY()-200&&y<=rect14.centerY()+200) && (xa>=rect14.centerX()-100&&xa<=rect14.centerX()+100)){
                                            warna14=true;

                                        }
                                            if((y>=rect15.centerY()-200&&y<=rect15.centerY()+200) && (xa>=rect15.centerX()-100&&xa<=rect15.centerX()+100)){
                                            warna15=true;
                                        }
                                            if((y>=rect16.centerY()-200&&y<=rect16.centerY()+200) && (xa>=rect16.centerX()-100&&xa<=rect16.centerX()+100)){
                                            warna16=true;
                                        }
                                            if((y>=rect17.centerY()-200&&y<=rect17.centerY()+200) && (xa>=rect17.centerX()-100&&xa<=rect17.centerX()+100)){
                                            warna17=true;
                                        }
                                            if((y>=rect18.centerY()-200&&y<=rect18.centerY()+200) && (xa>=rect18.centerX()-100&&xa<=rect18.centerX()+100)){
                                            warna18=true;
                                        }
                                            if((y>=rect19.centerY()-200&&y<=rect19.centerY()+200) && (xa>=rect19.centerX()-100&&xa<=rect19.centerX()+100)){
                                                warna19=true;
                                            }
                                            if((y>=rect20.centerY()-200&&y<=rect20.centerY()+200) && (xa>=rect20.centerX()-100&&xa<=rect20.centerX()+100)){
                                                warna20=true;
                                            }
                                            if((y>=rect21.centerY()-200&&y<=rect21.centerY()+200) && (xa>=rect21.centerX()-100&&xa<=rect21.centerX()+100)){
                                                warna21=true;
                                            }
                                            if((y>=rect22.centerY()-200&&y<=rect22.centerY()+200) && (xa>=rect22.centerX()-100&&xa<=rect22.centerX()+100)){
                                                warna22=true;
                                            }  if((y>=rect23.centerY()-200&&y<=rect23.centerY()+200) && (xa>=rect23.centerX()-100&&xa<=rect23.centerX()+100)){
                                            warna23=true;
                                        }
                                            if((y>=rect24.centerY()-200&&y<=rect24.centerY()+200) && (xa>=rect24.centerX()-100&&xa<=rect24.centerX()+100)){
                                                warna24=true;
                                            }
                                            if((y>=rect25.centerY()-200&&y<=rect25.centerY()+200) && (xa>=rect25.centerX()-100&&xa<=rect25.centerX()+100)){
                                                warna25=true;
                                            }
                                            if((y>=rect26.centerY()-200&&y<=rect26.centerY()+200) && (xa>=rect26.centerX()-100&&xa<=rect26.centerX()+100)){
                                                warna26=true;
                                            }  if((y>=rect27.centerY()-200&&y<=rect27.centerY()+200) && (xa>=rect27.centerX()-100&&xa<=rect27.centerX()+100)){
                                            warna27=true;
                                        }  if((y>=rect28.centerY()-200&&y<=rect28.centerY()+200) && (xa>=rect28.centerX()-100&&xa<=rect28.centerX()+100)){
                                            warna28=true;
                                        }  if((y>=rect29.centerY()-200&&y<=rect29.centerY()+200) && (xa>=rect29.centerX()-100&&xa<=rect29.centerX()+100)){
                                            warna29=true;
                                        }
                                             if((y>=rect30.centerY()-200&&y<=rect30.centerY()+200) && (xa>=rect30.centerX()-100&&xa<=rect30.centerX()+100)){
                                       warna30=true;
                                         }
                                break;
                        case MotionEvent.ACTION_MOVE:

                                break;
                            case MotionEvent.ACTION_UP:

                                break;

                        }

                    }

                    else {
                        listener.changePage(4);
                        add(usere.k,Integer.parseInt(score.getText().toString()));
                    bener="Kamu salah memencet!";
                        flag=false;
                    }
                    return false;
                }
            });
            this.hantes= new HandlerTest(this);
            if(flag==false){

            }
            else if(flag==true){
                test();
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

    public void initiateCanvas2(int x, int y) {
        this.mBitmap = Bitmap.createBitmap(this.ivCanvas.getWidth(), this.ivCanvas.getHeight(), Bitmap.Config.ARGB_8888);
        this.ivCanvas.setImageBitmap(mBitmap);
        this.mCanvas = new Canvas(mBitmap);
        Paint paint = new Paint();
        Paint paint2 = new Paint();
        int mBackgroundColor = ResourcesCompat.getColor(getResources(), R.color.colorAccent, null);
        int mColorBall = ResourcesCompat.getColor(getResources(), R.color.Black, null);
        int mColorBall2 = ResourcesCompat.getColor(getResources(), R.color.Red, null);
        mCanvas.drawColor(mBackgroundColor);
        paint.setColor(mColorBall);
        paint2.setColor(mColorBall2);
       //1
        this.rect1 = new Rect();
        rect1.left = 750;
        rect1.top = x-900;
        rect1.right = 950;
        rect1.bottom =y - 900;
        mCanvas.drawRect(rect1, paint);

        //2
        this.rect2 = new Rect();
        rect2.left = 350;
        rect2.top = x-2900;
        rect2.right = 150;
        rect2.bottom =y - 2900;
        mCanvas.drawRect(rect2, paint);
        //3
        this.rect3 = new Rect();
        rect3.left = 450;
        rect3.top = x-3400;
        rect3.right = 650;
        rect3.bottom =y - 3400;
        mCanvas.drawRect(rect3, paint);
        //4
        this.rect4 = new Rect();
        rect4.left = 750;
        rect4.top = x-3900;
        rect4.right = 950;
        rect4.bottom =y - 3900;
        mCanvas.drawRect(rect4, paint);
        //5
        this.rect5 = new Rect();
        rect5.left = 350;
        rect5.top = x-4400;
        rect5.right = 150;
        rect5.bottom =y - 4400;
        mCanvas.drawRect(rect5, paint);
        //6
        this.rect6 = new Rect();
        rect6.left = 450;
        rect6.top = x-4900;
        rect6.right = 650;
        rect6.bottom =y - 4900;
        mCanvas.drawRect(rect6, paint);
        //7
        this.rect7 = new Rect();
        rect7.left = 750;
        rect7.top = x-900;
        rect7.right = 950;
        rect7.bottom =y - 900;
        mCanvas.drawRect(rect7, paint);
        //8
        this.rect8 = new Rect();
        rect8.left = 350;
        rect8.top = x-5400;
        rect8.right = 150;
        rect8.bottom =y - 5900;
        mCanvas.drawRect(rect8, paint);
        //9
        this.rect9 = new Rect();
        rect9.left = 450;
        rect9.top = x-6400;
        rect9.right = 650;
        rect9.bottom =y - 6400;
        mCanvas.drawRect(rect9, paint);
        //10
        this.rect10 = new Rect();
        rect10.left = 750;
        rect10.top = x-6900;
        rect10.right = 950;
        rect10.bottom =y - 6900;
        mCanvas.drawRect(rect10, paint);
        //11
        this.rect11 = new Rect();
        rect11.left = 450;
        rect11.top = x-7400;
        rect11.right = 650;
        rect11.bottom =y - 7400;
        mCanvas.drawRect(rect11, paint);
        //12
        this.rect12 = new Rect();
        rect12.left = 750;
        rect12.top = x-7900;
        rect12.right = 950;
        rect12.bottom =y - 7900;
        mCanvas.drawRect(rect12, paint);
        //13
        this.rect13 = new Rect();
        rect13.left = 350;
        rect13.top = x-8400;
        rect13.right = 150;
        rect13.bottom =y - 8400;
        mCanvas.drawRect(rect13, paint);
        //14
        this.rect14 = new Rect();
        rect14.left = 350;
        rect14.top = x-8900;
        rect14.right = 150;
        rect14.bottom =y - 8900;
        mCanvas.drawRect(rect14, paint);
        //15
        this.rect15 = new Rect();
        rect15.left = 750;
        rect15.top = x-9400;
        rect15.right = 950;
        rect15.bottom =y - 9400;
        mCanvas.drawRect(rect15, paint);
        //16
        this.rect16 = new Rect();
        rect16.left = 750;
        rect16.top = x-9900;
        rect16.right = 950;
        rect16.bottom =y - 9900;
        mCanvas.drawRect(rect16, paint);
        //17
        this.rect17 = new Rect();
        rect17.left = 150;
        rect17.top = x-10400;
        rect17.right = 350;
        rect17.bottom =y - 10400;
        mCanvas.drawRect(rect17, paint);
        //18
        this.rect18 = new Rect();
        rect18.left = 750;
        rect18.top = x-10900;
        rect18.right = 950;
        rect18.bottom =y - 10900;
        mCanvas.drawRect(rect18, paint);
        //19
        this.rect19 = new Rect();
        rect19.left = 750;
        rect19.top = x-11400;
        rect19.right = 950;
        rect19.bottom =y - 11400;
        mCanvas.drawRect(rect19, paint);
        //20
        this.rect20 = new Rect();
        rect20.left = 150;
        rect20.top = x-11900;
        rect20.right = 350;
        rect20.bottom =y - 11900;
        mCanvas.drawRect(rect20, paint);
        //21
        this.rect21 = new Rect();
        rect21.left = 750;
        rect21.top = x-12400;
        rect21.right = 950;
        rect21.bottom =y - 12400;
        mCanvas.drawRect(rect21, paint);
        //22
        this.rect22 = new Rect();
        rect22.left = 750;
        rect22.top = x-12900;
        rect22.right = 950;
        rect22.bottom =y - 12900;
        mCanvas.drawRect(rect22, paint);
        //23
        this.rect23 = new Rect();
        rect23.left = 350;
        rect23.top = x-13400;
        rect23.right = 150;
        rect23.bottom =y - 13400;
        mCanvas.drawRect(rect23, paint);
        //24
        this.rect24 = new Rect();
        rect24.left = 350;
        rect24.top = x-13900;
        rect24.right = 150;
        rect24.bottom =y - 13900;
        mCanvas.drawRect(rect24, paint);
        //25
        this.rect25 = new Rect();
        rect25.left = 350;
        rect25.top = x-14400;
        rect25.right = 150;
        rect25.bottom =y - 14400;
        mCanvas.drawRect(rect25, paint);
        //26
        this.rect26 = new Rect();
        rect26.left = 450;
        rect26.top = x-14900;
        rect26.right = 650;
        rect26.bottom =y - 14900;
        mCanvas.drawRect(rect26, paint);
        //7
        this.rect27 = new Rect();
        rect27.left = 750;
        rect27.top = x-15400;
        rect27.right = 950;
        rect27.bottom =y - 15400;
        mCanvas.drawRect(rect27, paint);
        //8
        this.rect28 = new Rect();
        rect28.left = 350;
        rect28.top = x-15900;
        rect28.right = 150;
        rect28.bottom =y - 15900;
        mCanvas.drawRect(rect28, paint);
        //9
        this.rect29 = new Rect();
        rect29.left = 450;
        rect29.top = x-16400;
        rect29.right = 650;
        rect29.bottom =y - 16400;
        mCanvas.drawRect(rect29, paint);
        //10
        this.rect30 = new Rect();
        rect30.left = 750;
        rect30.top = x-6900;
        rect30.right = 950;
        rect30.bottom =y - 6900;
        mCanvas.drawRect(rect30, paint);

        /*mCanvas.drawRect(350, x - 1400, 150, y - 1400, paint);
       1 mCanvas.drawRect(450, x - 1900, 650, y - 1900, paint);
       2 mCanvas.drawRect(750, x - 2400, 950, y - 2400, paint);
       3 mCanvas.drawRect(350, x - 2900, 150, y - 2900, paint);
       4 mCanvas.drawRect(450, x - 3400, 650, y - 3400, paint);
       5 mCanvas.drawRect(750, x - 3900, 950, y - 3900, paint);
       6 mCanvas.drawRect(350, x - 4400, 150, y - 4400, paint);
       7 mCanvas.drawRect(450, x - 4900, 650, y - 4900, paint);
       8 mCanvas.drawRect(750, x - 5400, 950, y - 5400, paint);
       9 mCanvas.drawRect(350, x - 5900, 150, y - 5900, paint);
       10 mCanvas.drawRect(450, x - 6400, 650, y - 6400, paint);
       11 mCanvas.drawRect(750, x - 6900, 950, y - 6900, paint);
       12 mCanvas.drawRect(450, x - 7400, 650, y - 7400, paint);
       13 mCanvas.drawRect(750, x - 7900, 950, y - 7900, paint);
       14 mCanvas.drawRect(350, x - 8400, 150, y - 8400, paint);
       15 mCanvas.drawRect(450, x - 8900, 650, y - 8900, paint);
       16 mCanvas.drawRect(750, x - 9400, 950, y - 9400, paint);
       17 mCanvas.drawRect(350, x - 9900, 150, y - 9900, paint);
       18 mCanvas.drawRect(450, x - 10400, 650, y - 10400, paint);
       19 mCanvas.drawRect(750, x - 10900, 950, y - 10900, paint);
       20 mCanvas.drawRect(350, x - 10400, 150, y - 10400, paint);
       21 mCanvas.drawRect(450, x - 10900, 650, y - 10900, paint);
       22 mCanvas.drawRect(750, x - 11400, 950, y - 11400, paint);
       23 mCanvas.drawRect(350, x - 11900, 150, y - 11900, paint);
       24 mCanvas.drawRect(450, x - 12400, 650, y - 12400, paint);
       25 mCanvas.drawRect(750, x - 12900, 950, y - 12900, paint);*/

        if(x==15990){
            listener.changePage(4);
            add(usere.k,Integer.parseInt(score.getText().toString()));
            flag=false;
        }
          this.ivCanvas.invalidate();

    }



    public void add(String nama, int score){
        presenter.addToList(nama, score);
    }


    public void test() {
        ThreadTest objTest = new ThreadTest(this.hantes);
                this.ivCanvas.setImageBitmap(mBitmap);
                objTest.start();
    }




}

