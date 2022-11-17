public class Krug extends GeometrijskiObjekat{
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double Povrsina() {
        return Math.pow(getR(), 2) * Math.PI;
    }
}
