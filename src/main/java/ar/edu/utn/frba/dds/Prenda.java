package ar.edu.utn.frba.dds;

public class Prenda {
  Enum tipoPrenda;
  Material material;
  Colour colorPrincipal;
  Colour colorSecundario;

  public Prenda(Enum tipoPrenda, Material material, Colour colorPrincipal){
    if (tipoPrenda == null || material == null || colorPrincipal == null) {
      throw new RuntimeException("No se pudo registrar la prenda por falta de datos");
    }
    this.tipoPrenda = tipoPrenda;
    this.material = material;
    this.colorPrincipal = colorPrincipal;
  }

  public Prenda(Enum tipoPrenda, Material material, Colour colorPrincipal, Colour colorSecundario){
    if (tipoPrenda == null || material == null || colorPrincipal == null) {
      throw new RuntimeException("No se pudo registrar la prenda por falta de datos");
    }
    this.tipoPrenda = tipoPrenda;
    this.material = material;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
  }

}

enum Colour {
  AZUL,
  BLANCO,
  AMARILLO,
  ROJO,
  VERDE,
  CELESTE;
}

enum Material {
  ALGODON,
  LANA,
  TELA;
}