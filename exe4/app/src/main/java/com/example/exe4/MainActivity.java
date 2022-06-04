package com.example.exe4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

class user{
    String login,password;

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public user(){

    }
    public user(String l,String p){
        login=l;
        password=p;
    }
}
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b;
    EditText n,p;
    ArrayList<user> users=new ArrayList<user>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        user u=new user("toto","toto");
        users.add(u);
        u=new user("tabaze","tabaze20");
        users.add(u);
        u=new user("tabaze1","tabaze20");
        users.add(u);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.con);
        n=findViewById(R.id.nom);
        p=findViewById(R.id.mot);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String nom=n.getText().toString();
        String pass=p.getText().toString();
        boolean ex=false;
        if(!(nom.isEmpty() || pass.isEmpty())){
            for (user u:users) {
                if(u.getLogin().equals(nom) && u.getPassword().equals(pass))ex=true;
            }
            if(ex)Toast.makeText(this, "Connextion OK", Toast.LENGTH_LONG).show();
            else Toast.makeText(this, "Connection KO", Toast.LENGTH_LONG).show();
        }
        else Toast.makeText(this, "Remplir tous les chapms", Toast.LENGTH_LONG).show();
    }
}