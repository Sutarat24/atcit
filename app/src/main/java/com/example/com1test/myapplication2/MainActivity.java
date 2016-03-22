package com.example.com1test.myapplication2;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.EventObject;

public class MainActivity extends AppCompatActivity {
    //การประกาศตัวแปร
    private EditText userEditText;
    private EditText passwordEditText;
    private Button loginButton;
    private String userString , passwordSting;
    private MyManage myManage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindWidget();
        //request database การดึง database
        myManage = new MyManage(this);

       //ทำปุ่ม
        buttonController();
        // tester add valus
        tester();
    }

    private void tester() {
        myManage.addValueToSQLite(1, "user", "pass", "name");
        myManage.addValueToSQLite(2, "food", "price", "source");
    }

    private void buttonController() {
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userString = userEditText.getText().toString().trim();
                passwordSting = passwordEditText.getText().toString().trim();
                //check space
                if (userString.equals("") || passwordSting.equals("") ) {//Have space
                    MyAlertDialog myAlertDialog = new MyAlertDialog();
                    myAlertDialog.myDialog(MainActivity.this,
                            "มีช่องว่าง","กรุณากรอกทุกช่อง คะ ");


                }
                else {
                    //ทำฐานข้อมูล

                                    }
            }//onclick เมื่อมีการคลิกปุ่มจะมีการทำงาน
        });
    }//buttoncontroller

    private void bindWidget() {
        //Alt + enter
        userEditText = (EditText) findViewById(R.id.editText);
        passwordEditText = (EditText) findViewById(R.id.editText2);
        loginButton = (Button) findViewById(R.id.button);

    }




}//main class คลาสหลัก
