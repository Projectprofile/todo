package com.example.androideco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.todo.MainActivity;
import com.example.todo.R;

public class LoginActivity extends AppCompatActivity {

    EditText Email;
    EditText password;
    Button loginbtn;
    //email pattern
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);




        Email=findViewById(R.id.etemail);
        password=findViewById(R.id.etpasswordlogin);
        loginbtn=findViewById(R.id.loginpage);



        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //forgot.setText("Logged in  ");

                 if(Email.isEmpty()){
                    Toast.makeText(LoginActivity.this, "Enter The Username", Toast.LENGTH_SHORT).show();
                }
                //else if (email.matches(emailpattern)) {
                //  Toast.makeText(LoginActivity.this, "Pls.enter valid email", Toast.LENGTH_SHORT).show();

                //}
                else if (pass.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Enter password pls.", Toast.LENGTH_SHORT).show();
                }
                else if(Username.getText().toString().equals("Admin") && Email.getText().toString().equals("sv3085684@gmail.com")&& password.getText().toString().equals("12345")){
                    openActivity2();
                    //not backtrack in previous class
                    finish();
                }
                else{
                    Toast.makeText(LoginActivity.this, "Please try again", Toast.LENGTH_SHORT).show();
                    finish();
                    openActivityi0i();
                }
            }
        });

    }
    public void openActivityi0i(){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);

    }//
    //   private void validate(String user , String pass){
    //      if ({user.equals("Admin")}&&{pass.equals("12345")}) {
    //        Intent intent = new Intent(this, HomeScreenAc.class);
    //  }
    //startActivity(intent);
    //}else{

    //}





    public void openActivity2(){
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);

    }

}
