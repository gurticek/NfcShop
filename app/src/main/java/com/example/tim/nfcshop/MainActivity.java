package com.example.tim.nfcshop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewInfo;
    private NfcReader nfcReader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewInfo = (TextView)findViewById(R.id.info);

        nfcReader = new NfcReader(this);

        nfcReader.getNfc();

        ImageView img = (ImageView) findViewById(R.id.imageView);
        img.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), ShoppingCart.class);
                        startActivity(intent);
                    }
                }
        );
    }

    @Override
    protected void onResume() {
        super.onResume();
        nfcReader.enableNfc();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        textViewInfo.setText(nfcReader.getTag(intent));
    }

    @Override
    protected void onPause() {
        super.onPause();
        nfcReader.disableNFC();
    }
}
