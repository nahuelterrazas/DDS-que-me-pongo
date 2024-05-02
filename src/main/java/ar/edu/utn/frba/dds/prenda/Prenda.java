package ar.edu.utn.frba.dds.prenda;

import ar.edu.utn.frba.dds.prenda.propiedades.Color;
import ar.edu.utn.frba.dds.prenda.propiedades.Material;
import ar.edu.utn.frba.dds.prenda.propiedades.Trama;

public class Prenda {
  Enum tipoPrenda;
  Material material;
  Color colorPpal; //  Color colorSec;
  Trama trama;

  public Material getMaterial() {
    return material;
  }

  public Color getColorPpal() {
    return colorPpal;
  }

  public Trama getTrama() {
    return trama;
  }

  public Enum getTipoPrenda() {
    return tipoPrenda;
  }

  public Prenda(Enum tipoPrenda, Material material, Color colorPpal, Trama trama) {
    this.tipoPrenda = tipoPrenda;
    this.material = material;
    this.colorPpal = colorPpal;
    this.trama = trama;
  }
}