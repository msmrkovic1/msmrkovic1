package ba.unsa.etf.rs.tut4;

public class Artikal {
  private String sifra, naziv;
  private double cijena;

    Artikal(String str){
      String[] odvoji = str.split(",");
      this.sifra = odvoji[0];
      this.naziv = odvoji[1];
      this.cijena = Double.parseDouble(odvoji[2]);

    }

  public double getCijena() { return cijena; }
  public String getNaziv() { return naziv; }
  public String getSifra() { return sifra; }

  public void setCijena(double cijena) { this.cijena = cijena; }
  public void setSifra(String sifra) { this.sifra = sifra; }
  public void setNaziv(String naziv) { this.naziv = naziv; }
}
