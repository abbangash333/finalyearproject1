package com.example.finalyearprojectu.edhiBloodBand;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.finalyearprojectu.R;

import androidx.fragment.app.Fragment;

public class Request extends Fragment{

    public Request() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blood_request, container, false);
    }
}