package com.dionimfxgmail.avaliacao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by dioni on 10/11/2016.
 */

public class Consulta_Livro extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button bt_consultar;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.consulta_livro);
        setTitle("Consulta Livro");
        bt_consultar=(Button) findViewById(R.id.bt_cado_consultar);
        bt_consultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

}


    @Override
    public void onClick(View view) {

    }
}