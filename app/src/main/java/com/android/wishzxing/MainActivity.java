package com.android.wishzxing;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.google.zxing.Result;
import com.wishzixing.lib.able.AutoZoomAble;
import com.wishzixing.lib.listener.ResultListener;
import com.wishzixing.lib.util.Utils;
import com.wishzixing.lib.views.WishView;

public class MainActivity extends AppCompatActivity {

    WishView wishView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Utils.init(this);
        wishView = findViewById(R.id.wishView);
        wishView.onCreate(this);
        wishView.getDelegate().regResultListener(new ResultListener() {
            @Override
            public void scanSucceed(Result result) {
                // Toast.makeText(MainActivity.this, result.getText(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void scanImgFail() {

            }
        });


    }
    @Override
    protected void onPause() {
        super.onPause();
        wishView.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        wishView.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        wishView.onDestory();
    }
}
