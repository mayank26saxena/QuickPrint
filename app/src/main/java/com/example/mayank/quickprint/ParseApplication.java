package com.example.mayank.quickprint;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    public static final String YOUR_APPLICATION_ID = "fb5CgCurozUe9PnQ1vSPIDqRV8ElnBPshnsrPJwI" ;
    public static final String YOUR_CLIENT_KEY = "KpptWzduUXrOoQlYNKNwrqvOTGmmhG3idd8VzMnV" ;

    @Override
    public void onCreate() {
        super.onCreate();

        // Add your initialization code here
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, YOUR_APPLICATION_ID, YOUR_CLIENT_KEY);
    }
}
