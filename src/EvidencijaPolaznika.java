import java.util.*;

public class EvidencijaPolaznika {

    public static void main(String[] args) {
        Map<String, Polaznici> polazniciMap = new HashMap<>();

        try {
            dodajPolaznika(polazniciMap, new Polaznici("Markic", "marko.markic@gmail.com", "Marko"));
            dodajPolaznika(polazniciMap, new Polaznici("Ivic", "ivanivic@gmail.com", "Ivan"));
            dodajPolaznika(polazniciMap, new Polaznici("Ivic", "ivanivic@gmail.com", "Ivan")); // duplikat
            dodajPolaznika(polazniciMap, new Polaznici("Anic", "anaanic@gmail.com", "Ana"));
        } catch (IllegalArgumentException e) {
            System.out.println("Greška: " + e.getMessage());
        }

        List<Polaznici> sortiraniPolaznici = new ArrayList<>(polazniciMap.values());
        sortiraniPolaznici.sort(Comparator.comparing(Polaznici::getPrezime, String.CASE_INSENSITIVE_ORDER));

        System.out.println("Jedinstveni polaznici sortirani po prezimenu:");
        for (Polaznici p : sortiraniPolaznici) {
            System.out.println("Ime: " + p.getIme());
            System.out.println("Prezime: " + p.getPrezime());
            System.out.println("Email: " + p.getEmail());
            System.out.println("------------------------");
        }
    }

    public static void dodajPolaznika(Map<String, Polaznici> mapa, Polaznici novi) {
        if (mapa.containsKey(novi.getEmail().toLowerCase())) {
            throw new IllegalArgumentException("Polaznik s emailom " + novi.getEmail() + " već postoji.");
        }
        mapa.put(novi.getEmail().toLowerCase(), novi);
    }
}
