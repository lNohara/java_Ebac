package br.com.lnohara.mod16.aula04;

import java.io.File;

public class GoogleDriveAdapter implements Persistencia{

    private GoogleDrive googleDrive;

    public GoogleDriveAdapter(GoogleDrive googleDrive) {
    }

    public void GoogleDrive(GoogleDrive googleDrive){
        this.googleDrive = googleDrive;
    }

    @Override
    public void gravar(File file) {
        googleDrive.send(file.getAbsolutePath());
    }

    @Override
    public File ler(String id) {
        byte[] file = googleDrive.get(id);
        return new File(String.valueOf(file));
    }
}