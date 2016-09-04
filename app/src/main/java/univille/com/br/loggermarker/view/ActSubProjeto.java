package univille.com.br.loggermarker.view;

import android.app.Dialog;
import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionButton;

import univille.com.br.loggermarker.R;
import univille.com.br.loggermarker.fragments.ProjetoFragment;
import univille.com.br.loggermarker.fragments.SubProjetoFragment;

public class ActSubProjeto extends AppCompatActivity implements View.OnClickListener {

    private Button btnSalvarNovoProjeto, btnCancelarNovoProjeto;
    private Toolbar toolbar;
    private FloatingActionButton fab;
    private Dialog dialogNovoSubProjeto;
    private EditText edtNovoSubProjeto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_sub_projeto);

        //RECUPERAR INFORMACOES DA OUTRA ACTIVITY
        //FROM ActProjeto.class
        String nomeProjeto;
        if(getIntent().getExtras() != null){
            nomeProjeto = getIntent().getStringExtra("NOME_PROJETO");
        }else{
            nomeProjeto = "Default";
        }


        //INICIALIZAR TOOLBAR
        toolbar = (Toolbar) findViewById(R.id.tb_main_interno);
        toolbar.setTitle(nomeProjeto);

        //FRAGMENT
        SubProjetoFragment frag = (SubProjetoFragment) getSupportFragmentManager().findFragmentByTag("mainFrag");
        if(frag == null){
            frag = new SubProjetoFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.rl_fragment_container, frag, "mainFrag");
            ft.commit();
        }

        //JANELA NOVO SUB PROJETO
        dialogNovoSubProjeto = new Dialog(this);
        dialogNovoSubProjeto.setContentView(R.layout.act_sub_projeto_novo);
        dialogNovoSubProjeto.setCancelable(false);

        edtNovoSubProjeto      = (EditText) dialogNovoSubProjeto.findViewById(R.id.edtNovoSubProjeto);
        btnSalvarNovoProjeto   = (Button) dialogNovoSubProjeto.findViewById(R.id.btnSalvar);
        btnCancelarNovoProjeto = (Button) dialogNovoSubProjeto.findViewById(R.id.btnCancelar);


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
    private void callNovoSubProjetoDialog()
    {
        dialogNovoSubProjeto.show();
    }

    //IMPLEMENTACOES DOS METODOS DE CLICK DOS OBJETOS
    //
    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.fabAdicionar:
                Toast.makeText(this, "Adicionar", Toast.LENGTH_SHORT).show();
                callNovoSubProjetoDialog();
                break;
            case R.id.fabEditar:
                Toast.makeText(this, "Editar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnSalvar:
                Toast.makeText(this, "SALVAR", Toast.LENGTH_SHORT).show();
                dialogNovoSubProjeto.dismiss();
                SubProjetoFragment.adicionarNovoSubProjeto(edtNovoSubProjeto.getText().toString());
                edtNovoSubProjeto.setText("");
                break;
            case R.id.btnCancelar:
                Toast.makeText(this, "CANCELAR", Toast.LENGTH_SHORT).show();
                dialogNovoSubProjeto.dismiss();
                edtNovoSubProjeto.setText("");
        }

    }
}
