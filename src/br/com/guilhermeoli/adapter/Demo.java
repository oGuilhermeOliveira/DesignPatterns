package br.com.guilhermeoli.adapter;

import java.io.File;

/**
 * @author guiol
 */
public class Demo {

    public static void main(String[] args) {
        String file = "Teste.txt";
        DropBox drop = new DropBox();
        PersistenciaDeArquivos arquivos = new DropBoxAdapter(drop);
        arquivos.gravar(new File(file));
    }
}
