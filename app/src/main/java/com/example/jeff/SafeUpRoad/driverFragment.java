package com.example.jeff.SafeUpRoad;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class driverFragment extends Fragment {

    private View view;
    private Button button;
    private EditText editText1,editText2,editText3;

    public driverFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_driver, container, false);
        button = (Button) view.findViewById(R.id.btndriverinfo);
        editText1 = (EditText) view.findViewById(R.id.driverage);
        editText2 = (EditText) view.findViewById(R.id.cartype);
        editText3 = (EditText) view.findViewById(R.id.carage);

        button.setOnClickListener(new View.OnClickListener() {

            Activity activity = getActivity();


            @Override
            public void onClick(View v) {

                String editTex1 = editText1.getText().toString();
                String editTex2 = editText2.getText().toString();
                String editTex3 = editText3.getText().toString();

                Toast.makeText(activity,"駕駛人年齡已更改為:"+editTex1+"\n"+"車種已更改為:"+editTex2+"\n"+"車齡已更改為:"+editTex3,Toast.LENGTH_SHORT).show();



                      // 還沒寫好的db
//                long result=db.insertTitle(editText1, editText2, editText3);

            }
        });
        return view;
    }

}
