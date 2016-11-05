package com.example.admin.farmers;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

/**
 * Created by admin on 11/2/2015.
 */
public class Farrmerreg extends AppCompatActivity {

    private Button add;

    private dbhendler db;
    private SQLiteDatabase sd;
    private Context context = this;
    private EditText email;
    private EditText fname;
    private EditText lname;
    private EditText ph;
    private EditText address;
    private EditText adhar;

    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regestration);
        {

            db=new dbhendler(context);
            sd=db.getWritableDatabase();
            add = (Button) findViewById(R.id.reg);
            adhar=(EditText)findViewById(R.id.an);
            email = (EditText) findViewById(R.id.username);
            fname = (EditText) findViewById(R.id.txtfname);
            lname = (EditText) findViewById(R.id.txtlname);
            ph = (EditText) findViewById(R.id.txtphone);
            address = (EditText) findViewById(R.id.txtadd);

            add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String user= email.getText().toString();
                    String fn=fname.getText().toString();
                    String ln=lname.getText().toString();
                    String phn=ph.getText().toString();
                    String add1=address.getText().toString();
                    String adhar_card=adhar.getText().toString();
                    String str0="insert into user (first_name,last_name,mobile,address,email,,adhar_no) values ('" + fn + "','" + ln + "',' " + phn + " ',' " + add1 +" ','"+ user +"','"+adhar_card+"');";
                    sd.execSQL(str0);
                    Toast.makeText(getApplicationContext(), "Add Successfully", Toast.LENGTH_SHORT).show();
                    email.setText("");
                    fname.setText("");
                    lname.setText("");
                    ph.setText("");
                    address.setText("");
                    adhar.setText(" ");

                }
            });

        }

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Farrmerreg Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.admin.farmers/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Farrmerreg Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.admin.farmers/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
