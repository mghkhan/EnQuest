/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entities.Audituniverse;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author DELL
 */
@Stateless
public class AuditUniverseFacade extends AbstractFacade<Audituniverse> {
    @PersistenceContext(unitName = "EnQuest-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AuditUniverseFacade() {
        super(Audituniverse.class);
    }
    
}
