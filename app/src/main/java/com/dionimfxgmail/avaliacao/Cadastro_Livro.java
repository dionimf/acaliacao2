package com.dionimfxgmail.avaliacao;

import android.icu.math.BigDecimal;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

import com.dionimfxgmail.avaliacao.R;

/**
 * Created by dioni on 21/09/2016.
 */

public class Cadastro_Livro extends AppCompatActivity {
    TextView ent_cadl_nome,ent_cadl_autor,ent_cadl_editora,ent_cadl_valor,ent_cadl_tipo_obra;
    SeekBar ent_quantidade;
    Button bt_cadl_cadastrar;
    RadioGroup ent_radio_grupo;
    String tipomedia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tipomedia="";
        setContentView(R.layout.cadastro_livros);
        ent_cadl_nome=(TextView) findViewById(R.id.ent_cadl_nome);
        ent_cadl_autor=(TextView) findViewById(R.id.ent_cadl_autor);
        ent_cadl_editora=(TextView) findViewById(R.id.ent_cadl_editora);
        ent_cadl_valor=(TextView)findViewById(R.id.ent_cadl_valor);
        ent_quantidade=(SeekBar) findViewById(R.id.ent_quantidade);
        ent_radio_grupo=(RadioGroup)findViewById(R.id.ent_radio_grupo);
        bt_cadl_cadastrar=(Button) findViewById(R.id.bt_cadl_cadastrar);
        ent_cadl_tipo_obra=(CheckBox)findViewById(R.id.ent_cadl_tp_manga);


        ent_radio_grupo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.ent_digital:
                        tipomedia="Digital";
                        break;
                    case R.id.ent_impresso:
                        tipomedia="Impresso";
                        break;
                }
            }
        });
        bt_cadl_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Nome,Autor,Editora,TipoObra,TipoMedia;

            }
        });




    }

}
