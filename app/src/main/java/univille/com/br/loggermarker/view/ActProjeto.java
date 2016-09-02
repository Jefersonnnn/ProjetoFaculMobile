package univille.com.br.loggermarker.view;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.List;

import univille.com.br.loggermarker.R;

/**
 * Created by Jeferson Machado on 05/08/2016.
 */

public class ActProjeto extends AppCompatActivity {

    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.act_projeto);

        bt = (Button) findViewById(R.id.btnProjetoOk);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActProjeto.this, ActSubProjeto.class));
            }
        });

    }
}