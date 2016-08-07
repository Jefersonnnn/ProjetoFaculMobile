package univille.com.br.loggermarker.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import univille.com.br.loggermarker.R;

/**
 * Created by Jeferson Machado on 03/08/2016.
 */

public class ActSplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_splash_screen);

        Animation anim = AnimationUtils.loadAnimation(this, R.anim.move_up);
        ImageView imageView = (ImageView) findViewById(R.id.imgViewLogoScreen);
        imageView.setAnimation(anim);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(ActSplashScreen.this, ActLogin.class));

                finish();
            }
        }, 4000);


    }
}

/**
 * <b>Classe ActSplashScreen</b>
 * Classe para atribuir o xml act_splash_screen.xml
 */

