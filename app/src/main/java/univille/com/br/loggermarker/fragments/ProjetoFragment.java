package univille.com.br.loggermarker.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.Date;
import java.util.List;

import univille.com.br.loggermarker.R;
import univille.com.br.loggermarker.adapter.ProjetoAdapter;
import univille.com.br.loggermarker.interfaces.RecyclerItemClickListener;
import univille.com.br.loggermarker.model.Projeto;
import univille.com.br.loggermarker.util.ListasTeste;
import univille.com.br.loggermarker.view.ActSubProjeto;

/**
 * Created by Jeferson Machado on 01/09/2016.
 */
public class ProjetoFragment extends Fragment{

    private RecyclerView mRecyclerView;
    private static List<Projeto> mList;
    private static ProjetoAdapter mAdapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_padrao, container, false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.rv_list);
        mRecyclerView.setHasFixedSize(true);

        //Chama a função Scroll adicionando mais elementos na lista
//        mRecyclerView.setOnScrollListener(new RecyclerView.OnScrollListener() {
//            @Override
//            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
//                super.onScrollStateChanged(recyclerView, newState);
//            }
//
//            @Override
//            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
//                super.onScrolled(recyclerView, dx, dy);
//
//                LinearLayoutManager llm = (LinearLayoutManager) mRecyclerView.getLayoutManager();
//                InstalacaoAdapter adapter = (InstalacaoAdapter) mRecyclerView.getAdapter();
//
//                if(mList.size() == llm.findLastCompletelyVisibleItemPosition() + 1){
//                    List<Instalacao> listAux =  ListasTeste.getInstalacoes(10);
//
//                    for (int i = 0; i< listAux.size(); i++){
//                        adapter.addListItem( listAux.get(i), mList.size());
//                    }
//                }
//            }
//        });



        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(llm);

        mList = ListasTeste.getProjetos(3);
        mAdapter = new ProjetoAdapter(getActivity(), mList);
        mRecyclerView.setAdapter( mAdapter );

        //CAPTURA DE CLIQUES NA LISTA
        mRecyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getActivity(), mRecyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        onItemClicado(position);
                    }

                    @Override
                    public void onLongPressClick(View view, int position) {
                        onItemLongClicado(position);
                    }
                })
        );


        return view;
        //return super.onCreateView(inflater, container, savedInstanceState);
    }

    public static void adicionarNovoProjeto(String nome){
        Projeto p = new Projeto();
        p.setNomeProjeto(nome);
        p.setCdProjeto( (int) (1 + Math.random() * 101));
        Date data = new Date(System.currentTimeMillis());

        p.setDataInicial(data);
        mAdapter.addListItem(p, mList.size());
    }


    //Funcao de clique
    private void onItemClicado(int position){
        Toast.makeText(getActivity(), "onItemClicado " + mAdapter.getItem(position).getNomeProjeto(), Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(getActivity(), ActSubProjeto.class);
        intent.putExtra("NOME_PROJETO", mAdapter.getItem(position).getNomeProjeto());
        startActivity(intent);
    }


    //Funcao de clique
    private void  onItemLongClicado(int position){
        Toast.makeText(getActivity(), "onItemLongClicado " + mAdapter.getItem(position).getNomeProjeto(), Toast.LENGTH_SHORT).show();
    }
}
