package main.OOP_oliver.Lapsehoidja;

public class Lapsehoidja {

    private int company_num;
    private String name;

    public Lapsehoidja(int company_num, String name) {
        this.company_num = company_num;
        this.name = name;
    }

    public int getCompany_num() {
        return company_num;
    }

    public void setCompany_num(int company_num) {
        this.company_num = company_num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
