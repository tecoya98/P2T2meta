package mx.edu.tesoem.isc.meta.p2t2meta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity  {
    TextView leerColor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        leerColor = (TextView) findViewById(R.id.Color);

    }
    public void addColor(View v) {
        if (leerColor.getText().toString().length() < 1) {
            Toast.makeText(this, "Uste No Escrito Nada.", Toast.LENGTH_SHORT).show();
        } else {
            GlobalClass.addColor(leerColor.getText().toString().toUpperCase());
            Toast.makeText(this, "Usted Agregado el Color: " + leerColor.getText().toString().toUpperCase() , Toast.LENGTH_SHORT).show();
            leerColor.setText("");
        }
    }
    public void regpantalla2(View v) {
        Intent rpan = new Intent(this, MainActivity.class);
        startActivity(rpan);
        finish();
    }
    public void pantalla3(View v) {
        Intent pan = new Intent(this, Main3Activity.class);
        startActivity(pan);
        finish();
    }
}
