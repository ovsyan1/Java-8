package Klassen;

import java.util.Random;

public class Geometrie {
  public static void main(String[] args) {
    Random random = new Random();

    for (int i = 1; i <= 100; i++) {
      System.out.println(i +
        ". " +
        new Rechteck(
          random.nextInt(1, 20),
          random.nextInt(1, 20)
        ));
    }

    System.out.println("\n***********");

    System.out.println(new Kreis(5).toString());

    System.out.println("\n***********");

    Rechteck rechteck = new Rechteck(5, 10);

    System.out.println(rechteck);

    rechteck.setNeuBreiteUndHoehe(8, 8);

    System.out.println(rechteck);

    Rechteck.setNeuBreiteUndHoeheStatic(rechteck, -2, 3);

    System.out.println(rechteck);
  }
}

class Rechteck {
  private int breite;
  private int hoehe;
  private int masse;

  Rechteck(int breite, int hoehe) {
    if(breite <= 0 || hoehe <= 0){
      throw new IllegalArgumentException("Breite und höhe muss positiv sein! Aktuell breite: " + breite + " Hoehe:" + hoehe);
    }
    this.breite = breite;
    this.hoehe = hoehe;
  }

  void showRechtekMasse() {
    System.out.println("Masse: " + this.masse);
  }

  @Override
  public String toString() {
    return "Rechteck (" + this.breite + " X " + this.hoehe + ")";
  }

  static void setNeuBreiteUndHoeheStatic(Rechteck r, int neueBreite, int neueHoehe) {
    r.setNeuBreiteUndHoehe(neueBreite, neueHoehe);
  }

  void setNeuBreiteUndHoehe(int neueBreite, int neueHoehe) {
    if(neueBreite <= 0 || neueHoehe <= 0) {

      throw new IllegalArgumentException("Breite und Hohe should positive and bigger then 0 be");
    } else {
      this.breite = neueBreite;
      this.hoehe = neueHoehe;
    }

  }
}

class Kreis {
  private int radius;

  Kreis(int radius) {
    this.radius = radius;
  }

  void showKreisRadius() {
    System.out.println("Radius: " + radius);
  }

  @Override
  public String toString() {
    return "Kreis. R = " + this.radius;
  }
}
