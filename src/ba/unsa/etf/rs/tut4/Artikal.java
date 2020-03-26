package ba.unsa.etf.rs.tut4;

import java.util.ArrayList;

public class Artikal {
  private String sifra, naziv;
  private double cijena;

  Artikal(String str){
    String[] rastavljeno = str.split(",");
    setSifra(rastavljeno[0]);
    setNaziv(rastavljeno[1]);
    setCijena(Double.parseDouble(rastavljeno[2]));
  }

  public double getCijena() { return cijena; }
  public String getNaziv() { return naziv; }
  public String getSifra() { return sifra; }

  public void setCijena(double cijena) {
    if (cijena < 1)
      throw new IllegalArgumentException("Cijena je negativna");
    this.cijena = cijena;
  }
  public void setSifra(String sifra) {
    if(!sifra.length())
      throw new IllegalArgumentException("Šifra je prazna");
    this.sifra = sifra;
  }
  public void setNaziv(String naziv) {
    if(!naziv.length())
      throw new IllegalArgumentException("Cijena je negativna");
    this.naziv = naziv;
  }
  
  public boolean equals(Object o){
    Artikal artikal = (Artikal) o;
    if(artikal.getCijena().equals(cijena) && artikal.getNaziv().equals(naziv) && artikal.getSifra().equals(sifra))
      return true;
    return false;
  }
  
  public String toString(){ return sifra + ", " + naziv + ", " + cijena; }
  public static ArrayList<Artikal> izbaciDuplikate(ArrayList<Artikal> artikli){
    for(int i = 0; i < artikli.size(); i++){
      for(int j = i + 1; j < artikli.size(); j++){
        if(a.get(i).equals(artikli.get(j))) artikli.remove(j);
      }
    }
    return a;
  }
}
