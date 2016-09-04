package univille.com.br.loggermarker.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.List;

import univille.com.br.loggermarker.R;
import univille.com.br.loggermarker.model.Instalacao;
import univille.com.br.loggermarker.model.Projeto;

/**
 * Created by Jeferson Machado on 26/08/2016.
 */
public class ProjetoAdapter extends RecyclerView.Adapter<ProjetoAdapter.MyViewHolder> {

    private List<Projeto> mList;
    private LayoutInflater mLayoutInflater;

    public ProjetoAdapter(Context c, List<Projeto> l){
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

        holder.tvNomeProjeto.setText(mList.get(position).getNomeProjeto());
        holder.tvQtdSupProjetos.setText(String.valueOf(mList.get(position).getCdProjeto()));
        holder.tvDataProjeto.setText(dataFormatada);
    }

    //
    @Override
    public int getItemCount() {
        return mList.size();
    }

    public Projeto getItem(int position){
        return mList.get(position);
    }




    public void addListItem(Projeto p, int position){
        mList.add(p);
        notifyItemInserted(position);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView tvNomeProjeto;
        public TextView tvQtdSupProjetos;
        public TextView tvDataProjeto;

        public MyViewHolder(View itemView) {
            super(itemView);

            tvNomeProjeto    = (TextView) itemView.findViewById(R.id.tv_nomeProjeto);
            tvQtdSupProjetos = (TextView) itemView.findViewById(R.id.tv_qtdSubProjetos);
            tvDataProjeto    = (TextView) itemView.findViewById(R.id.tv_ProjetoDataInicio);

        }
    }
}