package com.christopherhield.firstfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class FourthFragment extends Fragment {

    private String name;
    private int imageResId1;
    private int imageResId2;

    public FourthFragment() {
        // Required empty public constructor
    }

    public static FourthFragment newInstance(
            String name, int imageResId1, int imageResId2) {
        FourthFragment fragment = new FourthFragment();
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
        View layout = inflater.inflate(R.layout.fragment_fourth, container, false);
        ((TextView) layout.findViewById(R.id.textView2)).setText(name);
        ((ImageView) layout.findViewById(R.id.imageView5)).setImageResource(imageResId1);
        ((ImageView) layout.findViewById(R.id.imageView6)).setImageResource(imageResId2);
        return layout;
    }
}
