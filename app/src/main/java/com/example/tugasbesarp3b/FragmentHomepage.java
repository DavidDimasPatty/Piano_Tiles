package com.example.tugasbesarp3b;

        import android.content.Context;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.Button;
        import android.widget.TextView;

        import androidx.fragment.app.Fragment;

public class FragmentHomepage extends Fragment implements View.OnClickListener  {
    private FragmentListener listener;
    private Button btnPlay;
    private Button score1;
    private Button set;
    private TextView high;
    private  TextView highnama;

    public static FragmentHomepage newInstance(){
        FragmentHomepage fragment1 = new FragmentHomepage();
        return fragment1;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.homepage2,container,false);
        this.btnPlay = view.findViewById(R.id.btn_play);
        this.score1=view.findViewById(R.id.score_page);
        this.set=view.findViewById(R.id.setting);
        this.high=view.findViewById(R.id.highscore);
        this.highnama=view.findViewById(R.id.namahigh);
        this.highnama.setText(highscorenama());
        this.high.setText(highscore());
        btnPlay.setOnClickListener(this);
        score1.setOnClickListener(this);
        set.setOnClickListener(this);
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
        if(v==this.btnPlay){
            listener.changePage(5);
        }
        if(v==this.score1){
            listener.changePage(3);
            Log.d("TAG", "onClick: ");
        }
        if(v==this.set){
            listener.changePage(6);
        }
    }

    public String highscore(){
        int k=presenter.getTotalSize();
        int high=0;
        for(int i=0;i<k;i++){
            if(high<presenter.getScore(i)){
                high=presenter.getScore(i);
            }
        }
        return Integer.toString(high);
    }
    public String highscorenama(){
        int k=presenter.getTotalSize();
        int high=0;
        int pos=0;
        for(int i=0;i<k;i++){
            if(high<presenter.getScore(i)){
                high=presenter.getScore(i);
                pos=i;
            }
        }
        if(high==0){
            return "EMPTY";
        }
        else {
            return presenter.getNama(pos);
        }
        }
}
