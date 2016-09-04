package univille.com.br.loggermarker.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import univille.com.br.loggermarker.R;
import univille.com.br.loggermarker.model.Instalacao;
import univille.com.br.loggermarker.model.Projeto;
import univille.com.br.loggermarker.model.SubProjeto;

/**
 * Created by CASA on 01/09/2016.
 */
public class ListasTeste {

    public static List<Instalacao> getInstalacoes(int qtd){

        String[] ruas     = new String[]{"Rua Aquarius", "Rua Urano", "Rua Venus", "Rua Jupiter", "Rua Matheus"};
        double[] latitudes = new double[]{21.22231,44.2323,85.1233,92.2323,35.2323};
        double[] longitudes = new double[]{21.232,44.2323,85.1233,92.2323,35.2323};
        int[] imgSituacao = new int[]{R.drawable.loggerinstalado, R.drawable.loggerretirado, R.drawable.loggersuspeito, R.drawable.loggervaz};
        int[] numLoggers   = new int[]{377,378,379, 380,381,382};
        int[] numCasa      = new int[]{1102, 1231, 4353, 3252, 332, 2342};
        List<Instalacao> listInstalacoes = new ArrayList<>();

        Date data = new Date(System.currentTimeMillis());

        for(int i = 0; i < qtd; i++){

            Instalacao inst = new Instalacao(numLoggers[i % numLoggers.length], data, latitudes[i % latitudes.length], longitudes[i % longitudes.length], numCasa[i % numCasa.length], ruas[i % ruas.length], imgSituacao[ i % imgSituacao.length]);
            listInstalacoes.add(inst);
        }

        return listInstalacoes;
    }


     public static List<Projeto> getProjetos(int qtd){

        String[] nomeProjeto     = new String[]{"Costa e Silva", "Aventureiro", "Bucarein", "Pirabeiraba", "Vila Nova"};
        int[] situacaoProjeto = new int[]{0, 1, 2};
        int[] cdProjeto   = new int[]{
                (int) (1 + Math.random() * 101),
                (int) (1 + Math.random() * 101),
                (int) (1 + Math.random() * 101),
                (int) (1 + Math.random() * 101),
                (int) (1 + Math.random() * 101),
                (int) (1 + Math.random() * 101)};

        Date data = new Date(System.currentTimeMillis());

        List<Projeto> listProjetos = new ArrayList<>();

        for(int i = 0; i < qtd; i++){
            Projeto pro = new Projeto(cdProjeto[i % cdProjeto.length], nomeProjeto[i % nomeProjeto.length], data, data, situacaoProjeto[i % situacaoProjeto.length]);

            listProjetos.add(pro);
        }

        return listProjetos;
    }

    public static List<SubProjeto> getSubProjetos(int qtd){

        String[] nomeSubProjeto     = new String[]{"Projeto 01", "Projeto 02", "Projeto 03", "Projeto 04", "Projeto 05"};
        int[] cdSubProjeto   = new int[]{
                (int) (1 + Math.random() * 101),
                (int) (1 + Math.random() * 101),
                (int) (1 + Math.random() * 101),
                (int) (1 + Math.random() * 101),
                (int) (1 + Math.random() * 101),
                (int) (1 + Math.random() * 101)};

        Date data = new Date(System.currentTimeMillis());

        List<SubProjeto> listSubProjetos = new ArrayList<>();

        for(int i = 0; i < qtd; i++){
            SubProjeto subProjeto = new SubProjeto(cdSubProjeto[i % cdSubProjeto.length],cdSubProjeto[i % cdSubProjeto.length] , nomeSubProjeto[i % nomeSubProjeto.length], data, data, 1 );

            listSubProjetos.add(subProjeto);
        }

        return listSubProjetos;
    }
}
