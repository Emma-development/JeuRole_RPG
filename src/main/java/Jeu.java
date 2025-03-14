import java.sql.SQLOutput;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Jeu {
    private Personnage lePersonnage ;
    private List<Monstre> lesMonstres;
    private List<Marche> lesMarches ;

    public Jeu (Personnage lePersonnage, List<Monstre> lesMonstres, List<Marche> lesMarches){
        this.lePersonnage = lePersonnage ;
        this.lesMonstres = lesMonstres ;
        this.lesMarches = lesMarches ;
    }

    public Personnage getlePersonnage(){
        return this.lePersonnage ;
    }

    public void setLePersonnage(Personnage lePersonnage) {
        this.lePersonnage = lePersonnage;
    }

    public List<Monstre> getLesMonstres() {
        return this.lesMonstres;
    }

    public void setLesMonstres(List<Monstre> lesMonstres) {
        this.lesMonstres = lesMonstres;
    }

    public List<Marche> getLesMarches() {
        return lesMarches;
    }

    public void setLesMarches(List<Marche> lesMarches) {
        this.lesMarches = lesMarches;
    }

    //Methode 6-a
    public void creerPersonnage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez le nom de votre personnage :");
        String nom = scanner.nextLine();
        this.lePersonnage = new Personnage(nom, 100, 20, 0, null, null) ;
    }


    //Methode 6-b
    public Monstre monstreAleatoire() {
        Random rand = new Random() ;
        int index = rand.nextInt(lesMonstres.size());
        return lesMonstres.get(index);
    }

    //Methode 6-c
    public boolean fuite(int seuilFuite){
        int resultat = lePersonnage.fuite();
        if(resultat >= seuilFuite){
            return true ;
        }
        else {
            return false ;
        }
    }

    //Methode 6-d
    public void combat(){
        Monstre monstre = monstreAleatoire();
        Scanner scanner = new Scanner(System.in) ;

        while(lePersonnage.getPv() > 0 && monstre.getPv() > 0){
            System.out.println("Voulez-vous fuir (1) ou attaquer (2) ?");
            int choix = scanner.nextInt();

            if(choix == 1) {
                int resultat = lePersonnage.fuite() ;
                if(resultat >= monstre.getSeuilFuite()){
                    System.out.println("Bravo ! vous vous etes enfuis");
                    return ;
                }
                else {
                    System.out.println("Dommage ! Vous n'avez pas reussi à vous enfuir");
                    int degats = monstre.attaquer() - lePersonnage.getDefense() ;
                    if (degats < 0) {
                        degats = 0;
                    }
                    lePersonnage.setPv(lePersonnage.getPv() - degats);
                    System.out.println("Le monstre vous a inflige " + degats + " degats");
                }
            }
            else if(choix == 2) {
                int degats = lePersonnage.attaquer() - monstre.getDefense();
                if (degats < 0) {
                    degats = 0;

                }
                monstre.setPv(monstre.getPv() - degats);
                System.out.println("Vous avez inflige " + degats + " degats au monstre");
                if(monstre.getPv() <= 0){
                    System.out.println("Bien joue ! Vous avez tue le monstre");
                    lePersonnage.setNiveau(lePersonnage.getNiveau() + 1);
                    lePersonnage.setOr(lePersonnage.getOr() + monstre.getOr());
                }
            }
            if(monstre.estVivant()){
                int degats = monstre.attaquer() - lePersonnage.getDefense();
                if (degats < 0) {
                    degats = 0;
                }
                lePersonnage.setPv((lePersonnage.getPv()) - degats);
                System.out.println("Le monstre vous a inflige " + degats + " degats");
                if(lePersonnage.getPv() <= 0){
                    System.out.println("Dommage ! Vous avez ete tue par le monstre");
                    return ;
                }
            }
        }
    }

    //Methode 6-e
    public Marche marcheAleatoire(){
        Random rand = new Random();
        int index = rand.nextInt(lesMarches.size()) ;
        return lesMarches.get(index) ;
    }

    //Methode 6-f
    public void achat(){
        Scanner scanner = new Scanner(System.in);
        Marche marche = marcheAleatoire();
        System.out.println("Vous etes sur le marche " + marche.getNom());


        int choix = scanner.nextInt();
        while (choix != 0) {
            System.out.println("Que souhaitez-vous acheter : Arme(1), Armure(2) ou Quitter(0)");
            List<Arme> armes = marche.getLesArmesAVendre();
            List<Armure> armures = marche.getLesArmuresAVendre();

            if(choix == 0 ){
                System.out.println("Vous avez quitte le marché.");
                break;
            }
            if (choix == 1) {
                for (int i = 0; i < armes.size(); i++) {
                    Arme arme = armes.get(i);
                    System.out.println(i + " : " + arme.getNom() + " | Prix: " + arme.getPrix() + " | ATK: " + arme.getAtk());
                }
            }

            else if (choix == 2) {
                for (int i = 0; i < armures.size(); i++) {
                    Armure armure = armures.get(i);
                    System.out.println(i + " : " + armure.getNom() + " | Prix: " + armure.getPrix() + " | Poids: " + armure.getPoids());
                }
            }

            int choixObjet = scanner.nextInt();
            if (choix == 1) {
                System.out.println("Entrez le numero de l'arme que vous souhaitez acheter :");
                Arme armeAchetee = armes.get(choixObjet);
                lePersonnage.setOr((int) (lePersonnage.getOr() - armeAchetee.getPrix()));
                System.out.println("Vous avez acheté : " + armeAchetee.getNom());


            } else if (choix == 2) {
                System.out.println("Entrez le numero de l'armure que vous souhaitez acheter :");
                Armure armureAchetee = armures.get(choixObjet);
                lePersonnage.setOr((int) (lePersonnage.getOr() - armureAchetee.getPrix()));
                System.out.println("Vous avez acheté : " + armureAchetee.getNom());
            }
        }
    }

    //Methode 6-g

    public void rencontreAleatoire(){
        Random rand = new Random() ;
        int rencontreAleatoire = rand.nextInt(2);
        if(rencontreAleatoire == 0){
            combat();
        }
        else if(rencontreAleatoire == 1){
            achat();
        }
    }


    //Methode 6-h

    public void jouer() {
        Scanner scanner = new Scanner(System.in);
        while (lePersonnage.getNiveau() < 10 && lePersonnage.getPv() > 0) {
            rencontreAleatoire() ;
        }
        if (lePersonnage.getNiveau() >= 10) {
            System.out.println("Bravo ! Vous avez atteint le niveau 10");
            return ;
        }
        else if (lePersonnage.getPv() <= 0) {
            System.out.println("Vous etes mort, la partie est terminee ");
            return ;
        }
        System.out.println("Voulez-vous continuer à jouer ? oui (1) ou non (0)");
        int choix = scanner.nextInt();

        if (choix == 0) {
            System.out.println("Vous avez choisi d'arrêter le jeu");

        }
        else if(choix == 1){
            System.out.println("Vous avez choisi de continuer le jeu. Partie suivante");
        }
    }




}








