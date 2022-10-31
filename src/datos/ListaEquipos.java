package datos;

import entidades.Equipo;

public class ListaEquipos {
  public static final int TAM = 20;
  private static Equipo[] lista = new Equipo[TAM];
  private static int position = -1;

  public static void setEquipo(Equipo equipo) {
    position++;
    lista[position] = equipo;
  }
  
  public static String getListaEquipos() {
    String contenido = "";
    for (int i = 0; i <= position; i++)
      contenido += "\nEQUIPO " + (i + 1) + ":" + lista[i].toString() + "\n";
    return contenido;
  }
  
  public static String getListaPrecioVenta() {
    String contenido = "CODIGO --- NOMBRE --- PRECIO DE VENTA";
    for (int i = 0; i <= position; i++)
      contenido += "\n" + lista[i].getCodigo() + " --- " + lista[i].getNombre() + " --- " + lista[i].getPrecioVenta();
    return contenido;
  }
  
  public static void equipoPorCodigo(String busqueda) {
    for (int i = 0; i <= position; i++)
      if (lista[i].getCodigo().compareTo(busqueda) == 0)
        System.out.println(lista[i]);
  }
  
  public static void ordenarNombreDesc() {
    Equipo x = new Equipo();
    for (int i = 0; i <= position; i++) {
      for (int j = i + 1; j <= position; j++) {
        if (lista[i].getNombre().compareTo(lista[j].getNombre()) > 0) {
          x = lista[i];
          lista[i] = lista[j];
          lista[j] = x;
          System.out.println("cambio");
        }
      }
    }
  }
  
  public static int getPosition() {
    return position;
  }
}
