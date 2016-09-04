package univille.com.br.loggermarker.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.List;

import univille.com.br.loggermarker.R;
import univille.com.br.loggermarker.model.Projeto;
import univille.com.br.loggermarker.model.SubProjeto;

/**
 * Created by Jeferson Machado on 26/08/2016.
 */
public class SubProjetoAdapter extends RecyclerView.Adapter<SubProjetoAdapter.MyViewHolder> {

    private List<SubProjeto> mList;
    private LayoutInflater mLayoutInflater;

    public SubProjetoAdapter(Context c, List<SubProjeto> l){
        mList = l;
        mLayoutInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    //
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = mLayoutInflater.inflate(R.layout.item_projeto, parent, false);
        MyViewHolder mvh = new MyViewHolder(v);

        return mvh;
    }

    //
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        SimpleDateFormat fomatarData = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = null;
        dataFormatada = fomatarData.format(mList.get(position).getDataInicial());

        holder.tvNomeSubProjeto.setText(mList.get(position).getSubProjetoNome());
        holder.tvQtdInstalacoes.setText(String.valueOf(mList.get(position).getCdProjeto()));
        holder.tvDataSubProjeto.setText(dataFormatada);
    }

    //Retorna o total de itens na lista
    @Override
    public int getItemCount() {
        return mList.size();
    }

    //Recupera um SubProjeto pela posição informada
    public SubProjeto getItem(int position){
        return mList.get(position);
    }

    public void addListItem(SubProjeto sp, int position){
        mList.add(sp);
        notifyItemInserted(position);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView tvNomeSubProjeto;
        public TextView tvQtdInstalacoes;
        public TextView tvDataSubProjeto;

        public MyViewHolder(View itemView) {
            super(itemView);

            tvNomeSubProjeto    = (TextView) itemView.findViewById(R.id.tv_nomeProjeto);
            tvQtdInstalacoes    = (TextView) itemView.findViewById(R.id.tv_qtdSubProjetos);
            tvDataSubProjeto    = (TextView) itemView.findViewById(R.id.tv_ProjetoDataInicio);

        }
    }
}