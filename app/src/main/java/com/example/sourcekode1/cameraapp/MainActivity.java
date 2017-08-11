package com.example.sourcekode1.cameraapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=(ImageView)findViewById(R.id.imageview);
        button=(Button)findViewById(R.id.btn);



    }
    public void clicked(View view)
    {
        Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent,1);


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bundle bundle=data.getExtras();
        Bitmap bitmap=(Bitmap)bundle.get("data");
        imageView.setImageBitmap(bitmap);
    }
}
