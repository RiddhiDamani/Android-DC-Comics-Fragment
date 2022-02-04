package com.christopherhield.firstfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class SecondFragment extends Fragment {

    private String name;
    private int imageResId;


    public SecondFragment() {
        // Required empty public constructor
    }

    public static SecondFragment newInstance(String name, int imageResId) {
        SecondFragment fragment = new SecondFragment();
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
        View layout = inflater.inflate(R.layout.fragment_second, container, false);
        ((TextView) layout.findViewById(R.id.textView)).setText(name);
        ((ImageView) layout.findViewById(R.id.imageView)).setImageResource(imageResId);
        return layout;
    }

}
