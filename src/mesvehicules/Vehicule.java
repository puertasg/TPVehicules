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
public interface Vehicule {
    public Position getPosition();
    public void setDirection(float nord, float sud, float est, float ouest);
    public void setSpeed(float speed);
}
