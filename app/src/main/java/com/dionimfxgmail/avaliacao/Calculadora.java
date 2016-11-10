package com.dionimfxgmail.avaliacao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by dioni on 21/09/2016.
 */

public class Calculadora extends AppCompatActivity implements View.OnClickListener {


    private Button bt_calc_num0, bt_calc_num1,bt_calc_num2,bt_calc_num3,
            bt_calc_num4,bt_calc_num5,
            bt_calc_num6,bt_calc_num7,bt_calc_num8,bt_calc_num9,
            bt_calc_operador_divisao,
            bt_calc_operador_subtracao,bt_calc_operador_soma,
            bt_calc_operador_multiplicacao,
            bt_calc_operador_igual,bt_calc_cls;
    private EditText ent_resultado;
    private double valor;
    private int tipo;
    private boolean iniciar,limpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadora);
        setTitle("Calculadora");

        iniciar=false;
        limpar=false;
        bt_calc_num0=(Button) findViewById(R.id.bt_calc_num0);
        bt_calc_num1=(Button) findViewById(R.id.bt_calc_num1);
        bt_calc_num2 =(Button) findViewById(R.id.bt_calc_num2);
        bt_calc_num3=(Button) findViewById(R.id.bt_calc_num3);
        bt_calc_num4 =(Button) findViewById(R.id.bt_calc_num4);
        bt_calc_num5=(Button) findViewById(R.id.bt_calc_num5);
        bt_calc_num6=(Button) findViewById(R.id.bt_calc_num6);
        bt_calc_num7=(Button) findViewById(R.id.bt_calc_num7);
        bt_calc_num8=(Button) findViewById(R.id.bt_calc_num8);
        bt_calc_num9=(Button) findViewById(R.id.bt_calc_num9);
        bt_calc_operador_divisao=(Button) findViewById(R.id.bt_calc_operacao_divisao);
        bt_calc_operador_subtracao=(Button) findViewById(R.id.bt_calc_operador_subtracao);
        bt_calc_operador_soma=(Button) findViewById(R.id.bt_calc_operador_soma);
        bt_calc_operador_multiplicacao=(Button) findViewById(R.id.bt_calc_operador_multiplicacao);
        bt_calc_operador_igual=(Button) findViewById(R.id.bt_calc_operador_igual);
        ent_resultado=(EditText) findViewById(R.id.ent_resultado);
        bt_calc_cls=(Button) findViewById(R.id.bt_calc_cls);
        bt_calc_num0.setOnClickListener(this);
        bt_calc_num1.setOnClickListener(this);
        bt_calc_num2.setOnClickListener(this);
        bt_calc_num3.setOnClickListener(this);
        bt_calc_num4.setOnClickListener(this);
        bt_calc_num5.setOnClickListener(this);
        bt_calc_num6.setOnClickListener(this);
        bt_calc_num7.setOnClickListener(this);
        bt_calc_num8.setOnClickListener(this);
        bt_calc_num9.setOnClickListener(this);
        bt_calc_operador_divisao.setOnClickListener(this);
        bt_calc_operador_subtracao.setOnClickListener(this);
        bt_calc_operador_soma.setOnClickListener(this);
        bt_calc_operador_multiplicacao.setOnClickListener(this);
        bt_calc_operador_igual.setOnClickListener(this);
        bt_calc_cls.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bt_calc_num0:
            case R.id.bt_calc_num1:
            case R.id.bt_calc_num2:
            case R.id.bt_calc_num3:
            case R.id.bt_calc_num4:
            case R.id.bt_calc_num5:
            case R.id.bt_calc_num6:
            case R.id.bt_calc_num7:
            case R.id.bt_calc_num8:
            case R.id.bt_calc_num9:
                limpar=false;
                if (ent_resultado.getText().toString().equals("0")){
                    ent_resultado.setText("");
                }
                ent_resultado.append(((Button) view).getText());
                break;

            case R.id.bt_calc_operador_soma:
                tipo=1;
                if (!iniciar){
                    iniciarTextoNaTela();
                }
                else {
                    if(ent_resultado.getText().toString().equals("")){
                        return;
                    }
                    valor+=Double.parseDouble(ent_resultado.getText().toString());
                    ent_resultado.setText(String.valueOf(valor));


                }
                break;

            case R.id.bt_calc_operador_subtracao:
                tipo=2;
                if (!iniciar){
                    iniciarTextoNaTela();
                }
                else {
                    if(ent_resultado.getText().toString().equals("")){
                        return;
                    }
                    valor-=Double.parseDouble(ent_resultado.getText().toString());
                    ent_resultado.setText(String.valueOf(valor));


                }
                break;

            case R.id.bt_calc_operador_multiplicacao:
                tipo=3;
                if (!iniciar){
                    iniciarTextoNaTela();
                }
                else {
                    if(ent_resultado.getText().toString().equals("")){
                        return;
                    }
                    valor*=Double.parseDouble(ent_resultado.getText().toString());
                    ent_resultado.setText(String.valueOf(valor));


                }
                break;


            case R.id.bt_calc_operacao_divisao:
                tipo=4;
                if (!iniciar){
                    iniciarTextoNaTela();
                }
                else {
                    if(ent_resultado.getText().toString().equals("")){
                        return;
                    }
                    valor/=Double.parseDouble(ent_resultado.getText().toString());
                    ent_resultado.setText(String.valueOf(valor));


                }
                break;
            case R.id.bt_calc_operador_igual:
                if (!iniciar){
                    return;
                }
                else {
                    switch (tipo){
                        case 1:
                            valor+=Double.parseDouble(ent_resultado.getText().toString());
                            break;
                        case 2:
                            valor-=Double.parseDouble(ent_resultado.getText().toString());
                            break;
                        case 3:
                            valor*=Double.parseDouble(ent_resultado.getText().toString());
                            break;
                        case 4:
                            valor/=Double.parseDouble(ent_resultado.getText().toString());
                            break;
                        default:
                            return;

                    }
                    if(ent_resultado.getText().toString().equals("")){
                        return;
                    }
                    ent_resultado.setText(String.valueOf(valor));

                }
                break;



            case R.id.bt_calc_cls:
                if (!limpar){
                    ent_resultado.setText("");
                    limpar=true;

                }
                else {
                    valor=0;
                    iniciar=false;
                }
                break;
        }

    }
    private void iniciarTextoNaTela(){

        valor=Double.parseDouble(ent_resultado.getText().toString());
        ent_resultado.setText("");
        iniciar=true;
    }
}
