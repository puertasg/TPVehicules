/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mesvehicules;

/**
 *
 * @author diginamic05
 */
public class Car extends AbstractVehicule{
    private float volessence;
    private int puissance;
    private float co;
    
    public Car()
    {
        //Appel au constructeur de AbstractVehicule
        super();
        this.volessence = 0;
        this.puissance = 0;
        this.co = 0;
    }
}