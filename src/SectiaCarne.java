package com.company;
//incapsularea.
public class SectiaCarne {
    public int kgCarne;
    public String tipul;
    public int anulProducerii;

  SectiaCarne(int kgCarne,String tipul,int anulProducerii) {
      this.kgCarne=kgCarne;
      this.tipul=tipul;
      this.anulProducerii=anulProducerii;
  }
  public int getKgCarne(){
      return this.kgCarne;
  }
  public String getTipul(){
      return this.tipul;
  }
  public int getAnulProducerii(){
      return this.anulProducerii;
  }
  public void setKgCarne(int kgCarne){
      this.kgCarne=kgCarne;
  }
  public void setTipul(String tipul){
      this.tipul=tipul;
  }
  public void setAnulProducerii(int anulProducerii){
      this.anulProducerii=anulProducerii;
  }
}
