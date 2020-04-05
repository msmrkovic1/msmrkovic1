package ba.unsa.etf.rs.tut4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RacunTest {

    @Test
    void test1() {
        Racun r = new Racun();
        r.dodajStavku(new Artikal("HLB", "Hljeb", 1.1), 2);
        r.dodajStavku(new Artikal("JAJ", "Jaje", 0.25), 5);
        assertEquals(3.45, r.ukupanIznos());
    }

    @Test
    void testPrazno() {
        Racun r = new Racun();
        assertEquals(0, r.ukupanIznos());
    }
    
    @Test
    void testUkupanIznos() {
        Racun r = new Racun();
        r.dodajStavku(new Artikal("poz", "pozdrav", 1.10), 1);
        r.dodajStavku(new Artikal("zdravo", "hljeb", 2.05), 1);
        r.dodajStavku(new Artikal("poljoprivreda", "krompir", 1.05), 1);
        assertEquals(4.20, r.ukupanIznos());
    }
}