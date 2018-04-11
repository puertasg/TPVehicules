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

    public float getVolessence() {
        return volessence;
    }

    public void setVolessence(float volessence) {
        this.volessence = volessence;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public float getCo() {
        return co;
    }

    public void setCo(float co) {
        this.co = co;
    }
}