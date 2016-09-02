package univille.com.br.loggermarker.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import univille.com.br.loggermarker.R;
import univille.com.br.loggermarker.model.Instalacao;

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
}
