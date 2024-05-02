package ar.edu.utn.frba.dds.uniforme;

import ar.edu.utn.frba.dds.prenda.Prenda;
import ar.edu.utn.frba.dds.prenda.propiedades.TipoPrenda;

public class BorradorUniforme {
  Prenda prendaSuperior;
  Prenda prendaInferior;
  Prenda prendaCalzado;

  public void setPrendaSuperior(Prenda prendaSuperior) {
    if (TipoPrenda.Superior.class != prendaSuperior.getTipoPrenda().getClass()) {
      throw new RuntimeException("No es prenda superior");
    }
    this.prendaSuperior = prendaSuperior;
  }

  public void setPrendaInferior(Prenda prendaInferior) {
    if (TipoPrenda.Inferior.class != prendaInferior.getTipoPrenda().getClass()) {
      throw new RuntimeException("No es prenda inferior");
    }
    this.prendaInferior = prendaInferior;
  }

  public void setCalzado(Prenda calzado) {
    if (TipoPrenda.Calzado.class != calzado.getTipoPrenda().getClass()) {
      throw new RuntimeException("No es prenda calzado");
    }
    this.prendaCalzado = calzado;
  }

  public Uniforme crearUniforme() {
    if (prendaSuperior == null || prendaInferior == null || prendaCalzado == null) {
      throw new RuntimeException("El uniforme no esta completo");
    }
    return new Uniforme(prendaSuperior, prendaInferior, prendaCalzado);
  }

}