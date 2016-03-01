/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entities.Userdetails;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author DELL
 */
@Stateless
public class UserdetailsFacade extends AbstractFacade<Userdetails> {
    @PersistenceContext(unitName = "EnQuest-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserdetailsFacade() {
        super(Userdetails.class);
    }
    
}
