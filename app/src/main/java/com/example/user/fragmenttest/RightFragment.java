package com.example.user.fragmenttest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author : LiuYang
 * @date : 2018/9/25
 */
public class RightFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container
            , Bundle saveInstanceState){
        View    view = inflater.inflate(R.layout.right_fragment,container,false);
        return view;
    }
}
