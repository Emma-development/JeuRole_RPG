 public class Arme {
        private String nom ;
        private int atk ;
        private double prix ;


        public Arme (String nom, int atk, double prix){
            this.nom = nom ;
            this.atk = atk ;
            this.prix = prix ;
        }

        public String getNom(){
            return this.nom ;
        }

        public void setNom(String nom){
            this.nom = nom ;
        }

        public int getAtk(){
            return this.atk ;
        }

        public void setAtk(int atk){
            this.atk = atk ;
        }

        public double getPrix(){
            return this.prix ;
        }

        public void setPrix(double prix){
            this.prix = prix ;
        }
}


