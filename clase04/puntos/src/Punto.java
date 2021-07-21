public class Punto {
    private float x;
    private float y;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Punto() {
        x = y = 0;
    }

    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public int getCuadrante() {
        int cuad;

        if (x > 0) {
            if (y > 0) cuad = 1;
            else       cuad = 4;
        } else {
            if (y > 0) cuad = 2;
            else       cuad = 3;
        }

        return cuad;
    }

    public float getDistancia() {
        return getDistancia(new Punto());
        //return (float)Math.sqrt(x * x + y * y);
    }

    public float getDistancia(Punto otro) {
        float dx = this.x - otro.getX();
        float dy = this.y - otro.getY();
        return (float)Math.sqrt(dx * dx + dy * dy);
    }

}
