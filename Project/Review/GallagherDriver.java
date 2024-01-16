package Project.Review;

import java.io.*;
import java.util.*;

public class GallagherDriver {
    public static void main(String[] args) {

        ArrayList<Arena> arenas = new ArrayList<>();

        File file = new File("C:\\Users\\John\\Documents\\GitHub\\GitRepositories\\CSC258\\Project\\Review\\IndoorArenas.txt");

        try {
            Scanner scnr = new Scanner(file);

            while (scnr.hasNextLine()) {
                System.out.println(scnr.nextLine());
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }             

    }    
}
