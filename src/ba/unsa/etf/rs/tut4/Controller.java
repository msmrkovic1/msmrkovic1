package ba.unsa.etf.rs.tut4;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import java.util.ArrayList;

public class Controller {
  public TextArea upisArtikala;
  public TextArea ispisArtikala;
  public Button dodajArtikle;
  public ChoiceBox izborArtikla;
  
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
}