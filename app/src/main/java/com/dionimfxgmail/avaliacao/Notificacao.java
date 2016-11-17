package com.dionimfxgmail.avaliacao;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by zero on 17/11/16.
 */

public class Notificacao extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notificacao);
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("NotificationReceiver!");
    }
}
