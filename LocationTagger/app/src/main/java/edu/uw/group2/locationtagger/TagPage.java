package edu.uw.group2.locationtagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TagPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tag_page);

        Bundle args = getIntent().getExtras();
        String title = args.getString("title");
        String description = args.getString("description");


        ((TextView)findViewById(R.id.title)).setText(title);
        ((TextView)findViewById(R.id.description)).setText(description);


    }


}