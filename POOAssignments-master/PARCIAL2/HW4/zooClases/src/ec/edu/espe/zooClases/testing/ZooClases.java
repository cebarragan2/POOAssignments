/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.zooClases.testing;


import ec.edu.espe.zooClases.model.Animal;
import ec.edu.espe.zooClases.model.Chimo;
import ec.edu.espe.zooClases.model.Cobra;
import ec.edu.espe.zooClases.model.Feline;
import ec.edu.espe.zooClases.model.Mammal;
import ec.edu.espe.zooClases.model.Primate;
import ec.edu.espe.zooClases.model.Reptile;
import ec.edu.espe.zooClases.model.Snake;
import ec.edu.espe.zooClases.model.Tiger;

/**
 *
 * @author usuario
 */
public class ZooClases {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.printInfo();
        Mammal mammal=new Mammal();
        mammal.printInfo();
        Reptile reptile=new Reptile();
        reptile.printInfo();
        Primate primate=new Primate();
        primate.printInfo();
        Feline feline =new Feline();
        feline.printInfo();
        Snake snake =new Snake();
        snake.printInfo();
        Chimo chimo=new Chimo();
        chimo.printInfo();
        Tiger tiger=new Tiger();
        tiger.printInfo();
        Cobra cobra =new Cobra();
        cobra.printInfo();
            
    }
    
}
