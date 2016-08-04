package univille.com.br.loggermarker.univille.com.br.loggermarker.view;

import android.app.Activity;
import android.os.Bundle;

import univille.com.br.loggermarker.R;

/**
 * Created by Jeferson Machado on 03/08/2016.
 */


/**
 * <b>Classe ActSplashScreen</b>
 * Classe para atribuir o xml act_splash_screen.xml
 */
public class ActSplashScreen extends Activity {

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
             startActivity(new Intent(ActSplashScreen.this, ActMain.class));
                finish();
            }
        }, 4000);


    }
}
