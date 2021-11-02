package main.OOP_Madis.src.GaraaþAuto;

public class Auto
{
    private String automark, numbrid, värv;
    private int tippkiirus;

    public Auto(String automark, String numbrid, String värv, int tippkiirus)
    {
        this.automark = automark;
        this.numbrid = numbrid;
        this.värv = värv;
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

    public String getVärv()
    {
        return värv;
    }

    public void setVärv(String värv)
    {
        this.värv = värv;
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
        sb.append(", värv='").append(värv).append('\'');
        sb.append(", tippkiirus=").append(tippkiirus);
        sb.append('}');
        return sb.toString();
    }
}
