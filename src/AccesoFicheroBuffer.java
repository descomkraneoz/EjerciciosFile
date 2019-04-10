import java.io.*;


public class AccesoFicheroBuffer {

    public static void main(String[] args) {

        leerFicheroBuffer accediendo=new leerFicheroBuffer();
        accediendo.lee();

        //escribiendoFichero accediendo2=new escribiendoFichero();
        //accediendo2.escribir();



    }
}

class leerFicheroBuffer{

    public void lee(){
        try {
            FileReader entrada=new FileReader("C:/Users/desco/Desktop/fichero1.txt");

            BufferedReader miBuffer=new BufferedReader(entrada);

            String linea="";


            while (linea!=null){

                linea=miBuffer.readLine();

                if (linea!=null){

                    System.out.println(linea);
                }
            }

            entrada.close();

        } catch (IOException e) {
            System.out.println("No se ha encontrado el archivo");
        }
    }
}

/*class escribiendoFichero{

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
}*/
