

public class BaseEx6Operation {

    //	• 6.1 : Réaliser une classe Operation qui regroupe les méthodes Add, Sub, Mul et Div
    //	permettant de réaliser les opérations basiques telles que :
    //	→ System.out.println(add(5,2)); va afficher 7
    //	→ System.out.println(sub(5,2)); va afficher 3
    //	→ Comment gérez vous le cas suivant : 
    //	System.out.println(div(3,0)); 
        
        public static void main(String[] args) {
            
            int[] numbers = {5, 2};
            int sumIt = 0;
        
    //addition
            for(int i =0; i < numbers.length; i++) {
            sumIt = sumIt + numbers[i];
            System.out.println("La somme est : " + sumIt );
    //soustraction
                int subIt = numbers[0] - numbers[1];
                System.out.println("La soustraction est : " + subIt );
    //multiplication
            int xIt = numbers[0] * numbers[1];
            System.out.println("La multiplication est : " + xIt );
    //division
            int[] newNumbers = {3, 0};
            int divIt = 0;
            
            for(int number : newNumbers) {
                if (newNumbers[1] != 0) { 
                    divIt = newNumbers[0] / newNumbers[1];
                    System.out.println("La division est : " + divIt );
                } else {
                        System.out.println("Un nombre ne peut pas être divisé par 0" );
                    }
                }
            }
        }
    }
    
    