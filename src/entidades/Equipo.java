package entidades;

import entidades.Fecha;

public class Equipo {
  private String codigo;
  private String nombre;
  private String unidadDeMedida;
  private Fecha fechaIngreso;
  private Fecha fechaVencimiento;
  private float costo;

  public Equipo() {
    codigo = "noCode";
    nombre = "noName";
    unidadDeMedida = "noUnit";
    fechaIngreso = new Fecha();
    fechaVencimiento = new Fecha();
    costo = 0.0f;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setUnidadDeMedida(String unidadDeMedida) {
    this.unidadDeMedida = unidadDeMedida;
  }

  public void setFechaIngreso(Fecha fechaIngreso) {
    this.fechaIngreso = fechaIngreso;
  }

  public void setFechaVencimiento(Fecha fechaVencimiento) {
    this.fechaVencimiento = fechaVencimiento;
  }

  public void setCosto(float costo) {
    if (costo > 0)
      this.costo = costo;
    else
      System.out.println("Costo fuera de rango (<= 0)");
  }

  public String getCodigo() {
    return codigo;
  }

  public String getNombre() {
    return nombre;
  }

  public String getUnidadDeMedida() {
    return unidadDeMedida;
  }

  public Fecha getFechaIngreso() {
    return fechaIngreso;
  }

  public Fecha getFechaVencimiento() {
    return fechaVencimiento;
  }

  public float getCosto() {
    return costo;
  }
  
  public float getPrecioVenta() {
    return costo * 120 / 100;
  }

  @Override
  public String toString() {
    return "\nCodigo: " + getCodigo() +
            "\nNombre: " + getNombre() +
            "\nUnidad de medida: " + getUnidadDeMedida() + 
            "\nCosto: " + getCosto() +
            "\nFecha de ingreso (almacen): " + getFechaIngreso() + 
            "\nFecha de vencimiento: " + getFechaVencimiento();
  }
}
