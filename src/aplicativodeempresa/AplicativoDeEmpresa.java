package aplicativodeempresa;

import datos.ListaEquipos;
import entidades.*;
import java.util.Scanner;

public class AplicativoDeEmpresa {
  private static Scanner sc = new Scanner(System.in);
  
  private static void showMenu() {
    System.out.println("1) Registrar equipo"
            + "\n2) Listar equipos, mostrando precio de venta"
            + "\n3) Buscar equipo, ingresando codigo"
            + "\n4) Listar equipos, ordenados en nombre descendente");
  }
  
  private static int getAnswer() {
    int n;
    do {
      System.out.print("Que opcion eliges? (1-4): ");
      n = sc.nextInt();
    } while (n < 1 || n > 4);
    return n;
  }
  
  private static void doMenu(int answer) {
    System.out.println();
      switch (answer) {
      case 1:
        System.out.println("REGISTRAR EQUIPO");
        sc.nextLine();
        registraEquipo();
        break;
      case 2:
        System.out.println("LISTAR, MOSTRANDO PRECIO DE VENTA");
        listarPrecioVenta();
        break;
      case 3:
        System.out.println("BUSCAR EQUIPO POR CODIGO");
        buscarPorCodigo();
        break;
      case 4:
        System.out.println("LISTAR EN ORDEN NOMBRE DESCENDENTE");
        listarNombreDescendente();
        break;
    }
  }
  
  private static void registraFecha(Fecha x, String frase) {
    do {
      System.out.println(frase);
      System.out.print("- Anno: ");
      x.setYear(sc.nextInt());
      System.out.print("- Mes: ");
      x.setMonth(sc.nextInt());
      System.out.print("- Dia: ");
      x.setDay(sc.nextInt());
      sc.nextLine();
    } while (control("Volver a ingresar fecha?"));
  }
  
  private static void registraEquipo() {
    Equipo equipo = new Equipo();
    Fecha fecha1 = new Fecha();
    Fecha fecha2 = new Fecha();
    System.out.print("Codigo del equipo: ");
    equipo.setCodigo(sc.nextLine());
    System.out.print("Nombre del equipo: ");
    equipo.setNombre(sc.nextLine());
    System.out.print("Unidad de medida: ");
    equipo.setUnidadDeMedida(sc.nextLine());
    registraFecha(fecha1, "Fecha de ingreso: ");
    equipo.setFechaIngreso(fecha1);
    registraFecha(fecha2, "Fecha de vencimiento: ");
    equipo.setFechaVencimiento(fecha2);
    System.out.print("Costo: ");
    equipo.setCosto(sc.nextFloat());
    ListaEquipos.setEquipo(equipo);
  }
  
  private static void listarPrecioVenta() {
    System.out.println(ListaEquipos.getListaPrecioVenta());
  }
  
  private static void buscarPorCodigo() {
    System.out.print("Ingrese el codigo del equipo: ");
    sc.nextLine();
    ListaEquipos.equipoPorCodigo(sc.nextLine());
  }
  
  private static void listarNombreDescendente() {
    ListaEquipos.ordenarNombreDesc();
    System.out.println(ListaEquipos.getListaEquipos());
  }
  
  private static boolean control(String x) {
    char resp;
    do {
      System.out.print(x + " (s/n): ");
      resp = sc.nextLine().toLowerCase().charAt(0);
    } while (resp != 's' && resp != 'n');
    if (resp == 's')
      return true;
    return false;
  }
  
  public static void main(String[] args) {
    do {
      System.out.println();
      showMenu();
      doMenu(getAnswer());
      sc.nextLine();
    } while (control("Volver al menu?"));
  }
}
