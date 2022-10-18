package laden;

public class Produkt
{
    private int basisPreis;
    private int alter;

    public Produkt(int basisPreis, int alter) {
        this.basisPreis = basisPreis;
        this.alter = alter;
    }

    public int getBasisPreis() {
        return basisPreis;
    }

    public void setBasisPreis(int basisPreis) {
        this.basisPreis = basisPreis;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public float getDiscountPrice()
    {
        if(alter>20)
            return basisPreis*0.8f;
        if(alter>10)
            return basisPreis*0.9f;
        return basisPreis;
    }
}


