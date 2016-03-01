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
 * @author Ghous
 */
@Entity
@Table(name = "userdetails")
@XmlRootElement
@NamedQueries({
    @NamedQuery (name= "Userdetails.login", query ="SELECT u FROM Userdetails u WHERE u.login = :login AND u.password = :password"),
    @NamedQuery(name = "Userdetails.findAll", query = "SELECT u FROM Userdetails u"),
    @NamedQuery(name = "Userdetails.findByUserID", query = "SELECT u FROM Userdetails u WHERE u.userID = :userID"),
    @NamedQuery(name = "Userdetails.findByUserName", query = "SELECT u FROM Userdetails u WHERE u.userName = :userName"),
    @NamedQuery(name = "Userdetails.findByPassword", query = "SELECT u FROM Userdetails u WHERE u.password = :password"),
    @NamedQuery(name = "Userdetails.findByUserRoles", query = "SELECT u FROM Userdetails u WHERE u.userRoles = :userRoles"),
    @NamedQuery(name = "Userdetails.findByTimeLoggedIn", query = "SELECT u FROM Userdetails u WHERE u.timeLoggedIn = :timeLoggedIn"),
    @NamedQuery(name = "Userdetails.findByTimeLoggedOff", query = "SELECT u FROM Userdetails u WHERE u.timeLoggedOff = :timeLoggedOff"),
    @NamedQuery(name = "Userdetails.findByIpAddress", query = "SELECT u FROM Userdetails u WHERE u.ipAddress = :ipAddress"),
    @NamedQuery(name = "Userdetails.findByLogin", query = "SELECT u FROM Userdetails u WHERE u.login = :login")})
public class Userdetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "\"User ID\"")
    private Integer userID;
    @Basic(optional = false)

    @Size(min = 1, max = 45)
    @Column(name = "\"user name\"")
    private String userName;
    @Basic(optional = false)

    @Size(min = 1, max = 45)
      @Column(name = "\"password\"")
    private String password;
    @Basic(optional = false)

    @Size(min = 1, max = 45)
     @Column(name = "\"user roles\"")
    private String userRoles;
     @Column(name = "\"time logged in\"")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeLoggedIn;
    @Column(name = "\"time logged off\"")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeLoggedOff;
    @Basic(optional = false)
  
    @Size(min = 1, max = 45)
  @Column(name = "\"ip address\"")
    private String ipAddress;
    @Basic(optional = false)

    @Size(min = 1, max = 75)
     @Column(name = "\"login\"")
    private String login;

    public Userdetails() {
    }

    public Userdetails(Integer userID) {
        this.userID = userID;
    }

    public Userdetails(Integer userID, String userName, String password, String userRoles, String ipAddress, String login) {
        this.userID = userID;
        this.userName = userName;
        this.password = password;
        this.userRoles = userRoles;
        this.ipAddress = ipAddress;
        this.login = login;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(String userRoles) {
        this.userRoles = userRoles;
    }

    public Date getTimeLoggedIn() {
        return timeLoggedIn;
    }

    public void setTimeLoggedIn(Date timeLoggedIn) {
        this.timeLoggedIn = timeLoggedIn;
    }

    public Date getTimeLoggedOff() {
        return timeLoggedOff;
    }

    public void setTimeLoggedOff(Date timeLoggedOff) {
        this.timeLoggedOff = timeLoggedOff;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userID != null ? userID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Userdetails)) {
            return false;
        }
        Userdetails other = (Userdetails) object;
        if ((this.userID == null && other.userID != null) || (this.userID != null && !this.userID.equals(other.userID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Userdetails[ userID=" + userID + " ]";
    }
    
}
