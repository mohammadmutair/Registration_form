package com.example.indassignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();

        String firstName=intent.getStringExtra("FirstName");
        String lastName=intent.getStringExtra("LastName");
        String email=intent.getStringExtra("Email");
        int phone=intent.getExtras().getInt("Phone");
        String city=intent.getStringExtra("City");

        TextView firstname=findViewById(R.id.textView1);
        TextView Email=findViewById(R.id.textView3);
        TextView Phone=findViewById(R.id.textView4);
        TextView City=findViewById(R.id.textView6);

        firstname.setText("Your full name is: "+firstName+" "+lastName);
        Email.setText("Your email address is: "+email);
        Phone.setText("Your phone number is: "+phone);
        City.setText("Your City is: "+city);




    }
}