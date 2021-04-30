
import java.util.Scanner;

public class App {

    public static int global_var;
    public static int menuop;
    public static int cont = 0;
    public static int rows = 4, columns = 4;
    public static int[][] matrix = new int[4][4];

    public static void main(String[] args) throws Exception {

        System.out.println(" _______  ______    ___   _______  ___      _______    _______  ___      ___   _______  __    _  _______  _______  \n" +
        "|       ||    _ |  |   | |       ||   |    |       |  |   _   ||   |    |   | |   _   ||  |  | ||       ||   _   | \n" +
        "|_     _||   | ||  |   | |    _  ||   |    |    ___|  |  |_|  ||   |    |   | |  |_|  ||   |_| ||____   ||  |_|  | \n" +
        "  |   |  |   |_||_ |   | |   |_| ||   |    |   |___   |       ||   |    |   | |       ||       | ____|  ||       | \n" +
        "  |   |  |    __  ||   | |    ___||   |___ |    ___|  |       ||   |___ |   | |       ||  _    || ______||       | \n" +
        "  |   |  |   |  | ||   | |   |    |       ||   |___   |   _   ||       ||   | |   _   || | |   || |_____ |   _   | \n" +
        "  | __|  |___|  |_||___| |___|    |_______||_______|  |__| |__||_______||___| |__| |__||_|  |__||_______||__| |__|");


        while (menuop != 5) {
            System.out.println("\033[32m"+"__________________________________________________\n");
            System.out.println("\033[37m"+"1 - Capturar Valor");
            System.out.println();
            System.out.println("\033[37m"+"2 - Generar Tabla de Multiplicar");
            System.out.println();
            System.out.println("\033[37m"+"3 - Determinar Si es Primo o No Primo");
            System.out.println();
            System.out.println("\033[37m"+"4 - Capturar una Matriz 4 x 4: Desplegar la Diagonal Principal y Secundaria");
            System.out.println();
            System.out.println("\033[37m"+"5 - Salir del Programa");
            System.out.println("\033[32m"+"__________________________________________________\n");
            System.out.println("\033[36m"+"Escoja una opcion (la #1 sirve para #2 y #3)");
            Scanner sc = new Scanner(System.in);
            menuop = sc.nextInt(); // lee el numero a elegir del menu
            System.out.println();

            switch (menuop) {
            case 1 /* constant-expression */ :
                System.out.println();
                System.out.println("\033[36m"+"¿Que numero te gustaria usar como base para el programa? ");

                Scanner input = new Scanner(System.in);
                global_var = input.nextInt();

                System.out.println();
                System.out.println("El numero seleccionado como base del programa es el:" + global_var + "\n");

                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    System.out.println("Programa pausado");
                };
                LimpiarPantalla();
                break;

            case 2 /* constant-expression */ :

                ProcedimientoTablaMultiplicar(global_var);

                break;

            case 3 /* constant-expression */ :

                ProcedimientoMostrarEvaluacionPrimo(global_var);

                break;

            case 4 /* constant-expression */ :

                ProcedimientoDiagonalesMatriz();

                break;

            default:

                LimpiarPantalla();
                System.out.println("Fin del Programa");
                break;
            }
        };

    }

    // este es un procedimiento para limpiar la pantalla
    public static void LimpiarPantalla() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
        }
    }

    // PROCEDIMIENTOS

    // procedimiento Tabla de multiplicar
    public static void ProcedimientoTablaMultiplicar(int global_var) {

        System.out.println("\033[37m"+"Tabla de multiplicar del: " + global_var + "\n");

        for (int x = 0; x <= 12; x++) {
            System.out.println(global_var + "*" + x + "=" + global_var * x + "\n");
        }
        System.out.println();

        System.out.println("Dentro de 5 seg se borrara la pantalla");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Programa pausado");
        };

        LimpiarPantalla();

    }

    // procedimiento numero primo
    public static void ProcedimientoMostrarEvaluacionPrimo(int global_var) {

        for (int iter = 0; iter == global_var; iter++) {

            if (global_var % iter == 0) {
                cont = +1;
            }
        };

        if (cont == 2) {
            System.out.println(" El: " + global_var + " es primo \n");
        } else {
            System.out.println(" El: " + global_var + " no es primo \n");
        };

        System.out.println("Dentro de 5 seg se borrara la pantalla");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Programa pausado");
        };

        LimpiarPantalla();
    }

    // procedimiento matriz
    public static void ProcedimientoDiagonalesMatriz() {

        for (int iter_row = 0; iter_row < rows; iter_row++) // llenando la matriz
        {
            for (int iter_col = 0; iter_col < columns; iter_col++) {
                matrix[iter_row][iter_col] = (int) (Math.random() * 10 + 1);
            }

        }

        // mostrando la matriz en consola
        for (int iter_row = 0; iter_row < rows; iter_row++) {
            for (int iter_col = 0; iter_col < columns; iter_col++) {

                System.out.print(matrix[iter_row][iter_col] + "  ");

            }
            System.out.println(" ");
        }
        System.out.println(" ");


        // mostrando la matriz diagonal PRINCIPAL
        System.out.println("Diagonal principal \n");
        for (int i = 0; i < 4; i++) {

            System.out.println();
            System.out.println(matrix[i][i] + "\n");
        }
        System.out.println();

        // mostrando la matriZ DIAGONAL SECUNDARIA
        System.out.println("Diagonal secundaria\n");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i + j == 4 - 1) {
                    System.out.println();
                    System.out.println(matrix[i][j] + "\n");
                }
            }

        }
        System.out.println("En 20 sec se borrara la pantalla");
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            System.out.println("paused");
        };

        LimpiarPantalla();
    }

}
