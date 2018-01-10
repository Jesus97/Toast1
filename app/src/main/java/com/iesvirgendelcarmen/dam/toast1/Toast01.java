package com.iesvirgendelcarmen.dam.toast1;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Toast01 extends AppCompatActivity {
TextView textView1;
Button boton1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast01);

        textView1 = (TextView) findViewById(R.id.textView1);
        boton1 = (Button) findViewById(R.id.boton1);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context contexto = getApplicationContext();
                CharSequence texto = "EJEMPLO TOAST";
                int duracion = Toast.LENGTH_SHORT;
                int posX = 500;
                int posY = 500;
                Toast texta = Toast.makeText(contexto, texto, duracion);
                texta.setGravity(Gravity.RIGHT | Gravity.TOP, posX, posY);
                texta.show();
            }
        });
    }

}
