package vn.edu.ntu.camly.chaucamly_59131356_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

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
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addViews();
        addEvents();
    }



    private void addViews()
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
        cbNn = findViewById(R.id.cbNn);
        cbNa = findViewById(R.id.cbNa);
        btn = findViewById(R.id.btXn);
    }
    private void addEvents()
    {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ThucThi();
            }
        });
    }
    private void ThucThi()
    {
        String Result="";
        Result = edtTen.getText()+"\n"+
                "Ngày Sinh: "+ edtNS.getText()+"\n";
        switch (checkRdo.getCheckedRadioButtonId())
        {
            case R.id.rdNam: Result+="Giới tính: "+"Nam"+" \n" +  "Sở thích: ";break;
            case R.id.rdNu:  Result+="Giới tính: "+"Nữ"+" \n" + "Sở thích: ";break;
        }
        Result+=CheckBoxAction();
        Toast.makeText(MainActivity.this,Result,Toast.LENGTH_SHORT).show();
    }
    private String CheckBoxAction()
    {
        String Result="";
        CheckBox [] arrCb=new CheckBox[]{cbXp,cbNn,cbCf,cbOn,cbNa};
        for (int i=0;i<arrCb.length;i++)
        {
            if(arrCb[i].isChecked())
            {
                Result+=arrCb[i].getText().toString()+"; ";
            }
        }
        Result+=edtStk.getText();
        return Result;
    }
}
