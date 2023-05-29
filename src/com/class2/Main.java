package com.class2;

public class Main {
    public static void main(String[] args) {
        try {
            JSONManagement jsonManagement = new JSONManagement();
        /*    jsonManagement.readJSON();*/
            /*jsonManagement.readJSONsample();*/
          jsonManagement.readJSONPerson();


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
