import java.util.ArrayList;
import java.util.List;

public class Marche {
    private String nom;
    private List<Arme> lesArmesAVendre;
    private List<Armure> lesArmuresAVendre;


    public Marche(String nom, List<Arme> lesArmesAVendre, List<Armure> lesArmuresAVendre){
        this.nom = nom;
        this.lesArmesAVendre = lesArmesAVendre;
        this.lesArmuresAVendre = lesArmuresAVendre ;

    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public List<Arme> getLesArmesAVendre() {
        return lesArmesAVendre;
    }


    public void setLesArmesAVendre(List<Arme> lesArmesAVendre) {
        this.lesArmesAVendre = lesArmesAVendre;
    }



    public List<Armure> getLesArmuresAVendre() {
        return lesArmuresAVendre ;
    }


    public void setLesArmuresAVendre(List<Armure> lesArmuresAVendre) {
        this.lesArmuresAVendre = lesArmuresAVendre ;
    }


    public Arme acheterArme(int indexArme) {
        if (indexArme >= 0 && indexArme < lesArmesAVendre.size()) {
            Arme armeAchetee = lesArmesAVendre.get(indexArme);
            lesArmesAVendre.remove(indexArme);
            return armeAchetee;
        }
        return null;
    }

    public Armure acheterArmure(int indexArmure) {
        if (indexArmure >= 0 && indexArmure < lesArmuresAVendre.size()) {
            Armure armureAchetee = lesArmuresAVendre.get(indexArmure);
            lesArmuresAVendre.remove(indexArmure); // Correction ici !
            return armureAchetee;
        }
        return null;
    }



}
