package assessment;

import javax.swing.JOptionPane;

public class TestAlbum {

    public static void main(String[] args) {
        String str="", albumStr="";

        Song s1 = new Song();
        System.out.println("Calling the no argument constructor...");
        str+=s1.toString();

        Song s2 = new Song(1, 1, "Sugar Baby Love", "Rubettes", "Pop", 136, 1977);
        System.out.println("Calling the multi argument constructor...");

        str+=s2.toString();

        Album a1 = new Album("Cool Mix", "Universal Music", 2016, s2);
        albumStr+=a1.toString();

   //     String choiceAsString;
   //     int choice;
    //   choiceAsString = JOptionPane.showInputDialog("Which track would you like to play?");
      //  JOptionPane.showMessageDialog(null, a1.playTrack(choiceAsString));

        //testing song constructor
        JOptionPane.showMessageDialog(null,str,"Data", JOptionPane.INFORMATION_MESSAGE);


        //album constructor
        JOptionPane.showMessageDialog(null, albumStr, "Album Info", JOptionPane.PLAIN_MESSAGE);




    }

}
