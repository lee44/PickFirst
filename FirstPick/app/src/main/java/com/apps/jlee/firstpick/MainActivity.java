package com.apps.jlee.firstpick;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(new MultitouchView(this));
    }
}
