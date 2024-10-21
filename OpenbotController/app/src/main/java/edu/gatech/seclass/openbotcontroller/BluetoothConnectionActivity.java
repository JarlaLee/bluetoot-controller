package edu.gatech.seclass.openbotcontroller;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BluetoothConnectionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 将状态栏颜色设置为透明
        getWindow().setStatusBarColor(Color.GRAY);
        setContentView(R.layout.activity_bluetooth_connection);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.bluetooth_connection), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        //    设置全屏模式，隐藏状态栏
        //    getWindow().getDecorView().setSystemUiVisibility(
        //            View.SYSTEM_UI_FLAG_LAYOUT_STABLE
        //            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
    }
}
