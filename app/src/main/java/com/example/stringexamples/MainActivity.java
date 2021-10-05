package com.example.stringexamples;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StringDemo();
    }

    private void StringDemo() {

        String s1 = "abc";

        String s2 = "abc";

        String s7 = new String("abc");

        Log.v("===>>>", "===>>> Is s1 equals s7:" + s1.equals(s7));

        Log.v("===>>>", "===>>> Is s1 === s2:" + (s1 == s2));


        String s3 = new String("abd");

        String s4 = new String("abd");

        Log.v("===>>>", "===>>> Is s3 equals s4:" + s3.equals(s4));

        Log.v("===>>>", "===>>> Is s3 === s42:" + (s3 == s4));


        StringBuilder sb1 = new StringBuilder("abc");

        StringBuilder sb2 = new StringBuilder("abc");

        Log.v("===>>>", "===>>> Is sb1 === sb2:" + (sb1 == sb2));
        Log.v("===>>>", "===>>> Is sb1 equals sb2:" + (sb1.equals(sb2)));


        StringBuffer sb3 = new StringBuffer("abc");

        String s6 = "abc";

        Log.v("===>>>", "===>>> Is sb3 === s6:" + (sb3.equals(s6)));


    }
}