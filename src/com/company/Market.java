package com.company;
//clasa parinte pentru sectia de lapte
public class Market{
    public String numeMarket;
    public String locatia;
    public int nrColectivului;
    public int nrSectii;

    Market(String numeMarket,String locatia,int nrColectivului,int nrSectii) {
        this.numeMarket = numeMarket;
        this.locatia = locatia;
        this.nrColectivului=nrColectivului;
        this.nrSectii=nrSectii;
    }
    public String getNumeMarket() {
        return this.numeMarket;
    }
    public String getLocatia() {
        return this.locatia;
    }
    public int getNrColectivului() {
        return this.nrColectivului;
    }
    public int getNrSectii() {
        return this.nrSectii;
    }

    public void setNumeMarket(String numeMarket) {
        this.numeMarket = numeMarket;
    }
    public void setLocatia(String locatia) {
        this.locatia = locatia;
        }
    public void setNrColectivului(int nrColectivului) {
        this.nrColectivului = nrColectivului;
    }
    public void setNrSectii(int nrSectii) {
        this.nrSectii = nrSectii;
    }
    }
