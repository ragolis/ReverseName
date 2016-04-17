package com.example.blessed.reversename;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/*
A simple application, that reverses String input entered by a user.
Uses the Model-View-Presenter design pattern.
 */


public class DisplayActivity extends AppCompatActivity implements DisplayView, View.OnClickListener{

    private EditText Name;
    private DisplayPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_view);

        //Binds the edittext to the layout element
        Name = (EditText) findViewById(R.id.name);

        //Binds on click listener to the view object
        findViewById(R.id.ProceedButton).setOnClickListener(this);

        //Assigns a DisplayPresenter object.
        presenter = new DisplayPresenterImpl(this);
    }


    @Override
    public void showMessage(String message) {
        //Displays a toast with the message parameter
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
          //on click of 'Proceed' button passes user entered text to presenter.
          presenter.RetrieveName(Name.getText().toString());
    }
}
