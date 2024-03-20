package br.com.guilhermeoli.adapter;

import java.io.File;

/**
 * @author guiol
 */
public class DropBoxAdapter implements PersistenciaDeArquivos{

    private DropBox dropBox;

    public DropBoxAdapter(DropBox dropBox) {
        this.dropBox = dropBox;
    }
    @Override
    public void gravar(File file) {
        dropBox.download(file.getAbsolutePath());
    }

    @Override
    public File ler(String id) {
        DropBoxFile file = dropBox.download(id);
        return new File(file.getLocalPath());
    }
}
