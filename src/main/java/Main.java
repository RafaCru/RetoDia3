import java.util.Scanner;

public class Main {
    private static int posicion;

    public static void main(String[] args) {
        String primeracadena="";
        String segundacadena="";
        String terceracadena="";
        String cuartacadena="";

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre:");
        String NombreCompleto= sc.nextLine();
        System.out.println();

        primeracadena=extraecadena(NombreCompleto, posicion);
        segundacadena=extraecadena(NombreCompleto, posicion);
        terceracadena=extraecadena(NombreCompleto, posicion);
        cuartacadena=extraecadena(NombreCompleto, posicion);

        if (cuartacadena.isEmpty()) {
            System.out.println("El nombre es:  " + primeracadena);
            System.out.println("El 1ª apellido es:  " + segundacadena);
            System.out.println("El 2ª apellido es:  " + terceracadena);
        }else{
            System.out.println("El nombre es:  " + primeracadena);
            System.out.println("El segundo nombre es:  " + segundacadena);
            System.out.println("El 1ª apellido es:  " + terceracadena);
            System.out.println("El 2ª apellido es:  " + cuartacadena);

        }

        }
        private static String extraecadena(String nombre, int puntero) {

            String cadena = "";
            int i=puntero;
            while  (i < nombre.length()) {

                cadena = cadena + nombre.charAt(i);
                if (nombre.charAt(i) == ' ') {
                    i++;
                    posicion=i;
                    break;
                }
                posicion=i;
                i++;
            }
            posicion=i;
            return (cadena);
        }
   }

