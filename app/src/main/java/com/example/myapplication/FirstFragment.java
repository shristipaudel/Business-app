package com.example.myapplication;
import static android.content.Intent.getIntent;
import static android.content.Intent.getIntentOld;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.example.myapplication.databinding.FragmentFirstBinding;
import com.google.android.material.snackbar.Snackbar;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;
    private TextView text;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        String packageName = "com.ingenico.template";
        binding.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mEdit = binding.enteramount.getText().toString();
                Intent intent = getActivity().getPackageManager().getLaunchIntentForPackage(packageName);
                if(intent != null){
                    intent.putExtra("key", mEdit);
                    intent.putExtra("type","card");
                    startActivity(intent);
                }
             }
        });
        binding.fonepay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String mEdit = binding.enteramount.getText().toString();
                    Intent intent = getActivity().getPackageManager().getLaunchIntentForPackage(packageName);
                    if(intent != null){
                        intent.putExtra("key", mEdit);
                        intent.putExtra("type","fonepay");
                        startActivity(intent);
                    }

                }
            });
        binding.nepalpay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String mEdit = binding.enteramount.getText().toString();
                    Intent intent = getActivity().getPackageManager().getLaunchIntentForPackage(packageName);
                    if(intent != null){
                        intent.putExtra("key", mEdit);
                        intent.putExtra("type","nepalpay");
                        startActivity(intent);
                    }
                }
            });
        return binding.getRoot();
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
//     public void onBackPressed(){
//        .popBackFragment(1);
//    }
//
//    @Override
//    public boolean onBack() {
//        onBackPressed();
//        return true;
//    }

}