package univille.com.br.loggermarker.univille.com.br.loggermarker.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import univille.com.br.loggermarker.R;

/**
 * Created by CASA on 05/08/2016.
 */
public class ActProjeto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_projeto);

        String[] projetos = new String[]{"Costa e Silva", "Aventureiro"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, projetos);


        ListView lv = (ListView) findViewById(R.id.lv);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(chamaAtividade(this));
    }

    public AdapterView.OnItemClickListener chamaAtividade(final Context context){
        return(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> av, View view, int position, long id) {

                Intent intent;

                intent = new Intent(context, ActSubProjeto.class );
                startActivity(intent);

            }
        });

    }


    public void sair(View view){
        finish();

    }
}
