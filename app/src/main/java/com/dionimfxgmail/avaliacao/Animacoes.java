package com.dionimfxgmail.avaliacao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;


/**
 * Created by dioni on 10/11/2016.
 */

public class Animacoes  extends AppCompatActivity {
    public static final int DEFAULT_ANIMATION_DURATION = 2000;
    private ImageView mImageViewAviao;
    private ImageView mImageViewHelice;
    private LinearLayout mContentMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.animacoes);
        setTitle("Animações");

}
}