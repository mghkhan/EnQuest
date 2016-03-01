/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import model.UserdetailsFacade;
import java.util.*;
import entities.*;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author DELL
 */

@ManagedBean(name="userController")
@SessionScoped
public class UserController implements Serializable {
  
    public UserController(){
    }
      private   boolean check;
      private String loginNav;
 private static final long serialVersionUID = 1L;
    public String getLoginNav() {
        return loginNav;
    }

    public void setLoginNav(String loginNav) {
        this.loginNav = loginNav;
    }
    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    @EJB
    private UserdetailsFacade userdetailsFacade;
    private Userdetails usrDet = new Userdetails();

    public Userdetails getUsrDet() {
        return usrDet;
    }

    public void setUsrDet(Userdetails usrDet) {
        this.usrDet = usrDet;
    }

    public String add(){
    this.userdetailsFacade.create(this.usrDet);
    System.out.println(" "+this.userdetailsFacade.find(this.usrDet.getLogin()));
    this.usrDet= new Userdetails();
    
    return "index";
    }
    
      public void onEdit(RowEditEvent event) {  
        FacesMessage msg = new FacesMessage("Item Edited",((Userdetails) event.getObject()).getLogin());  
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    }  
    public String delete(Userdetails u){
       
        this.userdetailsFacade.remove(u);
        return "index";
    }
    public String edit (Userdetails u){
        this.usrDet=u;
      //  FacesMessage msg = new FacesMessage("Car Edited", ((Car) event.getObject()).getId());
     //   this.userdetailsFacade.find(u);
    this.userdetailsFacade.edit(this.usrDet);
    this.usrDet=new Userdetails();
    return "index";
    }
     public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edit Cancelled",((Userdetails) event.getObject()).getLogin());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
     public String login(){
         System.out.println("Inside User Controller login method");
        setCheck(this.userdetailsFacade.login(this.usrDet.getLogin(),this.usrDet.getPassword()));
        
        System.out.println("After Set check statement inside User Controlelr login method :");
        if (check==true){
         
         System.out.println("inside If block User controller Login method");
         setLoginNav("home");
         
        }
        else{
            System.out.println("inside else block User controller Login method");
        setLoginNav("loginform");
        }
        return loginNav;
     }
     
    
    public List<Userdetails> findAll(){
        return this.userdetailsFacade.findAll();
    }
}
