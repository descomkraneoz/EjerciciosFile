package leyendoEscribiendoBytes;
import java.io.*;

public class LecturaEscritura {

    public static void main(String[] args) {

        int contador=0;

        int datosEntrada[]=new int[1];

        try {

            FileInputStream archivoLectura=new FileInputStream("C:/Users/desco/Desktop/pruebaImagen/astronauta.jpg");

            boolean finalAR=false;

            while (!finalAR){

                int byteEntrada=archivoLectura.read();

                if (byteEntrada!=-1){

                    datosEntrada[contador]=byteEntrada;
                }

                else{

                    finalAR=true;

                    System.out.println(datosEntrada[contador]);

                    contador++;
                }
            }

            archivoLectura.close();

        }catch (IOException e){

            System.out.println("Error de acceso");

        }

        System.out.println(contador);

        creaFichero(datosEntrada);

    }

    static void creaFichero(int datosNuevoFichero[]){

        try {

            FileOutputStream ficheroNuevo=new FileOutputStream("C:/Users/desco/Desktop/pruebaImagen/copia_astronauta.jpg");

            for (int i = 0; i <datosNuevoFichero.length ; i++) {

                ficheroNuevo.write(datosNuevoFichero[i]);

            }

            ficheroNuevo.close();

        }catch (IOException e){

            System.out.println("Error al crear");

        }

    }
}
