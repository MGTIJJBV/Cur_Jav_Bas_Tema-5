package com.tema5.implementations;

import com.tema5.interfaces.CocheCRUD;

public class CocheCRUDImpl implements CocheCRUD {


    @Override
    public void save() {
        System.out.println("Este metodo es save");
    }

    @Override
    public void findAll() {
        System.out.println("Este metodo es findAll");
    }

    @Override
    public void delete() {
        System.out.println("Este metodo es delete");
    }
}
