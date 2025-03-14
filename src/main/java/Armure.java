public class Armure {
    private String nom ;
    private int def ;
    private int poids ;
    private double prix ;


    public Armure (String nom, int def, int poids, double prix){
        this.nom = nom ;
        this.def = def ;
        this.poids = poids ;
        this.prix = prix ;
    }

    public String getNom(){
        return this.nom ;
    }

    public void setNom(String nom){
        this.nom = nom ;
    }

    public int getDef(){
        return this.def ;
    }

    public void setDef(int def){
        this.def = def ;
    }

    public int getPoids(){
        return this.poids ;
    }

    public void setPoids(int poids){
        this.poids = poids ;
    }

    public double getPrix(){
        return this.prix ;
    }

    public void setPrix(double prix){
        this.prix = prix ;
    }
}
