package projetstrings;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FrameString {
    private JPanel monPanel;
    private JTextArea champString;
    private JButton boutonResultats;
    private JTextField champMot;
    private JPanel panelOccurences;
    private JLabel reponse1;
    private JLabel reponse3;
    private JLabel reponse2;
    private JLabel reponse4;
    private JLabel reponse5;
    private JLabel reponse6;

    public static void main(String[] args) {
        JFrame frame = new JFrame("FrameString");
        frame.setContentPane(new FrameString().monPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1100, 600);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
	
    public FrameString()
    {
        Ecouteur ec = new Ecouteur ();
        boutonResultats.addActionListener(ec);
    }

    private class Ecouteur implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            //contenu du champ texte
            String texte = champString.getText();

            // codez ici question 1 ( caractère à l'indice 8 )

            String q1;
            if (texte.length() >= 9) {
                q1 = String.valueOf(texte.charAt(8));
            } else {
                q1 = "Pas asser long";
            }

            reponse1.setText(q1);
            // codez ici question 2 ( indice du premier e )
            int q2 = texte.indexOf('e');
            if (q2 == -1) {
                reponse2.setText("Pas de e");
            } else {
                reponse2.setText(String.valueOf(q2));
            }
            // codez ici question 3 ( indice du dernier e )
            int q3 = texte.lastIndexOf('e');
            String rep;
            if (q3 == -1) {
                rep = "Pas de e";
            } else {
               rep = String.valueOf(q3);
            }
            reponse3.setText(rep);

            // codez ici question 4 ( nombre de caractères de la phrase )
            int q4 = texte.length();
            reponse4.setText(String.valueOf(q4));

            // codez ici question 5 ( commence par une majuscule ) ( chercher dans classe Character )
            boolean q5 = Character.isUpperCase(texte.charAt(0));
            reponse5.setText(String.valueOf(q5));

            // codez ici question 6 ( nombre d'occurences d'un mot )
            Pattern patern = Pattern.compile(champMot.getText());
            Matcher matcher = patern.matcher(texte);
            int nbOccurence = 0;

            for (int i = 0; i < texte.length(); ++i) {
                if (matcher.find()) {
                    nbOccurence++;
                }
            }
            reponse6.setText(String.valueOf(nbOccurence));

//            int q6 = 0;
//            int longeurTexte = texte.length();
//            String motRechere = champMot.getText();
//            int longuerMot = motRechere.length();
//
//            for(int i = 0; i <= (longeurTexte - longuerMot); i++){
//                if (texte.substring(i, i+ longuerMot).equals(motRechere)){
//                    q6++;
//                }
//            }


        }
    }
}



