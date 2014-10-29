package com.blackswan.fake.Bean;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * Administrator entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="administrator"
    ,catalog="fake"
)

public class Administrator  implements java.io.Serializable {


    // Fields    
    private static final long serialVersionUID = -4977605708601303627L;
    private Integer administratorId;
     private Administrator administrator;
     private String administratorName;
     private String administratorPwd;
     private String administratorRight;
     private String administratorTelephone;
     private String administratorAddress;
     private Boolean administratorSex;
     private String adprivileges;
     private Set<Administrator> administrators = new HashSet<Administrator>(0);
     private Set<Adoperation> adoperations = new HashSet<Adoperation>(0);


    // Constructors

    /** default constructor */
    public Administrator() {
    }

	/** minimal constructor */
    public Administrator(String administratorName, String administratorPwd, String administratorRight, String administratorTelephone) {
        this.administratorName = administratorName;
        this.administratorPwd = administratorPwd;
        this.administratorRight = administratorRight;
        this.administratorTelephone = administratorTelephone;
    }
    
    /** full constructor */
    public Administrator(Administrator administrator, String administratorName, String administratorPwd, String administratorRight, String administratorTelephone, String administratorAddress, Boolean administratorSex, String adprivileges, Set<Administrator> administrators, Set<Adoperation> adoperations) {
        this.administrator = administrator;
        this.administratorName = administratorName;
        this.administratorPwd = administratorPwd;
        this.administratorRight = administratorRight;
        this.administratorTelephone = administratorTelephone;
        this.administratorAddress = administratorAddress;
        this.administratorSex = administratorSex;
        this.adprivileges = adprivileges;
        this.administrators = administrators;
        this.adoperations = adoperations;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="administrator_id", unique=true, nullable=false)

    public Integer getAdministratorId() {
        return this.administratorId;
    }
    
    public void setAdministratorId(Integer administratorId) {
        this.administratorId = administratorId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="fadministrator_id")

    public Administrator getAdministrator() {
        return this.administrator;
    }
    
    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }
    
    @Column(name="administrator_name", nullable=false, length=10)

    public String getAdministratorName() {
        return this.administratorName;
    }
    
    public void setAdministratorName(String administratorName) {
        this.administratorName = administratorName;
    }
    
    @Column(name="administrator_pwd", nullable=false, length=20)

    public String getAdministratorPwd() {
        return this.administratorPwd;
    }
    
    public void setAdministratorPwd(String administratorPwd) {
        this.administratorPwd = administratorPwd;
    }
    
    @Column(name="administrator_right", nullable=false, length=20)

    public String getAdministratorRight() {
        return this.administratorRight;
    }
    
    public void setAdministratorRight(String administratorRight) {
        this.administratorRight = administratorRight;
    }
    
    @Column(name="administrator_telephone", nullable=false, length=20)

    public String getAdministratorTelephone() {
        return this.administratorTelephone;
    }
    
    public void setAdministratorTelephone(String administratorTelephone) {
        this.administratorTelephone = administratorTelephone;
    }
    
    @Column(name="administrator_address", length=60)

    public String getAdministratorAddress() {
        return this.administratorAddress;
    }
    
    public void setAdministratorAddress(String administratorAddress) {
        this.administratorAddress = administratorAddress;
    }
    
    @Column(name="administrator_sex")

    public Boolean getAdministratorSex() {
        return this.administratorSex;
    }
    
    public void setAdministratorSex(Boolean administratorSex) {
        this.administratorSex = administratorSex;
    }
    
    @Column(name="adprivileges", length=50)

    public String getAdprivileges() {
        return this.adprivileges;
    }
    
    public void setAdprivileges(String adprivileges) {
        this.adprivileges = adprivileges;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="administrator")

    public Set<Administrator> getAdministrators() {
        return this.administrators;
    }
    
    public void setAdministrators(Set<Administrator> administrators) {
        this.administrators = administrators;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="administrator")

    public Set<Adoperation> getAdoperations() {
        return this.adoperations;
    }
    
    public void setAdoperations(Set<Adoperation> adoperations) {
        this.adoperations = adoperations;
    }
   








}