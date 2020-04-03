package ba.unsa.etf.rs.tut4;

import java.util.ArrayList;
import java.util.Iterator;

public class Artikal {
  private String sifra, naziv;
  private double cijena;

  Artikal(String str){
    String[] rastavljeno = str.split(",");
    setSifra(rastavljeno[0]);
    setNaziv(rastavljeno[1]);
    setCijena(Double.parseDouble(rastavljeno[2]));
  }
  Artikal(String sifra, String naziv, double cjena) {
    setSifra(sifra);
    setNaziv(naziv);
    setCijena(cjena);
  }
  
  public String getSifra() { return sifra; }
  public String getNaziv() { return naziv; }
  public double getCijena() { return cijena; }
  public String IspisiArtikal() { return new String(getSifra() + "," + getNaziv() + "," + getCijena()); }
  
  public void setCijena(double cijena) {
    if (cijena < 1)
      throw new IllegalArgumentException("Cijena je negativna");
    this.cijena = cijena;
  }
  public void setSifra(String sifra) {
    if(sifra.length() == 0)
      throw new IllegalArgumentException("Šifra je prazna");
    this.sifra = sifra;
  }
  
  public void setNaziv(String naziv) {
    if(naziv.length() == 0)
      throw new IllegalArgumentException("Cijena je negativna");
    this.naziv = naziv;
  }
  
  public boolean equals(Object o){
    Artikal artikal = (Artikal) o;
    if(artikal.getCijena() == cijena && artikal.getNaziv().equals(naziv) && artikal.getSifra().equals(sifra))
      return true;
    return false;
  }
  public String toString(){ return sifra + "," + naziv + "," + cijena; }
  
  public static ArrayList<Artikal> izbaciDuplikate(ArrayList<Artikal> artikli){
    for(int i = 0; i < artikli.size(); i++){
      for(int j = i + 1; j < artikli.size(); j++){
        if(artikli.get(i).equals(artikli.get(j))) { artikli.remove(j); j--; }
      }
    }
    return artikli;
  }
}
