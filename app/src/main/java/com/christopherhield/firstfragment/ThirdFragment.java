package com.christopherhield.firstfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class ThirdFragment extends Fragment {


    private String name;
    private int imageResId1;
    private int imageResId2;

    public ThirdFragment() {
        // Required empty public constructor
    }

    public static ThirdFragment newInstance(
            String name, int imageResId1, int imageResId2) {
        ThirdFragment fragment = new ThirdFragment();
        Bundle args = new Bundle();
        args.putString("NAME", name);
        args.putInt("IMAGE1", imageResId1);
        args.putInt("IMAGE2", imageResId2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            name = getArguments().getString("NAME");
            imageResId1 = getArguments().getInt("IMAGE1");
            imageResId2 = getArguments().getInt("IMAGE2");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_third, container, false);
        ((TextView) layout.findViewById(R.id.textView)).setText(name);
        ((ImageView) layout.findViewById(R.id.imageView3)).setImageResource(imageResId1);
        ((ImageView) layout.findViewById(R.id.imageView4)).setImageResource(imageResId2);
        return layout;
    }

}
