package main.OOP_Madis.src.Garaa�Auto;

public class Auto
{
    private String automark, numbrid, v�rv;
    private int tippkiirus;

    public Auto(String automark, String numbrid, String v�rv, int tippkiirus)
    {
        this.automark = automark;
        this.numbrid = numbrid;
        this.v�rv = v�rv;
        this.tippkiirus = tippkiirus;
    }

    public String getAutomark()
    {
        return automark;
    }

    public void setAutomark(String automark)
    {
        this.automark = automark;
    }

    public String getNumbrid()
    {
        return numbrid;
    }

    public void setNumbrid(String numbrid)
    {
        this.numbrid = numbrid;
    }

    public String getV�rv()
    {
        return v�rv;
    }

    public void setV�rv(String v�rv)
    {
        this.v�rv = v�rv;
    }

    public int getTippkiirus()
    {
        return tippkiirus;
    }

    public void setTippkiirus(int tippkiirus)
    {
        this.tippkiirus = tippkiirus;
    }

    public String auto_andmed()
    {
        final StringBuffer sb = new StringBuffer("Auto{");
        sb.append("automark='").append(automark).append('\'');
        sb.append(", numbrid='").append(numbrid).append('\'');
        sb.append(", v�rv='").append(v�rv).append('\'');
        sb.append(", tippkiirus=").append(tippkiirus);
        sb.append('}');
        return sb.toString();
    }
}
