package ba.unsa.etf.rs.tut4;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;

import java.util.ArrayList;

public class Controller {
  public TextArea upisArtikala;
  public TextArea ispisArtikala;
  public Button dodajArtikle;
  public ChoiceBox izborArtikla;
  public Spinner kolicina;
  public TextArea račun;
  
  ArrayList<Artikal> Artikli = new ArrayList<Artikal>();
  public void UpisiArtikle(ActionEvent actionEvent) {
    String upis = upisArtikala.getText();
    String[] artikli = upis.split("\n");
    for (String artikal : artikli) Artikli.add(new Artikal(artikal));
    Artikli = Artikal.izbaciDuplikate(Artikli);
    String ispis = IspisArtikala();
    ispisArtikala.setText(ispis);
  
    for (Artikal artikal: Artikli) izborArtikla.getItems().add(artikal.IspisiArtikal());
  }
  
  private String IspisArtikala() {
    String ispis = new String();
    for (Artikal a: Artikli) ispis += a.IspisiArtikal() + "\n";
    return ispis;
  }
  
  Racun racun = new Racun();
  public void UpisiStavku(ActionEvent actionEvent) {
    String upis = (String) izborArtikla.getValue();
    Artikal cao = new Artikal(upis);
//    String kol = (String) kolicina.getValue();
//    racun.dodajStavku(cao, Integer.parseInt(kol));
    račun.setText(upis);// + ", " + kol);
  }
}