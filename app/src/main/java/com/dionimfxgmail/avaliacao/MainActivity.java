package com.dionimfxgmail.avaliacao;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button menu_calculadora, menu_cadastro_livro;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        menu_calculadora = (Button) findViewById(R.id.bt_menu_calculadora);
        menu_cadastro_livro = (Button) findViewById(R.id.bt_menu_cadastro_livro);
        menu_calculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Calculadora.class));
            }
        });
        menu_cadastro_livro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Cadastro_Livro.class));
            }
        });
    }
}
