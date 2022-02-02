public class Montre {
    int heure ;
    int minute;
    Personne personne;

    public Montre(int heure , int minute){

        if (heure > 23 || minute > 59){
            this.heure = 00;
            this.minute= 00;
        }else {
            this.heure = heure;
            this.minute= minute;
        }
    }

    public Montre(Montre montre){
        this.heure = montre.heure;
        this.minute = montre.minute;
    }

    public void ajouterTemps(){
        if (minute < 59){
            minute = minute + 1;
        }else {
            if (heure < 23){
                heure = heure + 1;
                minute = 0;git init
            }else {
                heure = 00;
                minute = 00;
            }
        }
    }

    public String afficheHeure(){
        return heure + " h " + minute + " m";
    }

    }

        public  static void main (String[] args){
        Montre montre = new Montre(00 , 00);
        montre.ajouterTemps();
        System.out.println(montre.heure + " h " + montre.minute + " m");
    }
}
    public void creeAffiche(){
        Montre montre1 = new Montre(9 , 25);
        Montre montre2 = new Montre(montre1);
        System.out.println(montre1.heure + " h " + montre1.minute + " m");
    }

    public int getHeure() {
        return heure;
    }

    public void setHeure(int heure) {
        this.heure = heure;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
}