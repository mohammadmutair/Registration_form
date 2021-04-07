package com.example.indassignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText edttext1,edttext2,edttext3,edttext4;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edttext1=findViewById(R.id.editText1);
        edttext2=findViewById(R.id.editText2);
        edttext3=findViewById(R.id.editText3);
        edttext4=findViewById(R.id.editText4);
        spinner=findViewById(R.id.spinner);

        populateSpinner();
    }

    private void populateSpinner() {

        ArrayList<String> list = new ArrayList<>();
        list.add("Ramallah");
        list.add("Jerusalem");
        list.add("Nablus");
        list.add("Jenin");
        list.add("Tulkarem");
        list.add("Jericho");
        list.add("Hebron");
        list.add("Beit-Lahem");
        list.add("Gaza");
        list.add("Qalqelya");

        ArrayAdapter adapter= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);



    }

    public void btn_onClick(View view) {
        Intent intent=new Intent(this, MainActivity2.class);

        String firstName=edttext1.getText().toString();
        String lastName=edttext2.getText().toString();
        String email=edttext4.getText().toString();
        Integer phone=Integer.parseInt(edttext3.getText().toString());
        String city=spinner.getSelectedItem().toString();

        intent.putExtra("FirstName" , firstName);
        intent.putExtra("LastName" , lastName);
        intent.putExtra("Email" , email);
        intent.putExtra("Phone",phone);
        intent.putExtra("City" , city);
        startActivity(intent);
    }
}