package com.example.bt_connection;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    private static final int REQUEST_ENABLE_BT = 0;
    private static final int REQUEST_DISCOVER_BT = 1;


    TextView mStatusBTv, mPairedTv;
    ImageView mBIv;
    Button mOnBtn, mOffBtn, mDiscoverBtn, mPairedBtn;

    BluetoothAdapter mBlueAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBIv = findViewById(R.id.bluetoothIv);
        mStatusBTv = findViewById(R.id.stausBluetoothTv);
        mPairedTv = findViewById(R.id.pairedTv);
        mPairedBtn = findViewById(R.id.pairedDevicesBtn);
        mOnBtn = findViewById(R.id.onBtn);
        mOffBtn = findViewById(R.id.offBtn);
        mDiscoverBtn = findViewById(R.id.discoverableBtn);


        mBlueAdapter = BluetoothAdapter.getDefaultAdapter();

        if(mBlueAdapter == null){
            mStatusBTv.setText("Bluetooth is not supported by the device");
        }else{
            //device has bluetooth adapter
        }
    }
}
