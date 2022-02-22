import java.io.*;
import java.util.*;

public class Example3 {
    public static void main(String[] args) {
        // this works
        try {
            System.out.println("in the try");
        } finally {
            System.out.println("finally");
        }

        // println can never throw an IOException and thus will be a CE
        // try {
        // System.out.println("in the try");
        // } catch (IOException e) {
        // // TODO: handle exception
        // e.printStackTrace();
        // } finally {
        // System.out.println("finally");
        // }

        try {
            System.out.println("in the try");
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }

        // Since it will always be caught at IOException, this will CE as
        // FileNotFoundException is lower than IOException
        try {
            Scanner sc = new Scanner(new File("test.txt"));
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
