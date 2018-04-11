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
public enum EnumType {
    VI(1,"VILLE"),
    VT(2,"VTT"),
    RO(3,"ROUTE");
    
    int code;
    String label;
    
    EnumType(int id, String value)
    {
        this.code = id;
        this.label = value;
    }
    
    public String toString()
    {
        return this.code + "-" + this.label;
    }
}