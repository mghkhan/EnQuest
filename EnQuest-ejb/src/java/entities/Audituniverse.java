/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "audituniverse")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Audituniverse.findAll", query = "SELECT a FROM Audituniverse a"),
    @NamedQuery(name = "Audituniverse.findById", query = "SELECT a FROM Audituniverse a WHERE a.id = :id"),
    @NamedQuery(name = "Audituniverse.findByProcessCode", query = "SELECT a FROM Audituniverse a WHERE a.processCode = :processCode"),
    @NamedQuery(name = "Audituniverse.findByProcessName", query = "SELECT a FROM Audituniverse a WHERE a.processName = :processName"),
    @NamedQuery(name = "Audituniverse.findBySubProcessCode", query = "SELECT a FROM Audituniverse a WHERE a.subProcessCode = :subProcessCode"),
    @NamedQuery(name = "Audituniverse.findBySubProcessName", query = "SELECT a FROM Audituniverse a WHERE a.subProcessName = :subProcessName"),
    @NamedQuery(name = "Audituniverse.findByLastRating", query = "SELECT a FROM Audituniverse a WHERE a.lastRating = :lastRating"),
    @NamedQuery(name = "Audituniverse.findByDateLastRated", query = "SELECT a FROM Audituniverse a WHERE a.dateLastRated = :dateLastRated"),
    @NamedQuery(name = "Audituniverse.findByCurrentRating", query = "SELECT a FROM Audituniverse a WHERE a.currentRating = :currentRating"),
    @NamedQuery(name = "Audituniverse.findByDateofRating", query = "SELECT a FROM Audituniverse a WHERE a.dateofRating = :dateofRating"),
    @NamedQuery(name = "Audituniverse.findByWorkPaperRef", query = "SELECT a FROM Audituniverse a WHERE a.workPaperRef = :workPaperRef"),
    @NamedQuery(name = "Audituniverse.findByComments", query = "SELECT a FROM Audituniverse a WHERE a.comments = :comments")})
public class Audituniverse implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProcessCode")
    private float processCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ProcessName")
    private String processName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SubProcessCode")
    private float subProcessCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "SubProcessName")
    private String subProcessName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "LastRating")
    private String lastRating;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateLastRated")
    @Temporal(TemporalType.DATE)
    private Date dateLastRated;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "CurrentRating")
    private String currentRating;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateofRating")
    @Temporal(TemporalType.DATE)
    private Date dateofRating;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "WorkPaperRef")
    private String workPaperRef;
    @Size(max = 45)
    @Column(name = "Comments")
    private String comments;

    public Audituniverse() {
    }

    public Audituniverse(Integer id) {
        this.id = id;
    }

    public Audituniverse(Integer id, float processCode, String processName, float subProcessCode, String subProcessName, String lastRating, Date dateLastRated, String currentRating, Date dateofRating, String workPaperRef) {
        this.id = id;
        this.processCode = processCode;
        this.processName = processName;
        this.subProcessCode = subProcessCode;
        this.subProcessName = subProcessName;
        this.lastRating = lastRating;
        this.dateLastRated = dateLastRated;
        this.currentRating = currentRating;
        this.dateofRating = dateofRating;
        this.workPaperRef = workPaperRef;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getProcessCode() {
        return processCode;
    }

    public void setProcessCode(float processCode) {
        this.processCode = processCode;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public float getSubProcessCode() {
        return subProcessCode;
    }

    public void setSubProcessCode(float subProcessCode) {
        this.subProcessCode = subProcessCode;
    }

    public String getSubProcessName() {
        return subProcessName;
    }

    public void setSubProcessName(String subProcessName) {
        this.subProcessName = subProcessName;
    }

    public String getLastRating() {
        return lastRating;
    }

    public void setLastRating(String lastRating) {
        this.lastRating = lastRating;
    }

    public Date getDateLastRated() {
        return dateLastRated;
    }

    public void setDateLastRated(Date dateLastRated) {
        this.dateLastRated = dateLastRated;
    }

    public String getCurrentRating() {
        return currentRating;
    }

    public void setCurrentRating(String currentRating) {
        this.currentRating = currentRating;
    }

    public Date getDateofRating() {
        return dateofRating;
    }

    public void setDateofRating(Date dateofRating) {
        this.dateofRating = dateofRating;
    }

    public String getWorkPaperRef() {
        return workPaperRef;
    }

    public void setWorkPaperRef(String workPaperRef) {
        this.workPaperRef = workPaperRef;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Audituniverse)) {
            return false;
        }
        Audituniverse other = (Audituniverse) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Audituniverse[ id=" + id + " ]";
    }
    
}
