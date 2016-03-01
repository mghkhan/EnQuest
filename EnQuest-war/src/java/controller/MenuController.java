/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inquest.controller;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author DELL
 */

@ManagedBean(name = "menuCont")
@SessionScoped
public class MenuController implements Serializable {
  
    
    public String menuNav(){
    
    return "index.xhtml";
    }
      public String logout() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "/loginform.xhtml?faces-redirect=true";
    }
}
