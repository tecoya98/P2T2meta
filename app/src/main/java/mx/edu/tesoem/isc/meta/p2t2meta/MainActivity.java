package mx.edu.tesoem.isc.meta.p2t2meta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button sig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sig = (Button) findViewById(R.id.bta);
    }

    public void pantalla2(View v) {
        Intent pan2 = new Intent(this, Main2Activity.class);
        startActivity(pan2);
        finish();
    }

    public void pantalla3(View v) {
        Intent pan3 = new Intent(this, Main3Activity.class);
        startActivity(pan3);
        finish();
    }
}