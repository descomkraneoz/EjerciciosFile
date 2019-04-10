package ficherosDirectorios;

import java.io.File;

public class PruebasRutas {
    public static void main(String[] args) {

        File archivo=new File("C:/Users/desco/Desktop/pruebaRutas/ejemploArchivo.txt");

        System.out.println(archivo.getAbsolutePath());

        System.out.println(archivo.exists());
    }
}
