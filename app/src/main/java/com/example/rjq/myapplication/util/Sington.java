package com.example.rjq.myapplication.util;

import android.content.Context;

import com.example.rjq.myapplication.fragment.OneFragment;

public class Sington {
    private volatile static Sington single; //volatile可加可不加，因为synchronized也能保证single的可见性
    public static final Sington singles = new Sington();
    public OneFragment.Test test;
    private Sington(){}
    public static Sington getInstance(){
        if (single == null){
            synchronized(Sington.class){
                if (single == null){
                    single = new Sington();
                }
            }
        }
        return single;
    }
}
