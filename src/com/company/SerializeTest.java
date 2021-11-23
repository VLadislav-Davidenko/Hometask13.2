package com.company;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeTest {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("VISA", "Privat", "1234 5678 9098 6555", 123, 666);
        File fl = new File("C://Test", "card.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fl))){
            oos.writeObject(creditCard);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
