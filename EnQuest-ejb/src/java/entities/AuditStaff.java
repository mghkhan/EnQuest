/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "audit staff")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AuditStaff.findAll", query = "SELECT a FROM AuditStaff a"),
    @NamedQuery(name = "AuditStaff.findById", query = "SELECT a FROM AuditStaff a WHERE a.id = :id"),
    @NamedQuery(name = "AuditStaff.findByEmployeeNo", query = "SELECT a FROM AuditStaff a WHERE a.employeeNo = :employeeNo"),
    @NamedQuery(name = "AuditStaff.findByName", query = "SELECT a FROM AuditStaff a WHERE a.name = :name"),
    @NamedQuery(name = "AuditStaff.findByDesignation", query = "SELECT a FROM AuditStaff a WHERE a.designation = :designation"),
    @NamedQuery(name = "AuditStaff.findByFunctionalTitle", query = "SELECT a FROM AuditStaff a WHERE a.functionalTitle = :functionalTitle")})
public class AuditStaff implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Employee No")
    private int employeeNo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Designation")
    private String designation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Functional Title")
    private String functionalTitle;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "Body")
    private byte[] body;

    public AuditStaff() {
    }

    public AuditStaff(Integer id) {
        this.id = id;
    }

    public AuditStaff(Integer id, int employeeNo, String name, String designation, String functionalTitle, byte[] body) {
        this.id = id;
        this.employeeNo = employeeNo;
        this.name = name;
        this.designation = designation;
        this.functionalTitle = functionalTitle;
        this.body = body;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(int employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getFunctionalTitle() {
        return functionalTitle;
    }

    public void setFunctionalTitle(String functionalTitle) {
        this.functionalTitle = functionalTitle;
    }

    public byte[] getBody() {
        return body;
    }

    public void setBody(byte[] body) {
        this.body = body;
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
        if (!(object instanceof AuditStaff)) {
            return false;
        }
        AuditStaff other = (AuditStaff) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.AuditStaff[ id=" + id + " ]";
    }
    
}
