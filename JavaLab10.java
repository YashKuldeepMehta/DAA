import java.io.*;
import java.util.*;

class WriteThread extends Thread {
    public void run() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            FileWriter fw = new FileWriter("students.txt", true);
            fw.write(id + "," + name + "," + age + "\n");
            fw.close();

            System.out.println("Record saved!");

        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}

class ReadThread extends Thread {
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("students.txt"));
            String line;

            System.out.println("\n--- Student Records ---");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Error reading file!");
        }
    }
}

public class JavaLab10 {
    public static void main(String[] args) {
        try {
            WriteThread t1 = new WriteThread();
            ReadThread t2 = new ReadThread();

            t1.start();
            t1.join(); 

            t2.start();
            t2.join();

        } catch (InterruptedException e) {
            System.out.println("Thread interrupted!");
        }
    }
}