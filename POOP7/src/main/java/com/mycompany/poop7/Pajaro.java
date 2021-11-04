/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poo.poop7;

/**
 *
 * @author Barragan
 */
public class Pajaro extends AnimalAereo{
    private String tipoPico;

    public Pajaro() {
    }

    public Pajaro(String tipoPico) {
        this.tipoPico = tipoPico;
    }

    public Pajaro(int numeroAlas, String tipoPico) {
        super(numeroAlas);
        this.tipoPico = tipoPico;
    }

    public Pajaro(String nombre, String lugarOrigen, String color, int numeroAlas, String tipoPico) {
        super(nombre, lugarOrigen, color, numeroAlas);
        this.tipoPico = tipoPico;
    }
    
    public String getTipoPico() {
        return tipoPico;
    }

    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }
    
    public void recolectarRamas(){
        System.out.println("El pajaro ha recolectado ramas para su nido");
    }

    @Override
    public String toString() {
        return super.toString() +" "+
                "Pajaro{" + "tipoPico=" + tipoPico + '}';
    }
    
    
}
