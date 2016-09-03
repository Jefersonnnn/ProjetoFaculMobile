package univille.com.br.loggermarker.view;


import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.common.api.GoogleApiClient;


import univille.com.br.loggermarker.R;

/**
 * Created by Jeferson Machado on 05/08/2016.
 */
public class ActLogin extends AppCompatActivity {

    private EditText edtUsuario, edtSenha;
    private Button btnLogin;


    //JANELA DE CONFIGURACOES
    //res/layout/form_config_login.xml
    private Dialog configuracoesDialog;
    private EditText edtHost, edtPort, edtTable;
    private Button btnSalvar;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_login);

        configuracoesDialog = new Dialog(this);
        configuracoesDialog.setContentView(R.layout.form_config_login);
        configuracoesDialog.setCancelable(false);

        edtHost = (EditText) configuracoesDialog.findViewById(R.id.host);
        edtPort = (EditText) configuracoesDialog.findViewById(R.id.port);
        edtTable = (EditText) configuracoesDialog.findViewById(R.id.table);
        btnSalvar = (Button) configuracoesDialog.findViewById(R.id.btnSalvar);

        edtUsuario = (EditText) findViewById(R.id.edtUsuario);
        edtSenha   = (EditText) findViewById(R.id.edtSenha);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        //// Find the toolbar view inside the activity layout
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Login");
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);

        //Eventos de 'click' do menu do toolbar
        toolbar.setOnMenuItemClickListener(new
            Toolbar.OnMenuItemClickListener(){

                @Override
                public boolean onMenuItemClick(MenuItem item) {

                   switch (item.getItemId()){
                       case R.id.configs:
                           callLoginDialog();
                           return true;
                    }
                return true;
                }
            }
        );


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(edtUsuario.getText().toString().equals("Jeferson") && edtSenha.getText().toString().equals("123")){
                    startActivity(new Intent(ActLogin.this, ActProjeto.class));
                    finish();
                }else {
                    Toast.makeText(ActLogin.this, "Usuario/Senha errado!", Toast.LENGTH_LONG).show();

                }
            }
        });

        //Recupera as preferencias do usuarios, caso exista;
        recuperarPreferenciasLogin();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.act_login, menu);

        return true;
    }

    //Metodo para exibição de configurações do servidor
    //Toolbar configs
    private void callLoginDialog()
    {

        configuracoesDialog.show();

        btnSalvar.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                configuracoesDialog.dismiss();
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        salvarPreferenciasLogin();
    }



    private void salvarPreferenciasLogin(){
        //Salva as preferencias informadas no configuracoesDialog
        SharedPreferences config = getSharedPreferences("CONFIGS",0);
        SharedPreferences.Editor editor = config.edit();
        editor.putString("host",      edtHost.getText().toString());
        editor.putString("port",      edtPort.getText().toString());
        editor.putString("table",     edtTable.getText().toString());
        editor.putString("passLogin", edtSenha.getText().toString());
        editor.putString("userLogin", edtUsuario.getText().toString());
        editor.commit();

    }

    /**
     * <b>Metodo recuperarPreferenciasLogin</b>
     * Utilizado para buscar preferencias do usuarios
     * Servidor e acesso ao app
     */
    private void recuperarPreferenciasLogin(){
        SharedPreferences config = getSharedPreferences("CONFIGS", 0); //Inicializa shared prefs
        edtHost.setText(config.getString("host", "")); //Retorna se disponivel o host salvo
        edtPort.setText(config.getString("port", "")); //Retorna se disponivel a porta salva
        edtTable.setText(config.getString("table", ""));//Retorna se disponivel a tabela salvat
        edtSenha.setText(config.getString("passLogin", ""));
        edtUsuario.setText(config.getString("userLogin", ""));

    }
}
