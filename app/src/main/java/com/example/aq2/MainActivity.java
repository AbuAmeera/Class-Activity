package com.example.aq2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList arrayList = new ArrayList<Books>();
    int i=0;
    Books []bookarr = new Books[40] ;
    Button add= findViewById(R.id.add);
    Button saveall= findViewById(R.id.saveall);
    EditText bookname= findViewById(R.id.bookname);
    EditText author= findViewById(R.id.authorname);
    EditText pages= findViewById(R.id.pages);
    Switch available= findViewById(R.id.available);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void addButton(){
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               addToList();
            }
        });
    }
    public  void addToList(){
        String bookn = bookname.getText().toString();
        String auth = author.getText().toString();
        String page = pages.getText().toString();
        String ava = available.getText().toString();
        Books book = new Books(bookn,auth,page,ava);
        bookarr[i] = book;
        i++;
        Toast.makeText(this, "Data is to array \n", Toast.LENGTH_SHORT).show();
    }

    public void saveAll(View view) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = sharedPreferences.edit() ;
        Gson gson = new Gson() ;
        String str = gson.toJson(bookarr) ;
        editor.putString("DATA" , str) ;
        editor.commit() ;
        Toast.makeText(this, "Data is Saved \n"+str, Toast.LENGTH_SHORT).show();

    }
    public void setSaveall(){
        saveall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveAll(view);
            }
        });
    }

}