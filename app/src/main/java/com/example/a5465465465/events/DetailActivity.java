package com.example.a5465465465.events;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.a5465465465.events.Model.Event;
import com.example.a5465465465.events.Utils.Common;

/**
 * Created by 5465465465 on 2/7/2017.
 */

public class DetailActivity extends Activity {

    TextView tvTitle,tvDescription, tvDate, tvPlace, tvPersonal, tvCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        initUI();
        setInfo();
    }

    private void initUI() {
        ImageView imagedata=(ImageView) findViewById(R.id.image_hm);
        imagedata.setImageResource(R.drawable.deta);

        ImageView imag4 = (ImageView) findViewById(R.id.img_dedaback);
        imag4.setImageResource(R.drawable.backbutton);
        imag4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

        tvTitle = (TextView)findViewById(R.id.txttitle);
        tvDescription = (TextView)findViewById(R.id.txtdescription);
        tvDate = (TextView)findViewById(R.id.txtdate);
        tvPlace = (TextView)findViewById(R.id.txtplace);
        tvPersonal = (TextView)findViewById(R.id.txtPerson);
        tvCategory = (TextView)findViewById(R.id.txtcategory);
    }

    private void setInfo() {
        Event event = Common.getInstance().listEvents.get(Common.getInstance().nCurrentEventIndex);

        tvTitle.setText(event.get_title());
        tvDescription.setText(event.get_description());
        tvDate.setText(event.get_date());
        tvPlace.setText(event.get_zip());
        tvPersonal.setText(event.get_person());
        tvCategory.setText(event.get_category());
    }
}
