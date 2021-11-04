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
        
        System.out.println("\n--------------------------[Clase Animal Aereo]-----------------------------\n");
        AnimalAereo animalAer = new AnimalAereo();
        System.out.println(animalAer);
        AnimalAereo animalAer2 = new AnimalAereo("Aguila", "Bosque", "cafe", 2);
        System.out.println(animalAer2);
        animalAer2.comer();
        animalAer2.sonido();
        animalAer2.volar();
        
        System.out.println("\n--------------------------[Clase Animal Aereo: Aguila]-----------------------------\n");
        Pajaro Aguila = new Pajaro ("Aguila", "Bosque", "cafe",2, "Redondo");
        System.out.println(Aguila);
        Aguila.comer();
        Aguila.sonido();
        Aguila.volar();
        Aguila.recolectarRamas();
        
        System.out.println("\n--------------------------[Clase Animal Terrestre]-----------------------------\n");
        AnimalTerrestre animalTer = new AnimalTerrestre();
        System.out.println(animalTer);
        AnimalTerrestre animalTer2 = new AnimalTerrestre("Golden Retriever", "Casa", "dorado", 4);
        System.out.println(animalTer2);
        animalTer2.comer();
        animalTer2.sonido();
        animalTer2.correr();
        
        System.out.println("\n--------------------------[Clase Animal Terrestre: Perro]-----------------------------\n");
        Perro GRetriever = new Perro ("Golden Retriever", "Casa", "dorado",4, "Rojo");
        System.out.println(GRetriever);
        GRetriever.comer();
        GRetriever.sonido();
        GRetriever.correr();
        GRetriever.hacerTruco();
    }
}
