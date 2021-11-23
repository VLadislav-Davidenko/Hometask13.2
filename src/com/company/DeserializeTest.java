package com.company;

import java.io.*;

public class DeserializeTest {
    public static void main(String[] args) {
        File fl = new File("C://Test", "card.ser");
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fl))){
            Object o = ois.readObject();
            if( o instanceof CreditCard){
                String s = o.toString();
                System.out.println(s);
            }
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}

