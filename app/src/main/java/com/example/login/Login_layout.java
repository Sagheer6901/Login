package com.example.login;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//public class Login_layout extends AppCompatActivity {
//
//
//    EditText email;
//    EditText password;
//    Button login;
//
//    String email_id = "sagheerrajper619@gmail.com";
//    String pass = "sagheer786";
//
//    String email_txt =email.getText().toString();
//    String password_txt = password.getText().toString();
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.login_layout);
//
//        email = findViewById(R.id.email_txt);
//        password = findViewById(R.id.password_txt);
//        login = findViewById(R.id.login_btn);
//
//        login.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                setLogin();
//            }
//        });
//
//    }
//
//    public void setLogin(){
//
//        if (email_txt.equals(email_id) || password_txt.equals(pass)){
//            Intent intent = new Intent(Login_layout.this,Successful_login.class);
//        }
//        else {
//            Toast.makeText(getBaseContext(),"Invalid email or password!",Toast.LENGTH_LONG).show();
//        }
//    }
//}












import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.os.AsyncTask;

/**
 * A login screen that offers login via email/password.
 */
public class Login_layout extends AppCompatActivity{

//    private String passstr,mbnumberstr;
//    private EditText mMobileNumber;
//    private EditText mPassword;
//    private Button sign_in;
    // private View mProgressView;
    //private View mLoginFormView;
   // ProgressDialog progressDialog;
   // ConnectionClass connectionClass;
    EditText email;
    EditText password;
    Button login;

    String email_id = "sagheerrajper619@gmail.com";
    String pass = "123456786";

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        email = findViewById(R.id.email_txt);
        password = findViewById(R.id.password_txt);
        login = findViewById(R.id.login_btn);






       // progressDialog=new ProgressDialog(this);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSigninSuccess();
            }
        });

    }



    public void onSigninSuccess(){
        Dologin dologin=new Dologin();
        dologin.execute();
    }
//
//    public boolean validate(){
//        boolean valid= true;
//
//        if (passstr.isEmpty() || passstr.length()!=8){
//            mPassword.setError("Please Enter 8 Character Long Passowrd)");
//            valid=false;
//        }
//        if (mbnumberstr.isEmpty() || mbnumberstr.length()!=10){
//            mMobileNumber.setError("Please Enter Valid Mobile Number");
//            valid=false;
//        }
//
//        return valid;
//    }



    private class Dologin extends AsyncTask<String, String, Void> {


            String email_txt =email.getText().toString();
            String password_txt = password.getText().toString();

        //String z="";
       // boolean isSuccess=false;

       // String nm,em,n;


//        @Override
//        protected void onPreExecute() {
//
//
//            progressDialog.setMessage("Loading...");
//            progressDialog.show();
//
//
//            super.onPreExecute();
//        }

        @Override
        protected Void doInBackground(String... params) {
            if (email_txt.equals(email_id) || password_txt.equals(pass)) {
            Intent intent = new Intent(Login_layout.this,Successful_login.class);
            startActivity(intent);
            finish();
        }
        else {
            Toast.makeText(getBaseContext(),"Invalid email or password!",Toast.LENGTH_LONG).show();
        }
            return null;
        }

//        @Override
//        protected void onPostExecute(Void s) {
//            Toast.makeText(getBaseContext(),""+z, Toast.LENGTH_LONG).show();
//
//
//            if(isSuccess) {
//                SharedPreferences sharedPreferences = getSharedPreferences("MyPref",MODE_PRIVATE);
//                SharedPreferences.Editor edtor = sharedPreferences.edit();
//                edtor.putBoolean("isLoggedIn",true);
//                edtor.apply();
//                edtor.commit();
//                Intent intent=new Intent(Login_layout.this,Successful_login.class);
//
//                startActivity(intent);
//                finish();
//            }
//
//
//            progressDialog.hide();
//
//        }
    }

}

