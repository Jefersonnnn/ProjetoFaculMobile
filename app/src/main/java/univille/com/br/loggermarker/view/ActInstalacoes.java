package univille.com.br.loggermarker.view;

import android.os.Bundle;

import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import android.widget.Toast;

import univille.com.br.loggermarker.R;
import univille.com.br.loggermarker.fragments.InstalacaoFragment;


/**
 * Created by Jeferson Machado on 26/08/2016.
 */
public class ActInstalacoes extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_instalacoes);


        //FRAGMENT
        InstalacaoFragment frag = (InstalacaoFragment) getSupportFragmentManager().findFragmentByTag("mainFrag");
        if(frag == null){
            frag = new InstalacaoFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.rl_fragment_container, frag, "mainFrag");
            ft.commit();
        }


    }


}
