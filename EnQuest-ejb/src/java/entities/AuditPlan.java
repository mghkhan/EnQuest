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
@Table(name = "audit plan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AuditPlan.findAll", query = "SELECT a FROM AuditPlan a"),
    @NamedQuery(name = "AuditPlan.findById", query = "SELECT a FROM AuditPlan a WHERE a.id = :id"),
    @NamedQuery(name = "AuditPlan.findByUnitCode", query = "SELECT a FROM AuditPlan a WHERE a.unitCode = :unitCode"),
    @NamedQuery(name = "AuditPlan.findByUnitName", query = "SELECT a FROM AuditPlan a WHERE a.unitName = :unitName"),
    @NamedQuery(name = "AuditPlan.findByCurrentRiskRatiing", query = "SELECT a FROM AuditPlan a WHERE a.currentRiskRatiing = :currentRiskRatiing"),
    @NamedQuery(name = "AuditPlan.findByDateofAssessment", query = "SELECT a FROM AuditPlan a WHERE a.dateofAssessment = :dateofAssessment"),
    @NamedQuery(name = "AuditPlan.findByPreviousRiskRating", query = "SELECT a FROM AuditPlan a WHERE a.previousRiskRating = :previousRiskRating"),
    @NamedQuery(name = "AuditPlan.findByDateofLastRiskRating", query = "SELECT a FROM AuditPlan a WHERE a.dateofLastRiskRating = :dateofLastRiskRating"),
    @NamedQuery(name = "AuditPlan.findByDaysSinceLastAudit", query = "SELECT a FROM AuditPlan a WHERE a.daysSinceLastAudit = :daysSinceLastAudit"),
    @NamedQuery(name = "AuditPlan.findByPlannedAuditDate", query = "SELECT a FROM AuditPlan a WHERE a.plannedAuditDate = :plannedAuditDate"),
    @NamedQuery(name = "AuditPlan.findByCurrentStatus", query = "SELECT a FROM AuditPlan a WHERE a.currentStatus = :currentStatus"),
    @NamedQuery(name = "AuditPlan.findByDateLastUpdate", query = "SELECT a FROM AuditPlan a WHERE a.dateLastUpdate = :dateLastUpdate"),
    @NamedQuery(name = "AuditPlan.findByComments", query = "SELECT a FROM AuditPlan a WHERE a.comments = :comments"),
    @NamedQuery(name = "AuditPlan.findByPlanYear", query = "SELECT a FROM AuditPlan a WHERE a.planYear = :planYear")})
public class AuditPlan implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Unit Code")
    private int unitCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Unit Name")
    private String unitName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Current Risk Ratiing")
    private String currentRiskRatiing;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Date of Assessment")
    @Temporal(TemporalType.DATE)
    private Date dateofAssessment;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Previous Risk Rating")
    private String previousRiskRating;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Date of Last Risk Rating")
    @Temporal(TemporalType.DATE)
    private Date dateofLastRiskRating;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Days Since  Last Audit")
    private int daysSinceLastAudit;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Planned Audit Date")
    @Temporal(TemporalType.DATE)
    private Date plannedAuditDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Current Status")
    private String currentStatus;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Date Last Update")
    @Temporal(TemporalType.DATE)
    private Date dateLastUpdate;
    @Size(max = 45)
    @Column(name = "Comments")
    private String comments;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Plan Year")
    private String planYear;

    public AuditPlan() {
    }

    public AuditPlan(Integer id) {
        this.id = id;
    }

    public AuditPlan(Integer id, int unitCode, String unitName, String currentRiskRatiing, Date dateofAssessment, String previousRiskRating, Date dateofLastRiskRating, int daysSinceLastAudit, Date plannedAuditDate, String currentStatus, Date dateLastUpdate, String planYear) {
        this.id = id;
        this.unitCode = unitCode;
        this.unitName = unitName;
        this.currentRiskRatiing = currentRiskRatiing;
        this.dateofAssessment = dateofAssessment;
        this.previousRiskRating = previousRiskRating;
        this.dateofLastRiskRating = dateofLastRiskRating;
        this.daysSinceLastAudit = daysSinceLastAudit;
        this.plannedAuditDate = plannedAuditDate;
        this.currentStatus = currentStatus;
        this.dateLastUpdate = dateLastUpdate;
        this.planYear = planYear;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(int unitCode) {
        this.unitCode = unitCode;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getCurrentRiskRatiing() {
        return currentRiskRatiing;
    }

    public void setCurrentRiskRatiing(String currentRiskRatiing) {
        this.currentRiskRatiing = currentRiskRatiing;
    }

    public Date getDateofAssessment() {
        return dateofAssessment;
    }

    public void setDateofAssessment(Date dateofAssessment) {
        this.dateofAssessment = dateofAssessment;
    }

    public String getPreviousRiskRating() {
        return previousRiskRating;
    }

    public void setPreviousRiskRating(String previousRiskRating) {
        this.previousRiskRating = previousRiskRating;
    }

    public Date getDateofLastRiskRating() {
        return dateofLastRiskRating;
    }

    public void setDateofLastRiskRating(Date dateofLastRiskRating) {
        this.dateofLastRiskRating = dateofLastRiskRating;
    }

    public int getDaysSinceLastAudit() {
        return daysSinceLastAudit;
    }

    public void setDaysSinceLastAudit(int daysSinceLastAudit) {
        this.daysSinceLastAudit = daysSinceLastAudit;
    }

    public Date getPlannedAuditDate() {
        return plannedAuditDate;
    }

    public void setPlannedAuditDate(Date plannedAuditDate) {
        this.plannedAuditDate = plannedAuditDate;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public Date getDateLastUpdate() {
        return dateLastUpdate;
    }

    public void setDateLastUpdate(Date dateLastUpdate) {
        this.dateLastUpdate = dateLastUpdate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getPlanYear() {
        return planYear;
    }

    public void setPlanYear(String planYear) {
        this.planYear = planYear;
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
        if (!(object instanceof AuditPlan)) {
            return false;
        }
        AuditPlan other = (AuditPlan) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.AuditPlan[ id=" + id + " ]";
    }
    
}
