package com.mycompany.poop7;

/**
 *
 * @author brandon
 */
public class Main {
    public static void main(String[] args) {
        Empleado emp = new Empleado();
        System.out.println(emp);
        
        Gerente ger = new Gerente();
        System.out.println(ger);
        
        ger.setNombre("Raul Jimenez");
        ger.setNumEmpleado(587890);
        ger.setSueldo(25_000);
        System.out.println(ger);
        ger.aumentarSueldo(20);
        ger.asignarPresupuesto(50_000);
        System.out.println(ger);
        System.out.println("Nombre del gerente: "+ger.getNombre());
        
        Gerente ger2 = new Gerente("Karen Avalos", 596723,  80_000, 120_000);
        System.out.println(ger2);
        
        Gerente ger3 = new Gerente("Samanta Rios", 956320, 35_000);
        System.out.println(ger3);
        
        System.out.println("\n-----------------------[Instancias]------------------------\n");
        
        if(ger3 instanceof Gerente){
            System.out.println("Gerente es instancia de Gerente");
        }
        if(ger instanceof Empleado){
            System.out.println("Gerente es instancia de Empleado");
        }
        if(ger instanceof Object){
            System.out.println("Gerente es instancia de Object");
        }
        
        System.out.println("\n--------------------------[Actividad Extra]-----------------------------\n");
        System.out.println("\n--------------------------[Clase Animal]-----------------------------\n");
        Animal animal = new Animal();
        System.out.println(animal);
        Animal animal2 = new Animal("Cachalote", "Mar Mediterranio", "gris azulado");
        System.out.println(animal2);
        
        System.out.println("\n--------------------------[Clase Animal Acuatico]-----------------------------\n");
        AnimalAcuatico animalAcu = new AnimalAcuatico();
        System.out.println(animalAcu);
        AnimalAcuatico animalAcu2 = new AnimalAcuatico("Cachalote", "Mar Mediterranio", "gris azulado", 3);
        System.out.println(animalAcu2);
        animalAcu2.comer();
        animalAcu2.sonido();
        animalAcu2.nadar();
        
        System.out.println("\n--------------------------[Clase Animal Acuatico: Ballena]-----------------------------\n");
        Ballena cachalote = new Ballena ("Cachalote", "Mar Mediterranio", "gris azulado", 3, 20);
        System.out.println(cachalote);
        cachalote.comer();
        cachalote.sonido();
        cachalote.nadar();
        cachalote.pelearConPinocho();
    }
}
