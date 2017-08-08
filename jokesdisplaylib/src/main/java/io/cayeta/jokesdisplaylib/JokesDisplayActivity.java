package io.cayeta.jokesdisplaylib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokesDisplayActivity extends AppCompatActivity {

    private static final String JOKE_EXTRA_KEY = "joke";

    TextView mJokeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes_display);

        mJokeTextView = (TextView) findViewById(R.id.tv_joke);

        String joke = getIntent().getStringExtra(JOKE_EXTRA_KEY);
        mJokeTextView.setText(joke);
    }

}