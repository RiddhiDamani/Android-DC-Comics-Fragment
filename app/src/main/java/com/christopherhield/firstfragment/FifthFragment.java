package com.christopherhield.firstfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class FifthFragment extends Fragment {

    private String name;
    private int imageResId;

    public FifthFragment() {
        // Required empty public constructor
    }

    public static FifthFragment newInstance(
            String name, int imageResId) {
        FifthFragment fragment = new FifthFragment();
        Bundle args = new Bundle();
        args.putString("NAME", name);
        args.putInt("IMAGE", imageResId);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            name = getArguments().getString("NAME");
            imageResId = getArguments().getInt("IMAGE");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_fifth, container, false);
        ((TextView) layout.findViewById(R.id.textView)).setText(name);
        ((ImageView) layout.findViewById(R.id.imageView2)).setImageResource(imageResId);
        return layout;
    }
}