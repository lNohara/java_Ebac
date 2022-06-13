package br.com.lnohara.mod16.aula04;

import java.io.File;

public class DropBoxAdapter implements Persistencia{

    private DropBox dropBox;

    public DropBoxAdapter(DropBox dropBox){
        this.dropBox = dropBox;
    }

    @Override
    public void gravar(File file) {
        dropBox.upload(new DropBoxFile(file.getAbsolutePath()));
    }

    @Override
    public File ler(String id) {
        DropBoxFile dbFile = dropBox.dowload(id);
        return new File(dbFile.getLocalPath());
    }
}
