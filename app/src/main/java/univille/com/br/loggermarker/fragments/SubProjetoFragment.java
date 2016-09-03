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
import univille.com.br.loggermarker.adapter.SubProjetoAdapter;
import univille.com.br.loggermarker.interfaces.RecyclerItemClickListener;
import univille.com.br.loggermarker.model.Projeto;
import univille.com.br.loggermarker.model.SubProjeto;
import univille.com.br.loggermarker.util.ListasTeste;
import univille.com.br.loggermarker.view.ActInstalacoes;
import univille.com.br.loggermarker.view.ActSubProjeto;

/**
 * Created by Jeferson Machado on 01/09/2016.
 */
public class SubProjetoFragment extends Fragment{

    private RecyclerView mRecyclerView;
    private static List<SubProjeto> mList;
    private static SubProjetoAdapter mAdapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //LAYOUT PADRÃO PARA INFLAR UMA LISTA
        View view = inflater.inflate(R.layout.fragment_padrao, container, false);

        //ATRIBUI O ITEM RecyclerView do layout(rv_list)
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

        //Instancia um novo LinearLayoutManager para setar a orientação dos item -> VERTICAL
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(llm);

        //Recupera os Items(SubProjetos)
        mList = ListasTeste.getSubProjetos(3);
        mAdapter = new SubProjetoAdapter(getActivity(), mList);
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

                    }
                })
        );


        return view;
        //return super.onCreateView(inflater, container, savedInstanceState);
    }

    public static void adicionarNovoSubProjeto(String nome){
        SubProjeto sp = new SubProjeto();
        sp.setSubProjetoNome(nome);
        sp.setCdProjeto( (int) (1 + Math.random() * 101));
        Date data = new Date(System.currentTimeMillis());

        sp.setDataInicial(data);
        mAdapter.addListItem(sp, mList.size());
    }


    //Funcao de clique
    private void onItemClicado(int position){
        Toast.makeText(getActivity(), "Item " + mAdapter.getItem(position).getSubProjetoNome(), Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(getActivity(), ActInstalacoes.class);
        intent.putExtra("NOME_PROJETO", getActivity().getIntent().getStringExtra("NOME_PROJETO"));

        intent.putExtra("NOME_SUBPROJETO", mAdapter.getItem(position).getSubProjetoNome());
        startActivity(intent);
    }
}
