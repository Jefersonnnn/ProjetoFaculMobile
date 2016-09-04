package univille.com.br.loggermarker.view;

import android.os.Bundle;

import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import univille.com.br.loggermarker.R;
import univille.com.br.loggermarker.fragments.InstalacaoFragment;


/**
 * Created by Jeferson Machado on 26/08/2016.
 */
public class ActInstalacoes extends AppCompatActivity {

    private Toolbar toolbar;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_instalacoes);

        //RECUPERAR INFORMACOES DA OUTRA ACTIVITY
        //FROM ActProjeto.class
        String nomeProjeto;
        String nomeSubProjeto;
        if(getIntent().getExtras() != null){
            nomeProjeto = getIntent().getStringExtra("NOME_PROJETO");
            nomeSubProjeto = getIntent().getStringExtra("NOME_SUBPROJETO");
        }else{
            nomeProjeto = "";
            nomeSubProjeto = "";
        }

        //TOOLBAR
        toolbar = (Toolbar) findViewById(R.id.tb_main_interno);
        getIntent().getExtras();
        toolbar.setTitle(nomeProjeto + "/" + nomeSubProjeto);


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
