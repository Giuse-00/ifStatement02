package it.develhope.ifStatement02;

public class Surname {

    public static void main(String[] args) {

        String mySurname = "Iacono";

        String niInMyName = mySurname.contains("ni") ?
                "Your surname contains the sequence of letters NI" :
                "Your surname doesn't contain the sequence of letters NI";

        System.out.println(niInMyName);
    }
}
