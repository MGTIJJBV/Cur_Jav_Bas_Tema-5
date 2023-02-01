package com.tema5;

import com.tema5.implementations.CocheCRUDImpl;
import com.tema5.interfaces.CocheCRUD;

public class Main {

    static CocheCRUD cocheCRUD = new CocheCRUDImpl();
    public static void main(String[] args) {
        cocheCRUD.save();
        cocheCRUD.findAll();
        cocheCRUD.delete();
    }
}