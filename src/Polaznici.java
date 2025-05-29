public class Polaznici {

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

}
