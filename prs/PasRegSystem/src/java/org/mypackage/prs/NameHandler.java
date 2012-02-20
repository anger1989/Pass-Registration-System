/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.prs;
    
    
/**
 *
 * @author Anger
 */
public class NameHandler {
    private String name;
    private String lastname;
    private String pnumber;
    public NameHandler() {
        name=null;
        lastname=null;
        pnumber=null;        
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the pnumber
     */
    public String getPnumber() {
        return pnumber;
    }

    /**
     * @param pnumber the pnumber to set
     */
    public void setPnumber(String pnumber) {
        this.pnumber = pnumber;
    }
}
