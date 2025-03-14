public class Monstre {
    private String nom;
    private int pv;
    private int or;
    private Arme arme;
    private Armure armure;
    private int loot;
    private int seuilFuite;


    public Monstre(String nom, int pv, int or, int niveau, Arme arme, Armure armure, int loot, int seuilFuite) {
        this.nom = nom;
        this.pv = pv;
        this.or = or;
        this.arme = arme;
        this.armure = armure;
        this.loot = loot;
        this.seuilFuite = seuilFuite;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public int getPv() {
        return this.pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }


    public int getOr() {
        return this.or;
    }

    public void setOr(int or) {
        this.or = or;
    }


    public Arme getArme() {
        return this.arme;
    }

    public void setArme(Arme arme) {
        this.arme = arme;
    }


    public Armure getArmure() {
        return this.armure;
    }

    public void setArmure(Armure armure) {
        this.armure = armure;
    }


    public int getLoot(){
        return this.loot;
    }

    public void setLoot(int loot){
        this.loot = loot;
    }


    public int getSeuilFuite(){
        return this.seuilFuite;
    }

    public void setSeuilFuite(int seuilFuite){
        this.seuilFuite = seuilFuite;
    }

    //Méthode2-a
    public int attaquer() {
            return this.arme.getAtk();
    }

    //Méthode2-b
    public int getDefense() {
            return this.armure.getDef();
    }

    //Méthode2-c
    public void prendreDegats(int quantiteDegats) {
        this.pv -= quantiteDegats;
        if (this.pv < 0) {
            this.pv = 0;
        }
    }

    //Méthode2-d
    public boolean estVivant() {
        if (this.pv > 0) {
            return true;
        } else {
            return false;
        }
    }
}