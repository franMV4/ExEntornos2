package com.SanValero;

public class Menu {

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public Menu(String ingredientes, String alergias) {
        this.ingredientes = ingredientes;
        this.alergias = alergias;
    }

    private String ingredientes;
    private String alergias;

}
