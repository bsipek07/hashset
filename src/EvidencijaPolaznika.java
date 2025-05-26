import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class EvidencijaPolaznika {

    public static void main(String[] args){
        HashSet<Polaznici> polazniciSet = new HashSet<>();
        Polaznici p1 = new Polaznici("Markic","marko.markic@gmail.com","Marko");
        Polaznici p2 = new Polaznici("Ivic","ivanivic@gmail.com","Ivan");
        Polaznici p3 = new Polaznici("Ivic","ivanivic@gmail.com","Ivan");
        Polaznici p4 = new Polaznici("Anic","anaanic@gmail.com","Ana");

        boolean dodano = polazniciSet.add(p1); // true
        dodano = polazniciSet.add(p2);
        dodano = polazniciSet.add(p3);
        dodano = polazniciSet.add(p4);

        // 1. Pretvori HashSet u Listu
        List<Polaznici> polazniciLista = new ArrayList<>(polazniciSet);

// 2. Sortiraj po prezimenu uzlazno (ascending)
        polazniciLista.sort((p1, p2) -> p1.getPrezime().compareToIgnoreCase(p2.getPrezime()));



        System.out.println("Jedinstveni polaznici:");
        for (Polaznici p : polazniciLista) {
            System.out.println("Ime: " + p.getIme());
            System.out.println("Prezime: " + p.getPrezime());
            System.out.println("Email: " + p.getEmail());
            System.out.println("------------------------");
        }

        System.out.println("Broj jedinstvenih polaznika: " + polazniciSet.size());

    }
}
