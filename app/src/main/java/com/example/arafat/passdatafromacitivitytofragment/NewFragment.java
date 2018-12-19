package com.example.arafat.passdatafromacitivitytofragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class NewFragment extends Fragment {



    private String text;
    private int number;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_new, container, false);
        TextView textView = view.findViewById(R.id.text1);

        if(getArguments() != null) {
            text = getArguments().getString("argText");
            number = getArguments().getInt("argNumber");
        }

        textView.setText(text + number);
        

        return view;
    }

}
