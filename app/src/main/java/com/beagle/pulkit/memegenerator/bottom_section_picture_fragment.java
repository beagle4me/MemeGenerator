package com.beagle.pulkit.memegenerator;

/**
 * Created by PULKIT on 4/19/2015.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.TextView;


public class bottom_section_picture_fragment extends Fragment{

    private static TextView TopMemeText;
    private static TextView BottomMemeText;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_section_fragements,container,false);

        TopMemeText = (TextView) view.findViewById(R.id.bottom_section_fragments_top);
        BottomMemeText = (TextView) view.findViewById(R.id.bottom_section_fragments_bottom);


        return view;
    }

    public void setMemeText(String top,String bottom){

        TopMemeText.setText(top);
        BottomMemeText.setText(bottom);
    }
}
