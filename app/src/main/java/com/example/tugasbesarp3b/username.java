package com.example.tugasbesarp3b;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import org.w3c.dom.Text;

import static com.example.tugasbesarp3b.MainActivity.warna;

public class username  extends Fragment implements View.OnClickListener{
    private FragmentListener listener;
    public EditText user;
    private Button play1;
    public static String k;
    public static gameplay gameplayy;

    public static username newInstance(){
        username userre = new username();
        return userre;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.enterusername,container,false);
        this.user = view.findViewById(R.id.user_name);
        this.play1=view.findViewById(R.id.play_button);
        this.play1.setOnClickListener(this);
        this.gameplayy=gameplay.newInstance();
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
        if(v==this.play1){
            if(user.getText().toString().equals("")) {
                Toast.makeText(getContext(),"Masukan Username!",Toast.LENGTH_LONG).show();
            }
            else{
                getEditText();
                Log.d("TAG", k);
                clear();
                gameplayy.flag=true;
                listener.changePage(2);
            }

            }

    }

    public String getEditText(){
        this.k=user.getText().toString();
        return k;
    }

    public void clear(){
        this.user.setText("");
    }


}
