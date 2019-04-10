package ficherosDirectorios;

import java.io.File;

public class Eliminar {

    public static void main(String[] args) {

        File ruta=new File("C:"+File.separator+"Users"+File.separator+"desco"+File.separator+"Desktop"+
                File.separator+"pruebaRutas"+File.separator+"nuevoDirectorio"+File.separator+"nuevoArchivo.txt");

        ruta.delete();

    }
}
