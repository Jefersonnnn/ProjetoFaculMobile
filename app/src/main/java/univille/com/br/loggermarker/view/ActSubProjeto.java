package univille.com.br.loggermarker.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import univille.com.br.loggermarker.R;

public class ActSubProjeto extends AppCompatActivity {

    private Button ver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_sub_projeto);

        ver = (Button) findViewById(R.id.btnTeste);

        Toast.makeText(ActSubProjeto.this, "SHOW", Toast.LENGTH_LONG).show();

        ver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActSubProjeto.this, ActInstalacoes.class));
            }
        });


    }
}
