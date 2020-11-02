package assessment;

import javax.swing.JOptionPane;

public class TestAlbum {

    public static void main(String[] args) {
        String str="";

        Song s1 = new Song();
        System.out.println("Calling the no argument constructor...");
        str+=s1.toString();



        JOptionPane.showMessageDialog(null,str,"Data", JOptionPane.INFORMATION_MESSAGE);



    }

}
