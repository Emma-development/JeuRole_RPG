public class Main {
    public static void main(String[] args) {

        //arme + armure de base
        Arme poing = new Arme("Poing", 1, 0);
        Armure habits = new Armure("Habits", 1, 0, 10);

        //arme + armure supplementaire
        Arme epee = new Arme("Épée", 30, 50);
        Arme arc = new Arme("Arc", 25, 80);
        Arme griffe = new Arme("Griffe", 25, 0);
        Armure armureDeChevalier = new Armure("Armure de chevalier", 15, 10, 150);
        Armure bouclier = new Armure("Bouclier", 5, 4, 30);

        //personnage
        Personnage lePersonnage = new Personnage("perso", 100, 50,2, poing, habits);

        //monstres
        Monstre dragon = new Monstre("Dragon", 100, 10, 5,
                new Arme("Griffe", 25, 0),
                new Armure("Bouclier", 5, 4, 30), 50, 20
        );
        Monstre Loup = new Monstre("Loup", 100, 10, 5,
                new Arme("Griffe", 25, 0),
                new Armure("null", 5, 4, 30), 50, 20
        );

        /*//marches
        Marche marche = new Marche("Arènes");
        marche.ajouterArme(epee);
        marche.ajouterArme(arc);
        marche.ajouterArmure(bouclier);
        marche.ajouterArmure(casque);*/







        //methode 3-a
        /*Arme poing = new Arme("poing", 10, 5); // ATK = 10
        Personnage lePersonnage = new Personnage("perso", 100, 50, 1, poing, null);
        System.out.println("Attaque du joueur : " + lePersonnage.attaquer());*/


        //methode 3-b
        /*Armure armure = new Armure("Habit", 5, 3, 10);
        Personnage lePersonnage = new Personnage("perso", 100, 50, 1, null, armure);
        System.out.println("Défense du joueur : " + lePersonnage.getDefense());*/

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


        //methode 3-e

        /*Armure armure = new Armure("Habit", 10, 30, 10);
        Personnage lePersonnage3 = new Personnage("perso", 100, 50, 1, null, armure);

        for (int i = 0; i < 3; i++) {
            System.out.println("Chance de fuite : " + lePersonnage3.fuite());
        }*/

        /*Marche marche = new Marche(null);
        marche.acheterArme()Arme(new Arme("Épée", 20, 100));
        marche.acheterArme(new Arme("Hache", 25, 150));

        System.out.println("Armes avant achat : " + marche.getLesArmesAVendre().size()); // 2

        // Achat d'une arme
        Arme armeAchetee = marche.acheterArme(0);
        System.out.println("Arme achetée : " + armeAchetee.getNom()); // Épée

        System.out.println("Armes après achat : " + marche.getLesArmesAVendre().size());*/


    }
}

