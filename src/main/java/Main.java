import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //arme + armure de base
        Arme poing = new Arme("Poing", 1, 0);
        Armure habits = new Armure("Habits", 1, 0, 10);

        //arme + armure supplementaire
        Arme epee = new Arme("Épée", 30, 60);
        Arme arc = new Arme("Arc", 25, 80);
        Arme griffe = new Arme("Griffe", 15, 0);
        Armure armureDeChevalier = new Armure("Armure de chevalier", 15, 10, 150);
        Armure bouclier = new Armure("Bouclier", 5, 5, 30);

        //personnage
        Personnage lePersonnage = new Personnage("perso", 100, 50,2, poing, habits);

        //monstres
        Monstre dragon = new Monstre("Dragon", 100, 10, 3,
                new Arme("Griffe", 15, 0),
                new Armure("Bouclier", 5, 5, 30), 50, 20
        );
        Monstre Loup = new Monstre("Loup", 100, 25, 3,
                new Arme("Griffe", 15, 0),
                new Armure("null", 5, 5, 30), 50, 20
        );



        //methode 3-a
        /*Arme poing = new Arme("poing", 10, 5);
        Personnage lePersonnage = new Personnage("perso", 100, 50, 1, poing, null);
        System.out.println("Attaque du personnage : " + lePersonnage.attaquer());*/


        //methode 3-b
        /*Armure armure = new Armure("Habit", 5, 3, 10);
        Personnage lePersonnage = new Personnage("perso", 100, 50, 1, null, armure);
        System.out.println("Défense du personnage : " + lePersonnage.getDefense());*/


        //methode 3-c

        /*Personnage lePersonnage = new Personnage("perso", 100, 50, 1, null, null);
        System.out.println("PV avant degats : " + lePersonnage.getPv());
        lePersonnage.prendreDegats(20);
        System.out.println("PV apres degats : " + lePersonnage.getPv());*/


        //methode 3-d
        /*Personnage lePersonnage = new Personnage("perso", 50, 50, 1, null, null);
        System.out.println("lePersonnage est vivant ? " + lePersonnage.estVivant());
        Monstre leMonstre = new Monstre("monstre", 0, 50, 1, null, null, 0, 0);
        System.out.println("leMonstre est vivant ? " + leMonstre.estVivant());*/


        //methode 6-a
        /*Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom de votre personnage : ");
        String nom = scanner.nextLine();
        Personnage personnage = new Personnage(nom, 100, 35, 1, new Arme("Epee", 25, 80), new Armure("Armure de chevalier", 15, 10, 150));
        System.out.println("Nom : " + personnage.getNom());
        System.out.println("PV : " + personnage.getPv());
        System.out.println("Or : " + personnage.getOr());
        System.out.println("Niveau : " + personnage.getNiveau());
        System.out.println("Arme : " + personnage.getArme().getNom());
        System.out.println("Armure : " + personnage.getArmure().getNom());*/

    }
}