package br.com.guilhermeoli.adapter;

import java.io.File;

public interface PersistenciaDeArquivos {

    public void gravar(File file);

    public File ler(String id);
}
