public abstract class GeometrijskiObjekat {
    Tacka t;
    public GeometrijskiObjekat() {
        t.setX(0);
        t.setY(0);
    }
    public GeometrijskiObjekat(int x, int y) {
        t.setX(x);
        t.setY(y);
    }
    public GeometrijskiObjekat(Tacka a) {
        t.setX(a.getX());
        t.setY(a.getY());
    }

    public abstract int Povrsina();
    public String Ispis() {
     return "Tacka(" + t.getX() + ", " + t.getY() + ")";
    }

}