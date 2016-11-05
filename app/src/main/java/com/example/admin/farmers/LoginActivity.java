package com.example.admin.farmers;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity
{
    private Button logbtn;
    private TextView regbtn;
    private dbhendler db;
    private SQLiteDatabase sd;
    private Context context=this;
    private TextView adhara;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        logbtn=(Button)findViewById(R.id.button);
        regbtn=(TextView)findViewById(R.id.text1);
        adhara=(TextView)findViewById(R.id.log);
        db=new dbhendler(context);
        sd=db.getWritableDatabase();

        logbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String un=adhara.getText().toString();
                if(un.equals("")){
                    AlertDialogManager.showAlertDialog(context,"Invalid","Please Enter Adhara Number",false);
                }else{
                    String str="select * from user where adhara_no='"+un+"'";
                    Cursor c=sd.rawQuery(str, null);
                    }

                }

        });

        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Farrmerreg.class);
                startActivity(i);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        if (id==R.id.item1){
            return true;
        }
        if (id==R.id.item2){
            helper.exportDB(context);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
