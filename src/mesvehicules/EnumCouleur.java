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
public enum EnumCouleur {
    RO(1,"ROUGE"),
    BL(2,"BLEU"),
    JN(2,"JAUNE"),
    OR(2,"ORANGE"),
    NO(2,"NOIR"),
    BLC(2,"BLANC"),
    VI(2,"VIOLET"),
    VR(3,"VERT");
    
    int code;
    String label;
    
    EnumCouleur(int id, String value)
    {
        this.code = id;
        this.label = value;
    }
    
    public String toString()
    {
        return this.code + "-" + this.label;
    }
}
