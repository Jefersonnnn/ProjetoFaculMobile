package univille.com.br.loggermarker.view;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.github.clans.fab.*;


import univille.com.br.loggermarker.R;

import univille.com.br.loggermarker.adapter.InstalacaoAdapter;
import univille.com.br.loggermarker.adapter.ProjetoAdapter;
import univille.com.br.loggermarker.fragments.ProjetoFragment;
import univille.com.br.loggermarker.model.Projeto;

/**
 * Created by Jeferson Machado on 05/08/2016.
 */

public class ActProjeto extends AppCompatActivity implements View.OnClickListener {

    private FloatingActionButton fab;


    private Toolbar toolbar;

    //JANELA NOVO PROJETO
    //res/layout/act_instalacao_novo.xml
    private EditText edtNovoProjeto;
    private Button btnSalvarNovoProjeto, btnCancelarNovoProjeto;
    private Dialog dialogNovoProjeto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.act_projeto);

        //TOOLBAR
        ////////////////////////////
        toolbar = (Toolbar) findViewById(R.id.tb_main_interno);
        toolbar.setTitle("Projetos");

        //FRAGMENT
        ProjetoFragment frag = (ProjetoFragment) getSupportFragmentManager().findFragmentByTag("mainFrag");
        if(frag == null){
            frag = new ProjetoFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.rl_fragment_container, frag, "mainFrag");
            ft.commit();
        }

        //JANELA NOVO PROJETO
        dialogNovoProjeto = new Dialog(this);
        dialogNovoProjeto.setContentView(R.layout.act_projeto_novo);
        dialogNovoProjeto.setCancelable(false);

        edtNovoProjeto = (EditText) dialogNovoProjeto.findViewById(R.id.edtNovoProjeto);
        btnSalvarNovoProjeto = (Button) dialogNovoProjeto.findViewById(R.id.btnSalvar);
        btnCancelarNovoProjeto = (Button) dialogNovoProjeto.findViewById(R.id.btnCancelar);


        //FAB
        fab = (FloatingActionButton) findViewById(R.id.fab);

        FloatingActionButton fabAdicionar = (FloatingActionButton) findViewById(R.id.fabAdicionar);
        FloatingActionButton fabEditar = (FloatingActionButton) findViewById(R.id.fabEditar);

        fabAdicionar.setOnClickListener(this);
        fabEditar.setOnClickListener(this);
        btnSalvarNovoProjeto.setOnClickListener(this);
        btnCancelarNovoProjeto.setOnClickListener(this);
    }

    //Metodo para exibição de novo Projeto
    //FloatingActionMenu
    private void callNovoProjetoDialog()
    {
        dialogNovoProjeto.show();
    }



    //IMPLEMENTACOES DOS METODOS DE CLICK DOS OBJETOS
    //
    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.fabAdicionar:
                Toast.makeText(this, "Adicionar", Toast.LENGTH_SHORT).show();
                callNovoProjetoDialog();
                break;
            case R.id.fabEditar:
                Toast.makeText(this, "Editar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnSalvar:
                Toast.makeText(this, "SALVAR", Toast.LENGTH_SHORT).show();
                dialogNovoProjeto.dismiss();
                ProjetoFragment.adicionarNovoProjeto(edtNovoProjeto.getText().toString());
                edtNovoProjeto.setText("");
                break;
            case R.id.btnCancelar:
                Toast.makeText(this, "CANCELAR", Toast.LENGTH_SHORT).show();
                dialogNovoProjeto.dismiss();
                edtNovoProjeto.setText("");
        }

    }
}