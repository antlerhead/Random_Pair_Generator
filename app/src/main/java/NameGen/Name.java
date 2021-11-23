package NameGen;

import java.util.Random;

public class Name {
    public static void main(String[] args) {
        // create an array
        String[] name = {"Raul", "Jack", "Rumen", "Max"};

        // for each loop
//        for (String names : name) {
//            System.out.println(names);

//        for(int i=0; i< name.length; i++){
//            System.out.println(name[i]);

        Random r  = new Random();
        int i = r.nextInt(name.length);
        System.out.println(name[i]);
        int ii = r.nextInt(name.length);
        System.out.println(name[ii]);
        }

    }

