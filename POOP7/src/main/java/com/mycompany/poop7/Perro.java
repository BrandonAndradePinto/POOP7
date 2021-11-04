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
public class Perro extends AnimalTerrestre {
    private String colorCollar;

    public Perro(String colorCollar) {
        this.colorCollar = colorCollar;
    }

    public Perro(String nombre, String lugarOrigen, String color, int numPatas, String colorCollar) {
        super(nombre, lugarOrigen, color, numPatas);
        this.colorCollar = colorCollar;
    }

    public String getColorCollar() {
        return colorCollar;
    }

    public void setColorCollar(String colorCollar) {
        this.colorCollar = colorCollar;
    }
    
    public void hacerTruco(){
        System.out.println("El perro ha dado una voltereta.");
    }

    @Override
    public String toString() {
        return super.toString() + " " +
                "Perro{" + "colorCollar=" + colorCollar + '}';
    }
    
    
}
