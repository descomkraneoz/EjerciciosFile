package ficherosDirectorios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Creando {

    public static void main(String[] args) {

        //File ruta=new File("C:"+File.separator+"Users"+File.separator+"desco"+File.separator+"Desktop"+File.separator+"pruebaRutas"+File.separator+"nuevoDirectorio");

        //ruta.mkdir(); //crea un directorio

        File ruta=new File("C:"+File.separator+"Users"+File.separator+"desco"+File.separator+"Desktop"+
                File.separator+"pruebaRutas"+File.separator+"nuevoDirectorio"+File.separator+"nuevoArchivo.txt");

        //construye un nuevo archivo
        try {
            ruta.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String archivoDestino=ruta.getAbsolutePath();

        Escribiendo accede=new Escribiendo();

        accede.escribir(archivoDestino);


    }
}

class Escribiendo{

    public void escribir(String rutaArchivo){

        String frase="Esto es un ejemplo. Espero que salga";

        try{

            FileWriter escritura=new FileWriter(rutaArchivo);

            for (int i = 0; i <frase.length() ; i++) {

                escritura.write(frase.charAt(i));

            }

            escritura.close();

        }catch (IOException e){

        }

    }
}
