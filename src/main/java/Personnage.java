import java.util.Random;

public class Personnage {
    private String nom;
    private int pv;
    private int or;
    private int niveau;
    private Arme arme;
    private Armure armure;


    public Personnage(String nom, int pv, int or, int niveau, Arme arme, Armure armure) {
        this.nom = nom;
        this.pv = pv;
        this.or = or;
        this.niveau = niveau;
        this.arme = arme;
        this.armure = armure;
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

    public int getNiveau() {
        return this.niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
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

    //Méthode1-a
    public int attaquer() {
            return this.arme.getAtk();
    }

    //Méthode1-b
    public int getDefense() {
            return this.armure.getDef();
    }

    //Méthode1-c
    public void prendreDegats(int quantiteDegats) {
        this.pv = this.pv - quantiteDegats;

        if (this.pv < 0) {
            this.pv = 0;
        }
    }

    //Méthode1-d
    public boolean estVivant() {
        if (this.pv > 0) {
            return true;
        } else {
            return false;
        }
    }


    //Méthode1-e
    public int fuite() {
        Random rand = new Random();
        int fuite = rand.nextInt(101);
        fuite = fuite - this.armure.getPoids();
        if (fuite < 0) {
            return 0;
        } else {
            return fuite;
        }
    }




}
