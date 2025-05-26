import java.util.TreeSet;

public class EvidencijaPolaznika {

    public static void main(String[] args) {
        TreeSet<Polaznici> polazniciSet = new TreeSet<>(); // koristi Comparable

        try {
            dodajPolaznika(polazniciSet, new Polaznici("Markic", "marko.markic@gmail.com", "Marko"));
          //  dodajPolaznika(polazniciSet, new Polaznici("Ivic", "ivanivic@gmail.com", "Ivan"));
            dodajPolaznika(polazniciSet, new Polaznici("Ivic", "ivanivic@gmail.com", "Ivan")); // duplikat emaila
            dodajPolaznika(polazniciSet, new Polaznici("Anic", "anaanic@gmail.com", "Ana"));
        } catch (IllegalArgumentException e) {
            System.out.println("Greška: " + e.getMessage());
        }

        System.out.println("Jedinstveni polaznici sortirani po prezimenu:");
        for (Polaznici p : polazniciSet) {
            System.out.println("Ime: " + p.getIme());
            System.out.println("Prezime: " + p.getPrezime());
            System.out.println("Email: " + p.getEmail());
            System.out.println("------------------------");
        }
    }

    public static void dodajPolaznika(TreeSet<Polaznici> set, Polaznici novi) {

        boolean postoji = set.stream()
                .anyMatch(p -> p.getEmail().equalsIgnoreCase(novi.getEmail()));

        if (postoji) {
            throw new IllegalArgumentException("Polaznik s emailom " + novi.getEmail() + " već postoji.");
        }

        set.add(novi);
    }
}
