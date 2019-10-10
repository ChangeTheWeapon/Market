package com.company;
//clasa mostenitoare de la market
class SectiaLactate extends Market{
    public int lLapte;
    public int kgUnt;
    public int kgBrinza;
    public int kgCascaval;

    SectiaLactate(String numeMarket, String locatia, int nrColectivului, int nrSectii,int lLapte,int kgUnt,int kgBrinza,int kgCascaval){
        super(numeMarket,locatia,nrColectivului,nrSectii);
        this.lLapte=lLapte;
        this.kgUnt=kgUnt;
        this.kgBrinza=kgBrinza;
        this.kgCascaval=kgCascaval;
    }
    public int  getlLapte() {
        return this.lLapte;
    }
    public int getKgUnt()
    {
        return this.kgUnt;
    }
    public int getKgBrinza()
    {
        return this.kgBrinza;
    }
    public int getKgCascaval()
    {
        return this.kgCascaval;
    }
    public void setLLapte(int lLapte)
    {
        this.lLapte=lLapte;
    }
    public void setKgUnt(int kgUnt)
    {
        this.kgUnt=kgUnt;
    }
    public void setKgBrinza(int kgBrinza)
    {
        this.kgBrinza=kgBrinza;
    }
    public void setKgCascaval(int kgCascaval)
    {
        this.kgCascaval=kgCascaval;
    }
}