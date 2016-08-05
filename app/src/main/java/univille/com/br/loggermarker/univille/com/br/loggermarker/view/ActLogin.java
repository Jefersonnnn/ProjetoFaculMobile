package univille.com.br.loggermarker.univille.com.br.loggermarker.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import univille.com.br.loggermarker.R;

/**
 * Created by CASA on 05/08/2016.
 */
public class ActLogin extends AppCompatActivity {

    private EditText edtUsuario, edtSenha;
    private Button btnButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.act_login);

        edtUsuario = (EditText) findViewById(R.id.edtUsuario);
        edtSenha = (EditText) findViewById(R.id.edtSenha);
        btnButton = (Button) findViewById(R.id.btnLogin);

        btnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(ActLogin.this, ActProjeto.class));
                finish();

            }
        });



    }


}
