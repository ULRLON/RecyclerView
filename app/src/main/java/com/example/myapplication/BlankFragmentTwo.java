package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BlankFragmentTwo#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragmentTwo extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    List<modelClass> characterList;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public BlankFragmentTwo() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     *
     * @return A new instance of fragment BlankFragmentTwo.
     */
    // TODO: Rename and change types and number of parameters
    public static BlankFragmentTwo newInstance(Bundle savedInstanceState) {
        BlankFragmentTwo fragment = new BlankFragmentTwo();
        Bundle args = new Bundle();
        args=savedInstanceState;
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_blank_two, container, false);
        characterList=Data.initData(characterList);
        ImageView imageView=view.findViewById(R.id.imageView2);
        TextView textView=view.findViewById(R.id.descriptxt);
        int position=getArguments().getInt("position");
        imageView.setImageResource(characterList.get(position).getImage());
        textView.setText(characterList.get(position).getDescrip());
        return view;
    }
}