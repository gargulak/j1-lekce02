package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
  private Turtle zofka;

  private final double RIGHT_ANGLE = 90;
  private final double ACUTE_ANGLE = 45;
  private final double OBTUSE_ANGLE = 135;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();

    double initialX = 200;
    double initialY = 200;
    double houseSize = 100;

    for (int i = 0; i < 4; i++) {
      drawHouse(initialX, initialY, houseSize);
      zofka.turnLeft(RIGHT_ANGLE);
      zofka.move(houseSize);
    }
  }

  private void drawHouse(double initialX, double initialY, double size) {
    double diagonalSize = Math.sqrt(Math.pow(size, 2) + Math.pow(size, 2));
    double roofSize = diagonalSize / 2;

    zofka.setLocation(initialX, initialY);
    zofka.penDown();
    zofka.turnLeft(RIGHT_ANGLE);
    zofka.move(size);
    zofka.turnRight(OBTUSE_ANGLE);
    zofka.move(diagonalSize);
    zofka.turnLeft(OBTUSE_ANGLE);
    zofka.move(size);
    zofka.turnRight(OBTUSE_ANGLE);
    zofka.move(roofSize);
    zofka.turnRight(RIGHT_ANGLE);
    zofka.move(roofSize);
    zofka.turnRight(ACUTE_ANGLE);
    zofka.move(size);
    zofka.turnRight(OBTUSE_ANGLE);
    zofka.move(diagonalSize);
    zofka.turnLeft(OBTUSE_ANGLE);
    zofka.move(size);
    zofka.penUp();
  }

}
