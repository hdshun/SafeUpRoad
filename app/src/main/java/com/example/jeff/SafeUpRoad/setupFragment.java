package com.example.jeff.SafeUpRoad;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class setupFragment extends Fragment {



    public setupFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_setup, container, false);

        final TextView tv;
        SeekBar mySeek;
        Switch Switch1,Switch2;

        tv = (TextView) rootView.findViewById(R.id.txt_show);
        mySeek = (SeekBar)rootView.findViewById(R.id.sb);
        Switch1=(Switch)rootView.findViewById(R.id.shake);
        Switch2=(Switch)rootView.findViewById(R.id.voice);

        Switch1.setOnClickListener(new View.OnClickListener() {

            Activity activity = getActivity();

            @Override
            public void onClick(View v) {


                Toast.makeText(activity,"震動方式更改成功",Toast.LENGTH_SHORT).show();

            }
        });

        Switch2.setOnClickListener(new View.OnClickListener() {

            Activity activity = getActivity();

            @Override
            public void onClick(View v) {


                Toast.makeText(activity,"語音方式更改成功",Toast.LENGTH_SHORT).show();

            }
        });



        mySeek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                int myProgress=progress;
                tv.setText("當前危險範圍:"+myProgress);


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        return rootView;
    }

}
