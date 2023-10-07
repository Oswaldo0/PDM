package com.example.recyclerview.models;

import  androidx.annotation.NonNull;

public class Persona {
    private int idPersona;
    private String nombrePersona;
    private int edadPersona;

    public Persona(){
        this.edadPersona = 0;
        this.edadPersona= 0;
        this.nombrePersona = "";
    }
    public Persona(int idPersona, String nombrePersona, int edadPersona){
        this.idPersona = idPersona;
        this.nombrePersona = nombrePersona;
        this.edadPersona = edadPersona;
    }

    public  int getIdPersona(){
        return idPersona;
    }
    public void setIdPersona(int idPersona){
        this.idPersona = idPersona;
    }

    public String getmombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public int getEdadPersona() {
        return edadPersona;
    }

    public void setEdadPersona(int edadPersona) {
        this.edadPersona = edadPersona;
    }

    @NonNull
    @Override
    public  String toString(){
        return idPersona + nombrePersona + edadPersona;
    }
}
