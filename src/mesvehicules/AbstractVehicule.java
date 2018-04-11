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
public abstract class AbstractVehicule implements Vehicule {
    private Position position;
    private float speed;
    private float dirNord;
    private float dirSud;
    private float dirOuest;
    private float dirEst;
    
    private int poids;
    private EnumCouleur couleur;
    private String marque;
    private String modele;
    
    public AbstractVehicule()
    {
        this.position = new Position();
        this.speed = 0;
        
        this.dirNord = 0;
        this.dirSud = 0;
        this.dirOuest = 0;
        this.dirEst = 0;
        
        this.poids = 0;
        this.couleur = EnumCouleur.RO;
        this.marque = "";
        this.modele = "";
    }

    public Position getPosition() {
        return position;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void setDirection(float n, float s, float o, float e) {
        this.dirNord = n;
        this.dirSud = s;
        this.dirOuest = o;
        this.dirEst = e;
    }
}
