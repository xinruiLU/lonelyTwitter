package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetActivity extends Activity {
    private TextView item;
    private String string;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        item = (TextView) findViewById(R.id.textView4);
        Intent intent = getIntent();
        string = intent.getStringExtra("hhh");
        item.setText(string);
    }
}
