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

        polazniciSet.add(p1);
        polazniciSet.add(p2);
        polazniciSet.add(p3);
        polazniciSet.add(p4);


        List<Polaznici> polazniciLista = new ArrayList<>(polazniciSet);


       polazniciLista.sort((p1,p2) -> p1.getPrezime().compareToIgnoreCase(p2.getPrezime()));



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
