package com.nes.entidades;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
  private int NitCliente;
  private String nombre;
  private String clave;
  private boolean administrador;
  private List pedidos = new ArrayList<>();

  public int getId() {
    return id;
  }

  public void setId(int NitCliente) {
    this.NitCliente = NitCliente;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getUsuario() {
    return usuario;
  }


  public String getClave() {
    return clave;
  }

  public void setClave(String clave) {
    this.clave = clave;
  }

  public boolean isAdministrador() {
    return administrador;
  }

  public void setAdministrador(boolean administrador) {
    this.administrador = administrador;
  }

  public List getPedidos() {
    return pedidos;
  }

  public void setPedidos(List pedidos) {
    this.pedidos = pedidos;
  }
}