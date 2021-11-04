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
public class AnimalTerrestre extends Animal {
    private int numPatas;

    public AnimalTerrestre() {
    }

    public AnimalTerrestre(int numPatas) {
        this.numPatas = numPatas;
    }

    public AnimalTerrestre(String nombre, String lugarOrigen, String color, int numPatas) {
        super(nombre, lugarOrigen, color);
        this.numPatas = numPatas;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public void correr(){
            System.out.println("El " + this.getNombre() + " corre hacia el norte.");
}
    @Override
    public void comer(){
        System.out.println("El "+ this.getNombre()+ " come plantas o carne.");
    }
    
    @Override
    public String toString() {
        return super.toString() + " "+
                "AnimalTerrestre{" + "numPatas=" + numPatas + '}';
    }
    
    
    
    
}
