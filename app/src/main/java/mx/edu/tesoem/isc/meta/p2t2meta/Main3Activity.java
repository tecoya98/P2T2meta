package mx.edu.tesoem.isc.meta.p2t2meta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Main3Activity  extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner objSpinner;
    ArrayAdapter<String> lista;
    boolean flag = false;

@Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main3);
    objSpinner = findViewById(R.id.ostrarColor);
    lista = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, GlobalClass.showColors());
    objSpinner.setAdapter(lista);
    objSpinner.setOnItemSelectedListener(this);
}


    public void onItemSelected(AdapterView<?> parent, View v, int pos, long id){
        if(!flag){
            flag = true;
            return;
        }
        Toast.makeText(this, "Seleciona el Color:  " + parent.getItemAtPosition(pos).toString(),Toast.LENGTH_SHORT).show();
    }


    public void onNothingSelected(AdapterView<?> arg0){}
    public void regpantalla(View v) {
        Intent pan = new Intent(this, MainActivity.class);
        startActivity(pan);
        finish();
    }
}
