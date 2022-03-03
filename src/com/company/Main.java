package com.company;

public class Main {

    public static void main(String[] args) {
        Contact contact1 = new Contact("Rick Astly", "RickRoll@gmail.com");
        BuisnessContact buisnessMan = new BuisnessContact("Jim", "Jim@gmail.com", "614-867-5309");

        contact1.display();
        buisnessMan.display();




    }
}
