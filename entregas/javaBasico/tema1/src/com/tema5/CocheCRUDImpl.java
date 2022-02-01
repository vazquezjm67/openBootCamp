package com.tema5;

public class CocheCRUDImpl implements CocheCRUD {


    @Override
    public void save(Coche coche) {
        System.out.println("save");
    }

    @Override
    public void findALL() {
        System.out.println("findALL");
    }

    @Override
    public void delete(Coche coche) {
        System.out.println("delete");
    }
}
