package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import com.google.gson.JsonObject;

import java.util.Scanner;

import static org.example.ConversorMonedas.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        JsonObject tasas = obtenerTasas();
        if (tasas == null) {
            System.out.println("No se pudieron cargar las tasas.");
            return;
        }

        int opcion = 0;

        while (opcion != 15) {

            System.out.println("====== CONVERSOR DE MONEDAS COP ======");
            System.out.println("1.  COP → USD");
            System.out.println("2.  COP → EUR");
            System.out.println("3.  COP → ARS (Peso Argentino)");
            System.out.println("4.  COP → MXN (Peso Mexicano)");
            System.out.println("5.  COP → BRL (Real Brasileño)");
            System.out.println("6.  COP → CLP (Peso Chileno)");
            System.out.println("7.  COP → PEN (Sol Peruano)");
            System.out.println("8.  COP → GBP (Libra Esterlina)");
            System.out.println("9.  COP → JPY (Yen Japonés)");
            System.out.println("10. COP → KRW (Won Coreano)");
            System.out.println("11. COP → CAD (Dólar Canadiense)");
            System.out.println("12. COP → AUD (Dólar Australiano)");
            System.out.println("13. USD → COP (inverso)");
            System.out.println("14. EUR → COP (inverso)");
            System.out.println("15. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            if (opcion == 15) {
                System.out.println("Saliendo...");
                break;
            }

            // Opción inversa no usa valores en COP como base
            double cantidad;
            double resultado;

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese COP: ");
                    cantidad = sc.nextDouble();
                    resultado = convertirDesdeCOP(cantidad, tasas.get("USD").getAsDouble());
                    System.out.println("Resultado en USD: " + resultado);
                    break;

                case 2:
                    System.out.print("Ingrese COP: ");
                    cantidad = sc.nextDouble();
                    resultado = convertirDesdeCOP(cantidad, tasas.get("EUR").getAsDouble());
                    System.out.println("Resultado en EUR: " + resultado);
                    break;

                case 3:
                    System.out.print("Ingrese COP: ");
                    cantidad = sc.nextDouble();
                    resultado = convertirDesdeCOP(cantidad, tasas.get("ARS").getAsDouble());
                    System.out.println("Resultado en ARS: " + resultado);
                    break;

                case 4:
                    System.out.print("Ingrese COP: ");
                    cantidad = sc.nextDouble();
                    resultado = convertirDesdeCOP(cantidad, tasas.get("MXN").getAsDouble());
                    System.out.println("Resultado en MXN: " + resultado);
                    break;

                case 5:
                    System.out.print("Ingrese COP: ");
                    cantidad = sc.nextDouble();
                    resultado = convertirDesdeCOP(cantidad, tasas.get("BRL").getAsDouble());
                    System.out.println("Resultado en BRL: " + resultado);
                    break;

                case 6:
                    System.out.print("Ingrese COP: ");
                    cantidad = sc.nextDouble();
                    resultado = convertirDesdeCOP(cantidad, tasas.get("CLP").getAsDouble());
                    System.out.println("Resultado en CLP: " + resultado);
                    break;

                case 7:
                    System.out.print("Ingrese COP: ");
                    cantidad = sc.nextDouble();
                    resultado = convertirDesdeCOP(cantidad, tasas.get("PEN").getAsDouble());
                    System.out.println("Resultado en PEN: " + resultado);
                    break;

                case 8:
                    System.out.print("Ingrese COP: ");
                    cantidad = sc.nextDouble();
                    resultado = convertirDesdeCOP(cantidad, tasas.get("GBP").getAsDouble());
                    System.out.println("Resultado en GBP: " + resultado);
                    break;

                case 9:
                    System.out.print("Ingrese COP: ");
                    cantidad = sc.nextDouble();
                    resultado = convertirDesdeCOP(cantidad, tasas.get("JPY").getAsDouble());
                    System.out.println("Resultado en JPY: " + resultado);
                    break;

                case 10:
                    System.out.print("Ingrese COP: ");
                    cantidad = sc.nextDouble();
                    resultado = convertirDesdeCOP(cantidad, tasas.get("KRW").getAsDouble());
                    System.out.println("Resultado en KRW: " + resultado);
                    break;

                case 11:
                    System.out.print("Ingrese COP: ");
                    cantidad = sc.nextDouble();
                    resultado = convertirDesdeCOP(cantidad, tasas.get("CAD").getAsDouble());
                    System.out.println("Resultado en CAD: " + resultado);
                    break;

                case 12:
                    System.out.print("Ingrese COP: ");
                    cantidad = sc.nextDouble();
                    resultado = convertirDesdeCOP(cantidad, tasas.get("AUD").getAsDouble());
                    System.out.println("Resultado en AUD: " + resultado);
                    break;

                case 13:  // USD → COP
                    System.out.print("Ingrese USD: ");
                    cantidad = sc.nextDouble();
                    resultado = convertirACOP(cantidad, tasas.get("USD").getAsDouble());
                    System.out.println("Resultado en COP: " + resultado);
                    break;

                case 14:  // EUR → COP
                    System.out.print("Ingrese EUR: ");
                    cantidad = sc.nextDouble();
                    resultado = convertirACOP(cantidad, tasas.get("EUR").getAsDouble());
                    System.out.println("Resultado en COP: " + resultado);
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

            System.out.println();
        }

        sc.close();
    }
    }
