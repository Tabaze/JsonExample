package com.example.networkspeed;

import static android.widget.Toast.makeText;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button b1,b2;
    EditText e1,e2,e3,e4;
    ImageView im;
    int actualAng = 0;


    RadioGroup grp;
    CheckBox chk;
    Button reni,add;
    EditText nombreTra,nombreSupp;
    ArrayList<EmpoyePrix> emp;
    TextView Res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1 = findViewById(R.id.btncalc);
        b2 = findViewById(R.id.btneffacers);
        e1 = findViewById(R.id.eDebit);
        e2 = findViewById(R.id.iddown);
        e3 = findViewById(R.id.idupload);
        e4 = findViewById(R.id.idreseaux);
        im = findViewById(R.id.idaigu);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer debit = Integer.valueOf(e1.getText().toString());
                calculer(debit);
                e2.setText(String.valueOf(debit*0.75));
                e3.setText(String.valueOf(debit*0.15));
                e4.setText(String.valueOf(debit*0.10));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.getText().clear();
                e2.getText().clear();
                e3.getText().clear();
                e4.getText().clear();

                rotation(actualAng,0);
                actualAng = 0;
            }
        });
        //Question 4
        //nombreTra=findViewById(R.id.nbTra);
        //nombreSupp=findViewById(R.id.nbSupp);
        //Res=findViewById(R.id.Tres);
        grp=findViewById(R.id.grp);
        chk=findViewById(R.id.chkP);
        reni=findViewById(R.id.btncalc);
        add=findViewById(R.id.btncalc);
        //Question 3
        emp=new ArrayList<>();
        emp.add(new EmpoyePrix("Ing??nieur",250.5,300,5000));
        emp.add(new EmpoyePrix("Directeur",300,350,7000));
        emp.add(new EmpoyePrix("Technichien",100,120,3000));
    }
void renitiliser(){
     //Quetion 5
    nombreTra.setText("");
    nombreSupp.setText("");
    Res.setText("");
    nombreTra.requestFocus();
    grp.check(R.id.rdDirec);
    chk.setChecked(false);
}
void clac(){

}

    public void rotation(int ang1, int ang2){
        RotateAnimation rotation = new RotateAnimation(ang1, ang2,RotateAnimation.RELATIVE_TO_SELF,0.7f,RotateAnimation.RELATIVE_TO_SELF,0.5f);
        rotation.setFillAfter(true);
        rotation.setDuration(2000);
        im.startAnimation(rotation);
    }

    public void calculer(int debit){
        if(debit<0){
            makeText(this, "Erreur! le debit doit etre entre 0 et 100Mb/s", Toast.LENGTH_SHORT).show();
            rotation(actualAng,0);
            actualAng = 0;
            return;
        }
        if(debit>100){
            makeText(this, "Erreur! le debit doit etre entre 0 et 100Mb/s", Toast.LENGTH_SHORT).show();
            rotation(actualAng,180);
            actualAng = 180;
            return;
        }

        int angle = 180 * debit/100;
        rotation(actualAng,angle);
        actualAng = angle;
    }
}