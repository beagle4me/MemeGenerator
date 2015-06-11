package com.beagle.pulkit.memegenerator;

/**
 * Created by PULKIT on 4/19/2015.
 */

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.EditText;

public class top_section_fragement extends Fragment implements View.OnClickListener{

    //ctrl + O to add override method
    private static EditText toptextinput;
    private static EditText bottomtextinput;

    TopsectionListener activitycommander;

    public interface TopsectionListener {
      public void createMeme(String Top, String bottom);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{
            activitycommander = (TopsectionListener) activity;
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_section_fragment,container,false);

        toptextinput = (EditText) view.findViewById(R.id.topTextinput);
        bottomtextinput = (EditText) view.findViewById(R.id.bottomTextinput);

        final Button check = (Button) view.findViewById(R.id.check);
        check.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.check:

                activitycommander.createMeme(toptextinput.getText().toString(),
                        bottomtextinput.getText().toString());

                break;
        }
    }
}
