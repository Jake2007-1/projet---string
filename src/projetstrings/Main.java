package projetstrings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //contenu du champ texte
        String texte;
        texte = "exemple jacob exemple 4 exmp exemple";

        // codez ici question 1 ( caractère à l'indice 8 )

        System.out.println(texte.charAt(8));
        // codez ici question 2 ( indice du premier e )

        System.out.println(texte.indexOf('e'));
        // codez ici question 3 ( indice du dernier e )

        System.out.println(texte.lastIndexOf('e'));
        // codez ici question 4 ( nombre de caractères de la phrase )
        System.out.println(texte.length());

        // codez ici question 5 ( commence par une majuscule ) ( chercher dans classe Character )
        System.out.println(Character.isUpperCase(texte.charAt(0)));

        // codez ici question 6 ( nombre d'occurences d'un mot )
        Pattern patern = Pattern.compile("exemple");
        Matcher matcher = patern.matcher(texte);
        boolean matchFound;
        int nbOccurence = 0;

        for (int i = 0; i < texte.length(); ++i) {
            if (matcher.find()) {
                nbOccurence++;
            }
        }
        System.out.println(nbOccurence);
    }

}
