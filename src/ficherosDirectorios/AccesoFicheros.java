package ficherosDirectorios;

import java.io.File;

public class AccesoFicheros {
    public static void main(String[] args) {

        File ruta=new File("C:"+File.separator+"Users"+File.separator+"desco"+File.separator+"Desktop"+File.separator+"pruebaRutas");

        System.out.println(ruta.getAbsolutePath());

        String[] nombresArchivo=ruta.list();

        for (String s:nombresArchivo
             ) {
            System.out.println(s);

            File f=new File(ruta.getAbsolutePath(), s);
            if (f.isDirectory()){
                String[] archivosSubcarpeta=f.list();
                for (String g:archivosSubcarpeta
                     ) {
                    System.out.println(g);
                }
            }
        }

    }
}
