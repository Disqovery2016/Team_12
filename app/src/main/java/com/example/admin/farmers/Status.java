package com.example.admin.farmers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Status extends AppCompatActivity {

    public RadioButton rd1;
    public RadioButton rd2;
    public EditText from;
    public EditText tod;
    public TextView to;
    public TextView fr;
    public TextView skillarea;
    public EditText skill;
    public Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);

        rd1=(RadioButton)findViewById(R.id.unemp);
        rd2=(RadioButton)findViewById(R.id.emp);
        from=(EditText)findViewById(R.id.fromdate);
        fr=(TextView)findViewById(R.id.from);
        tod=(EditText)findViewById(R.id.todate);
        to=(TextView)findViewById(R.id.to);
        skill=(EditText)findViewById(R.id.skillarea);
        skillarea=(TextView)findViewById(R.id.skill);
        btn=(Button)findViewById(R.id.submit);



    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.unemp:
                if (checked)
                    from.setVisibility(View.VISIBLE);
                    fr.setVisibility(View.VISIBLE);
                    tod.setVisibility(View.VISIBLE);
                    to.setVisibility(View.VISIBLE);
                    skillarea.setVisibility(View.VISIBLE);
                    skill.setVisibility(View.VISIBLE);
                    btn.setVisibility(View.VISIBLE);
                    break;
            case R.id.emp:
                if (checked)
                    break;
        }
    }

}
