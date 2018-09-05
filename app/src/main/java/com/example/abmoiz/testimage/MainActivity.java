package com.example.abmoiz.testimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.github.chrisbanes.photoview.PhotoViewAttacher;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {


    PhotoViewAttacher photoViewAttacher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       // SubsamplingScaleImageView imageView = (SubsamplingScaleImageView)findViewById(R.id.imageView);
       // imageView.setImage(ImageSource.resource(R.drawable.map).tilingEnabled());

        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        Picasso.get()
                .load(R.drawable.map).fit()
              .into(imageView);


        photoViewAttacher=new PhotoViewAttacher(imageView);
      //  photoViewAttacher.setScaleType(ImageView.ScaleType.FIT_XY);



    }
}
