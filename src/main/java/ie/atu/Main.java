/*package ie.atu;

import java.io.File;
import java.io.IOExeption;

    public class Main {
        public static void main(String[] args) {
            //Specify file name
            String fileName = "File13.txt";

            // Create a file object
            File myFile = new File(fileName);

            try {
                //Create a new file on the disk
                if (myFile.createNewFile()) {
                    System.out.println("File created successfully at " + myFile.getAbsolutePath());
                } else {
                    System.out.println("File already exists at " + myFile.getAbsolutePath());
                }
            } catch (IOExeption e) {
                System.out.println("Error occured while creating the file.");
                e.printStackTrace();
            }
        }
    }
*/