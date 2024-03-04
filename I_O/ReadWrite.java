import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

class FileHandler {
    FileWriter fout = null;
    FileReader fin = null;
    Scanner sc = new Scanner(System.in);

    public void writeFile(String fileName, String folderPath) {
        if(folderPath == null) folderPath = "";
        try {
            fout = new FileWriter(folderPath + fileName + ".txt");
            System.out.println("Enter the data you want to write into " + fileName);
            String data = sc.nextLine();

            fout.write(data);
            fout.close();
            System.out.println("\n\nFile Written Successfully...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void readFile(String fileName, String folderPath) {
        if(folderPath == null) folderPath = "";
        try {
            fin = new FileReader(folderPath + fileName + ".txt");
            //1st
            // int i=0;
            // while( (i = fin.read()) != -1) System.out.print((char)i);

            //2nd
            // Path path = Paths.get(folderPath+fileName+".txt");
            // byte[] bytes = Files.readAllBytes(path);
            // for (byte b : bytes) {
            //     System.out.print((char)b);
            // }

            //3rd
            Scanner read = new Scanner(folderPath+fileName+".txt");
            while (read.hasNextLine()) {
                String line = read.nextLine();
                System.out.println(line);
            }
            read.close();

            fin.close();
            System.out.println("\n\nEnd of File...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class ReadWrite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileHandler fh = new FileHandler();
        String fileName = "";
        int choice;
        do {
            System.out.println("1. Write into a file");
            System.out.println("2. Read from the file");
            System.out.println("0: Exit");

            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the name of the file: ");
                    fileName = sc.next();
                    fh.writeFile(fileName, null);
                    break;

                case 2:
                    System.out.println("Enter the name of the file: ");
                    fileName = sc.next();
                    fh.readFile(fileName, null);
                    break;

                case 0:
                    System.out.println("Exiting the Program...");
                    break;
            
                default:
                    System.out.println("Invalid choice, Please try again!");
                    break;
            }
        } while (choice != 0);
        sc.close();
    }
}
