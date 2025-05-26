public class Polaznici implements Comparable<Polaznici> {

    private String ime;
    private String prezime;
    private String email;

    public Polaznici() {
    }

    public Polaznici(String prezime, String email, String ime) {
        this.prezime = prezime;
        this.email = email;
        this.ime = ime;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Polaznici polaznik = (Polaznici) obj;
        return email != null && email.equals(polaznik.email);
    }

    @Override
    public int hashCode() {
        return email != null ? email.hashCode() : 0;
    }

    @Override
    public int compareTo(Polaznici o) {
        return this.prezime.compareToIgnoreCase(o.prezime);
    }
}
