import java.io.*;


public class AccesoFichero {

    public static void main(String[] args) {

        leerFichero accediendo=new leerFichero();
        accediendo.lee();

        escribiendoFichero accediendo2=new escribiendoFichero();
        accediendo2.escribir();



    }
}

class leerFichero{

    public void lee(){
        try {
            FileReader entrada=new FileReader("C:/Users/desco/Desktop/fichero1.txt");

            int c=0; //asi lee y almacena el primer caracter 'e' en este caso

            while (c!=-1){

                c=entrada.read();

                char letra=(char)c;

                System.out.print(letra);
            }

            entrada.close();

        } catch (IOException e) {
            System.out.println("No se ha encontrado el archivo");
        }
    }
}

class escribiendoFichero{

    public void escribir(){

        String frase="Esto es una prueba de escritura";

        try {
            FileWriter escritura=new FileWriter("C:/Users/desco/Desktop/fichero2.txt");// si pongo true al final añade la frase sin sobreescribir el anterior

            for (int i = 0; i <frase.length() ; i++) {

                escritura.write(frase.charAt(i));

            }

            escritura.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
