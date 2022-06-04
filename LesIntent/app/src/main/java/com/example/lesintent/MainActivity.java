package com.example.lesintent;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b0,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0=findViewById(R.id.btn0);
        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        b3=findViewById(R.id.btn3);
        b3=findViewById(R.id.btn4);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alert =new AlertDialog.Builder(MainActivity.this);
                alert.setTitle("Boite 1");
                alert.setMessage("Message avec un seul button ");
                alert.show();

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alert =new AlertDialog.Builder(MainActivity.this);
                alert.setTitle("Boite 1");
                alert.setMessage("Message avec un seul button ");
                alert.setIcon(R.drawable.ic_launcher_background);
                alert.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),"Clique sur le button OK",Toast.LENGTH_LONG).show();
                    }
                });
                alert.show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alert =new AlertDialog.Builder(MainActivity.this);
                alert.setTitle("Boite 3");
                alert.setMessage("Message avec un seul button ");
                alert.setIcon(R.drawable.ic_launcher_background);
                alert.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),"Clique sur le button OK",Toast.LENGTH_LONG).show();
                    }
                });
                alert.setNegativeButton("no", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),"Clique sur le button no",Toast.LENGTH_LONG).show();
                    }
                });
                alert.show();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alert =new AlertDialog.Builder(MainActivity.this);
                alert.setTitle("Boite 4");
                alert.setMessage("Message avec un seul button ");
                alert.setIcon(R.drawable.ic_launcher_background);
                alert.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),"Clique sur le button OK",Toast.LENGTH_LONG).show();
                    }
                });
                alert.setNegativeButton("no", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),"Clique sur le button no",Toast.LENGTH_LONG).show();
                    }
                    });
                alert.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),"Clique sur le button Cancel",Toast.LENGTH_LONG).show();
                    }
                });
                alert.show();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (android.os.Build.VERSION.SDK_INT <= android.os.Build.VERSION_CODES.O) {
                    Notification.Builder n =new Notification.Builder(MainActivity.this);
                    n.setContentTitle("Alerte de test");
                    n.setContentText("Message de mon alerte ");
                    n.setSmallIcon(R.drawable.ic_launcher_background);
                    n.setDefaults(Notification.DEFAULT_SOUND);
                    NotificationManager mNotification = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    mNotification.notify(1,n.build());
                }
                else{
                    String CHANNEL_ID = CHANNEL_ID = "my_channel_01";// The id of the channel.
                    CharSequence name = "CHANNEL NEW NAME";
                    int importance = NotificationManager.IMPORTANCE_HIGH;
                    NotificationChannel mChannel = mChannel = new NotificationChannel(CHANNEL_ID, name, importance);
                    Notification notification = new Notification.Builder(MainActivity.this)
                            .setContentTitle("New Message")
                            .setContentText("You've received new messages.")
                            .setSmallIcon(R.drawable.ic_launcher_background)
                            .setChannelId(CHANNEL_ID)
                            .build();
                    NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                    mNotificationManager.createNotificationChannel(mChannel);
                    mNotificationManager.notify(1 , notification);

                }
            }
        });
    }
}