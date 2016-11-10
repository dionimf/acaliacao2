package com.dionimfxgmail.avaliacao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by dioni on 10/11/2016.
 */
public class LoginActivity extends AppCompatActivity {
    private EditText login_usuario,login_senha;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button bt_login_logar =(Button) findViewById(R.id.bt_login_logar);
        login_usuario =(EditText) findViewById(R.id.ent_login_usuario);
        login_senha=(EditText) findViewById(R.id.ent_login_senha);
        bt_login_logar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(login_usuario.getText().toString().equals("admin")
                        && login_senha.getText().toString().equals("1")){
                    Intent intent =new Intent(LoginActivity.this,MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                    finish();
                }
                else {
                    Toast.makeText(LoginActivity.this, "Login ou Senha Inválidos!!\nTente admin:1",Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}
