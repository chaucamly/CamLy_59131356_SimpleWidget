package vn.edu.ntu.camly.chaucamly_59131356_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;
import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity
{
    EditText edtTen, edtNS, edtStk;
    RadioGroup checkRdo;
    CheckBox cbXp, cbNn, cbCf, cbOn, cbNa;
    Button btXn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adViews();
        addEvents();
    }

    private void adViews()
    {
        edtTen = findViewById(R.id.edtTen);
        edtNS = findViewById(R.id.edtNS);
        edtStk = findViewById(R.id.edtStk);
        checkRdo = findViewById(R.id.checkradio);
        cbXp = findViewById(R.id.cbXp);
        cbNn = findViewById(R.id.cbNn);
        cbCf = findViewById(R.id.cbCf);
        cbOn = findViewById(R.id.cbOn);
        cbNa = findViewById(R.id.cbNa);
        btXn = findViewById(R.id.btXn);

        cbXp.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(cbXp.isChecked()){
                    cbXp.setTextColor(getResources().getColor(R.color.black));
                }else {
                    cbXp.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });
        cbNn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(cbNn.isChecked()){
                    cbNn.setTextColor(getResources().getColor(R.color.black));
                }else {
                    cbNn.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });
        cbCf.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(cbCf.isChecked()){
                    cbCf.setTextColor(getResources().getColor(R.color.black));
                }else {
                    cbCf.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });
        cbOn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(cbOn.isChecked()){
                    cbOn.setTextColor(getResources().getColor(R.color.black));
                }else {
                    cbOn.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });
        cbNa.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(cbNa.isChecked()){
                    cbNa.setTextColor(getResources().getColor(R.color.black));
                }else {
                    cbNa.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });

    }

    private void addEvents()
    {
        btXn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ThucThi();
            }
        });
    }

    private void ThucThi()
    {
        String Result = "";
        Result = edtTen.getText() + "\n" +  "Ngày Sinh: " + edtNS.getText() + "\n";
        switch (checkRdo.getCheckedRadioButtonId()) {
            case R.id.rdNam:
                Result += "Giới Tính: " + "Nam" + "\n" + "Sở Thích: ";
                break;
            case R.id.rdNu:
                Result += "Giới Tính: " + "Nữ" + "\n" + "Sở Thích: ";
                break;
        }

        Result += CheckBoxAction();
        Toast.makeText(MainActivity.this, Result, Toast.LENGTH_SHORT).show();
    }
        private String CheckBoxAction ()
        {
        String Result = "";
        CheckBox[] arrCb = new CheckBox[]{cbXp, cbNn, cbCf, cbOn, cbNa};
        for (int i = 0; i < arrCb.length; i++) {
            if (arrCb[i].isChecked()) {
                Result += arrCb[i].getText().toString() + "; ";
            }
        }
        Result += edtStk.getText();
            return Result;
        }
}






