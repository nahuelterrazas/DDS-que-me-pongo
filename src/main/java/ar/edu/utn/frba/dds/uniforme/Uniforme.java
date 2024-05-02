package ar.edu.utn.frba.dds.uniforme;

import ar.edu.utn.frba.dds.prenda.Prenda;

public class Uniforme {

  Prenda prendaSuperior;
  Prenda prendaInferior;
  Prenda prendaCalzado;

  public Uniforme(Prenda prendaSuperior, Prenda prendaInferior, Prenda prendaCalzado) {
    this.prendaSuperior = prendaSuperior;
    this.prendaInferior = prendaInferior;
    this.prendaCalzado = prendaCalzado;
  }

  public void setPrendaSuperior(Prenda prendaSuperior) {
    this.prendaSuperior = prendaSuperior;
  }

  public void setPrendaCalzado(Prenda prendaCalzado) {
    this.prendaCalzado = prendaCalzado;
  }

  public void setPrendaInferior(Prenda prendaInferior) {
    this.prendaInferior = prendaInferior;
  }
}
