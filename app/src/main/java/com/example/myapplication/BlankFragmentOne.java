package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BlankFragmentOne#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragmentOne extends Fragment{

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<modelClass> characterList;
    Adaptar adaptar;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public BlankFragmentOne() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BlankFragmentOne.
     */
    // TODO: Rename and change types and number of parameters
    public static BlankFragmentOne newInstance(String param1, String param2) {
        BlankFragmentOne fragment = new BlankFragmentOne();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
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
        View view=inflater.inflate(R.layout.fragment_blank_one, container, false);
        characterList=Data.initData(characterList);
        initRcycleView(view);
        return view;
    }



    private void initRcycleView(View view) {

        recyclerView= view.findViewById(R.id.cycleView);
        layoutManager=new LinearLayoutManager(getContext());
        layoutManager.setOrientation(recyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        Bundle bundle=new Bundle();
        adaptar=new Adaptar(characterList, new Interface() {
            @Override
            public void onItemClick(int position) {
                bundle.putInt("position",position);
                NavHostFragment.findNavController(BlankFragmentOne.this)
                        .navigate(R.id.action_blankFragmentOne_to_blankFragmentTwo,bundle);
            }
        });
        recyclerView.setAdapter(adaptar);
        adaptar.notifyDataSetChanged();

    }



}