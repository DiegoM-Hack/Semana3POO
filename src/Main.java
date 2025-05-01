import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Diego Montaluisa
        //Parte1
        /*System.out.println("Ingrese nombre del cocinero: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese los años experiencia: ");
        int experiencia = sc.nextInt();
        System.out.println("Ingrese especialidad: ");
        String especialidad = sc.nextLine();
        sc.nextLine();

        //Cocinero cocinero1 = new Cocinero(nombre, experiencia, especialidad);


        System.out.println("Ingrese nombre del cocinero: ");
        String nombre1 = sc.nextLine();
        System.out.println("Ingrese los años de experiencia: ");
        int experiencia1 = sc.nextInt();
        System.out.println("Ingrese especialidad: ");
        String especialidad1 = sc.nextLine();
        Cocinero cocinero2 = new Cocinero(nombre1, experiencia1, especialidad1);
        sc.nextLine();

        System.out.println("Ingrese nombre del cocinero: ");
        String nombre2 = sc.nextLine();
        System.out.println("Ingrese los años de experiencia: ");
        int experiencia2 = sc.nextInt();
        System.out.println("Ingrese especialidad: ");
        String especialidad2 = sc.nextLine();
        sc.nextLine();
        Cocinero cocinero3 = new Cocinero(nombre2, experiencia2, especialidad2);
*/

        System.out.println("Ingrese cantidad de cocineros: ");
        int a =sc.nextInt();
        sc.nextLine();
        Cocinero[] cocineros = new Cocinero[a];



        for (int i = 0; i < a; i++) {

            System.out.println("Ingrese nombre del cocinero: ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese los años experiencia: ");
            int experiencia = sc.nextInt();
            System.out.println("Ingrese especialidad: ");
            sc.nextLine();
            String especialidad = sc.nextLine();
            cocineros[i] = new Cocinero(nombre, experiencia, especialidad);


        }
        System.out.println("\nInformación de los cocineros:");
        for (Cocinero cocinero : cocineros) {
            cocinero.mostrarInfo(); // Mostrar información de cada cocinero
        }


        //cocinero1.mostrarInfo();
        //cocinero2.mostrarInfo();
        //cocinero3.mostrarInfo();
        sc.close();
    }
}