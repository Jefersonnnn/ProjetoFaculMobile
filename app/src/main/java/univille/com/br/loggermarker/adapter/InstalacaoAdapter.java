package univille.com.br.loggermarker.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import univille.com.br.loggermarker.R;
import univille.com.br.loggermarker.model.Instalacao;

/**
 * Created by Jeferson Machado on 26/08/2016.
 */
public class InstalacaoAdapter extends RecyclerView.Adapter<InstalacaoAdapter.MyViewHolder> {

    private List<Instalacao> mList;
    private LayoutInflater mLayoutInflater;

    public InstalacaoAdapter(Context c, List<Instalacao> l){
        mList = l;
        mLayoutInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    //
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = mLayoutInflater.inflate(R.layout.item_instalacao, parent, false);
        MyViewHolder mvh = new MyViewHolder(v);

        return mvh;
    }

    //
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.ivInstalacao.setImageResource(mList.get(position).getImgSituacao());
        holder.tvInstalacaoNumLogger.setText( String.valueOf(mList.get(position).getCdLogger()) );
        String rua_num = mList.get(position).getRua() + ", " + mList.get(position).getNumCasa() ;
        holder.tvInstalacaoRua.setText( rua_num );
    }

    //
    @Override
    public int getItemCount() {
        return mList.size();
    }

    public void addListItem(Instalacao i, int position){
        mList.add(i);
        notifyItemInserted(position);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public ImageView ivInstalacao;
        public TextView  tvInstalacaoNumLogger;
        public TextView  tvInstalacaoRua;

        public MyViewHolder(View itemView) {
            super(itemView);

            ivInstalacao    = (ImageView) itemView.findViewById(R.id.iv_instalacao);
            tvInstalacaoNumLogger = (TextView) itemView.findViewById(R.id.tv_instalacaoNumLogger);
            tvInstalacaoRua = (TextView) itemView.findViewById(R.id.tv_instalacaoRua);

        }
    }
}