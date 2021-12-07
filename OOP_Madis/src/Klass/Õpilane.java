package main.OOP_Madis.src.Klass;

public class Õpilane implements Comparable<Õpilane>
{

    private String nimi, klass, sugu;
    private int vanus;

    public Õpilane(String nimi, String klass, String sugu, int vanus)
    {
        this.nimi = nimi;
        this.klass = klass;
        this.sugu = sugu;
        this.vanus = vanus;
    }


    public String Info()
    {
        final StringBuilder sb = new StringBuilder("Õpilane{");
        sb.append("nimi='").append(nimi).append('\'');
        sb.append(", klass='").append(klass).append('\'');
        sb.append(", sugu='").append(sugu).append('\'');
        sb.append(", vanus=").append(vanus);
        sb.append('}');
        return sb.toString();
    }

    public String getNimi()
    {
        return nimi;
    }

    public void setNimi(String nimi)
    {
        this.nimi = nimi;
    }

    public String getKlass()
    {
        return klass;
    }

    public void setKlass(String klass)
    {
        this.klass = klass;
    }

    public String getSugu()
    {
        return sugu;
    }

    public void setSugu(String sugu)
    {
        this.sugu = sugu;
    }

    public int getVanus()
    {
        return vanus;
    }

    public void setVanus(int vanus)
    {
        this.vanus = vanus;
    }

    @Override
    public int compareTo(Õpilane o)
    {
        return 0;
    }
}
