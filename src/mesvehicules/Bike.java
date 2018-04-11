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
public class Bike extends AbstractVehicule{
    EnumType type;
    public Bike()
    {
        //Appel au constructeur de AbstractVehicule
        super();
        
        //Définition du type de vélo
        this.type = EnumType.VI;
    }
    
    public void move()
    {
        
    }
}
