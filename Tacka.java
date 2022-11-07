public class Tacka {
    private int x,y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public Tacka (){}
    public Tacka (int x,int y)
    {
        this.x = x;
        this.y = y;
    }
    public double rastojanje()
    {
        double r;
        return r = Math.sqrt(Math.pow(x-this.x,2)-Math.pow(y-this.y,2));
    }

    public void pomeriX(int pomeraj)
    {
        x = x+pomeraj;
    }
    public void pomeri(int pomeraj)
    {
        x = x+pomeraj;
        y = y+pomeraj;
    }
    public void pomeriY(int pomeraj)
    {
        y = y+pomeraj;
    }

    public String ispis()
    {
        return "Tacka("+x+","+y+")";
    }

    public Tacka(Tacka t)
    {
        this(t.x,t.y);
    }
}

