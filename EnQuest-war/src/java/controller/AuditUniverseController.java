/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Audituniverse;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.AuditUniverseFacade;

/**
 *
 * @author DELL
 */

@ManagedBean(name="auditUniverseController")
@SessionScoped
public class AuditUniverseController implements Serializable{

    
    public AuditUniverseController() {
    }
     private static final long serialVersionUID = 1L;

     @EJB
    private AuditUniverseFacade auditUniverseFacade;
         private Audituniverse adtUni = new Audituniverse();


    public AuditUniverseFacade getAuditUniverseFacade() {
        return auditUniverseFacade;
    }

    public void setAuditUniverseFacade(AuditUniverseFacade auditUniverseFacade) {
        this.auditUniverseFacade = auditUniverseFacade;
    }

    public Audituniverse getAdtUni() {
        return adtUni;
    }

    public void setAdtUni(Audituniverse adtUni) {
        this.adtUni = adtUni;
    }
    
    
    
    
    //CRUD operations are below
    
    //Adding Audit Universe
    public String add(){
    this.auditUniverseFacade.create(this.adtUni);
    System.out.println(" "+this.auditUniverseFacade.find(this.adtUni.getId()));
    this.adtUni= new Audituniverse();
    
    return "audituniverse";
    
    
        }
    
    public String delete(Audituniverse a){
       
        this.auditUniverseFacade.remove(a);
        return "audituniverse";
    }
    
    public String edit (Audituniverse a){
        this.adtUni=a;
        //  FacesMessage msg = new FacesMessage("Car Edited", ((Car) event.getObject()).getId());
     //   this.userdetailsFacade.find(u);
    this.auditUniverseFacade.edit(this.adtUni);
    this.adtUni=new Audituniverse();
    return "audituniverse";
    }
    
}
