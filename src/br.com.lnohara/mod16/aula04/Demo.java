package br.com.lnohara.mod16.aula04;

import java.io.File;

public class Demo {
    public static void main(String[] args) {
        String caminhoFile = "/tmp/teste.txt";
        //Lib externa
        DropBox dropBox = new DropBox();
        Persistencia persistencia = new DropBoxAdapter(dropBox);
        persistencia.gravar(new File(caminhoFile));

        GoogleDrive googleDrive = new GoogleDrive();
        Persistencia persistencia1 = new GoogleDriveAdapter(googleDrive);
        persistencia1.gravar(new File(caminhoFile));

    }
}
