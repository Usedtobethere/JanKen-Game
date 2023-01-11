import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declarar un arreglo a utilizar con el math.random();
        String arr[] = {"PAPEL", "PIEDRA", "TIJERA"};

        //Se obtiene el movimiento del jugador, piedra papel o tijera
        System.out.println("Ingresa el movimiento del jugador");
        String usuario= sc.next();
        usuario = usuario.toUpperCase();
        if(usuario.equals("PAPEL") || usuario.equals("PIEDRA") || usuario.equals("TIJERA")){
            //Obtenemos el numero aleatorio y lo asignamos a un lugar del arreglo
            int P = (int) (Math.floor(Math.random() * 3));
            String computadora = arr[P];

            //Creamos todas las posibilidades en las que se gana/pierde o se empata
            if(computadora.equals(usuario)){
                System.out.println("Es un empate!");
            }else{
                if(computadora.equals("PAPEL")){
                    if (usuario.equals("PIEDRA")){
                        System.out.println("Perdiste!");
                    }
                    else{
                        System.out.println("Ganaste!");
                    }
                }
                if(computadora.equals("PIEDRA")){
                    if (usuario.equals("TIJERA")){
                        System.out.println("Perdiste!");
                    }
                    else{
                        System.out.println("Ganaste!");
                    }
                }
                if(computadora.equals("TIJERA")){
                    if (usuario.equals("PAPEL")){
                        System.out.println("Perdiste!");
                    }
                    else{
                        System.out.println("Ganaste!");
                    }
                }
            }
            System.out.println(computadora);
        }
        //Una linea por si el usuario escribe una opción invalida
        System.out.println("Escribe una opción valida");
    }
}