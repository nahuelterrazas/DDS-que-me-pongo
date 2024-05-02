package ar.edu.utn.frba.dds.prenda;

import ar.edu.utn.frba.dds.prenda.propiedades.Color;
import ar.edu.utn.frba.dds.prenda.propiedades.Material;
import ar.edu.utn.frba.dds.prenda.propiedades.Trama;

public class BorradorPrenda {
  Enum tipoPrenda;
  Material material;
  Color colorPrincipal; //  Color colorSecundario;
  Trama trama = Trama.LISA;

  public BorradorPrenda(Enum tipoPrenda) {
    if (tipoPrenda == null) {
      throw new RuntimeException("no se selecciono un tipo de prenda");
    }
    this.tipoPrenda = tipoPrenda;
  }

  public void setMaterial(Material material) {
    this.material = material;
  }

  public void setColorPrincipal(Color colorPrimario) {
    this.colorPrincipal = colorPrimario;
  }

  public void setTrama(Trama trama) {
    this.trama = trama;
  }

  public Prenda crearPrenda() {
    if (tipoPrenda == null || material == null || colorPrincipal == null) {
      throw new RuntimeException("No se pudo crear la prenda por falta de datos");
    }
    Prenda miPrenda = new Prenda(tipoPrenda, material, colorPrincipal, trama);
    return miPrenda;
  }
}
