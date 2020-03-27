package ba.unsa.etf.rs.tut4;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import java.util.ArrayList;

public class Controller {
  public TextArea upisArtikala;
  public TextArea ispisArtikala;
  public Button dodajArtikle;
  
  ArrayList<Artikal> Artikli = new ArrayList<Artikal>();
  public void UpisiArtikle(ActionEvent actionEvent) {
    String upis = upisArtikala.getText();
    String[] artikli = upis.split("\n");
    for (String artikal : artikli) Artikli.add(new Artikal(artikal));
    Artikli = Artikal.izbaciDuplikate(Artikli);
    IspisiArtikle();
  }
  
  private void IspisiArtikle() {
    String ispis = new String();
    for (Artikal a: Artikli) ispis += a.IspisiArtikal() + "\n";
    ispisArtikala.setText(ispis);
  }
}