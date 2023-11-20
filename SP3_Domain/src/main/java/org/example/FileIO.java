package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO implements Data {
    public ArrayList<String> fileIO(String path) {
        ArrayList<String> data = new ArrayList<>();
        File file = new File(path);

        try {
            Scanner scan = new Scanner(file);
            scan.nextLine();
            while(scan.hasNextLine()){
                String s = scan.nextLine();
                data.add(s);

            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
        return data;
    }

    public void movieData(ArrayList<Media> media){
    try{
        File file = new file()

    } catch (Exception e) {

    }

    }
}
