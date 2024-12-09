// Nombre: Alisson Ibarguen
// Número de ID: 8-1020-2253
// Facultad: FACULTAD DE INGENIERÍA, ARQUITECTURA Y DISEÑO
// Carrera: Lic. INGENIERÍA EN SISTEMAS COMPUTACIONALES
// Curso: Programación de Computadoras II

/*
Enunciado: Elaborar un programa de línea de comandos que actúe como una calculadora de área y de perímetro para
las siguientes figuras geométricas: círculo, cuadrado, triángulo, rectángulo, pentágono. El programa debe permitir
la elección de la figura, luego permitir la elección de la operación (área o perímetro), luego solicitar los datos
para el cálculo y finalmente presentar el resultado en pantalla.
*/

// importamos la clase Scanner del paquete java.util
import java.util.Scanner;

// Clase principal Main
public class Main {
    // Metodo principal main
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione la figura geométrica:");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        System.out.println("4. Rectángulo");
        System.out.println("5. Pentágono");
        // Solicitar y leer la figura
        int figura = scanner.nextInt();

        // Solicitar y leer la operación
        System.out.println("Seleccione la operación:");
        System.out.println("1. Área");
        System.out.println("2. Perímetro");
        // Solicitar y leer la operación
        int operacion = scanner.nextInt();

        // Realizar el cálculo según la figura y la operación seleccionada
        switch (figura) {
            // Círculo
            case 1:
                // Solicitar y leer el radio del círculo
                System.out.print("Ingrese el radio del círculo: ");
                double radio = scanner.nextDouble();
                // Realizar el cálculo del área o perímetro según la operación seleccionada
                if (operacion == 1) {
                    System.out.println("Área del círculo: " + (Math.PI * radio * radio));
                } else {
                    System.out.println("Perímetro del círculo: " + (2 * Math.PI * radio));
                }
                break;
            // Cuadrado
            case 2:
                // Solicitar y leer el lado del cuadrado
                System.out.print("Ingrese el lado del cuadrado: ");
                double ladoCuadrado = scanner.nextDouble();
                // Realizar el cálculo del área o perímetro según la operación seleccionada
                if (operacion == 1) {
                    System.out.println("Área del cuadrado: " + (ladoCuadrado * ladoCuadrado));
                } else {
                    System.out.println("Perímetro del cuadrado: " + (4 * ladoCuadrado));
                }
                break;
            // Triángulo
            case 3:
                // Solicitar y leer la base y la altura del triángulo
                System.out.print("Ingrese la base del triángulo: ");
                double baseTriangulo = scanner.nextDouble();
                System.out.print("Ingrese la altura del triángulo: ");
                double alturaTriangulo = scanner.nextDouble();
                // Realizar el cálculo del área o perímetro según la operación seleccionada
                if (operacion == 1) {
                    System.out.println("Área del triángulo: " + (0.5 * baseTriangulo * alturaTriangulo));
                } else {
                    System.out.print("Ingrese los otros dos lados del triángulo: ");
                    double lado1 = scanner.nextDouble();
                    double lado2 = scanner.nextDouble();
                    System.out.println("Perímetro del triángulo: " + (baseTriangulo + lado1 + lado2));
                }
                break;
            // Rectángulo
            case 4:
                // Solicitar y leer la longitud y el ancho del rectángulo
                System.out.print("Ingrese la longitud del rectángulo: ");
                double longitud = scanner.nextDouble();
                System.out.print("Ingrese el ancho del rectángulo: ");
                double ancho = scanner.nextDouble();
                // Realizar el cálculo del área o perímetro según la operación seleccionada
                if (operacion == 1) {
                    System.out.println("Área del rectángulo: " + (longitud * ancho));
                } else {
                    System.out.println("Perímetro del rectángulo: " + (2 * (longitud + ancho)));
                }
                break;
            // Pentágono
            case 5:
                // Solicitar y leer el lado y el apotema del pentágono
                System.out.print("Ingrese el lado del pentágono: ");
                double ladoPentagono = scanner.nextDouble();
                System.out.print("Ingrese el apotema del pentágono: ");
                double apotema = scanner.nextDouble();
                // Realizar el cálculo del área o perímetro según la operación seleccionada
                if (operacion == 1) {
                    System.out.println("Área del pentágono: " + (5 * ladoPentagono * apotema / 2));
                } else {
                    System.out.println("Perímetro del pentágono: " + (5 * ladoPentagono));
                }
                break;
            // Opción no válida
            default:
                System.out.println("Opción no válida.");
        }
        scanner.close();
    }
}