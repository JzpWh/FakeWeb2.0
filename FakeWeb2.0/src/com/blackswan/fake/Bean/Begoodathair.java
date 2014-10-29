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
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * Begoodathair entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="begoodathair"
    ,catalog="fake"
)

public class Begoodathair  implements java.io.Serializable {


    // Fields    

     private Integer hsId;
     private String hsName;
     private String hsPPath;
     private String hsDis;
     private Set<Barber> barbersForHsIdfive = new HashSet<Barber>(0);
     private Set<Barber> barbersForHsIdfour = new HashSet<Barber>(0);
     private Set<Barber> barbersForHsIdthree = new HashSet<Barber>(0);
     private Set<Barber> barbersForHsIdtwo = new HashSet<Barber>(0);
     private Set<Barber> barbersForHsIdone = new HashSet<Barber>(0);


    // Constructors

    /** default constructor */
    public Begoodathair() {
    }

	/** minimal constructor */
    public Begoodathair(String hsName, String hsPPath) {
        this.hsName = hsName;
        this.hsPPath = hsPPath;
    }
    
    /** full constructor */
    public Begoodathair(String hsName, String hsPPath, String hsDis, Set<Barber> barbersForHsIdfive, Set<Barber> barbersForHsIdfour, Set<Barber> barbersForHsIdthree, Set<Barber> barbersForHsIdtwo, Set<Barber> barbersForHsIdone) {
        this.hsName = hsName;
        this.hsPPath = hsPPath;
        this.hsDis = hsDis;
        this.barbersForHsIdfive = barbersForHsIdfive;
        this.barbersForHsIdfour = barbersForHsIdfour;
        this.barbersForHsIdthree = barbersForHsIdthree;
        this.barbersForHsIdtwo = barbersForHsIdtwo;
        this.barbersForHsIdone = barbersForHsIdone;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="hs_id", unique=true, nullable=false)

    public Integer getHsId() {
        return this.hsId;
    }
    
    public void setHsId(Integer hsId) {
        this.hsId = hsId;
    }
    
    @Column(name="hs_name", nullable=false, length=10)

    public String getHsName() {
        return this.hsName;
    }
    
    public void setHsName(String hsName) {
        this.hsName = hsName;
    }
    
    @Column(name="hs_p_path", nullable=false, length=100)

    public String getHsPPath() {
        return this.hsPPath;
    }
    
    public void setHsPPath(String hsPPath) {
        this.hsPPath = hsPPath;
    }
    
    @Column(name="hs_dis")

    public String getHsDis() {
        return this.hsDis;
    }
    
    public void setHsDis(String hsDis) {
        this.hsDis = hsDis;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="begoodathairByHsIdfive")

    public Set<Barber> getBarbersForHsIdfive() {
        return this.barbersForHsIdfive;
    }
    
    public void setBarbersForHsIdfive(Set<Barber> barbersForHsIdfive) {
        this.barbersForHsIdfive = barbersForHsIdfive;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="begoodathairByHsIdfour")

    public Set<Barber> getBarbersForHsIdfour() {
        return this.barbersForHsIdfour;
    }
    
    public void setBarbersForHsIdfour(Set<Barber> barbersForHsIdfour) {
        this.barbersForHsIdfour = barbersForHsIdfour;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="begoodathairByHsIdthree")

    public Set<Barber> getBarbersForHsIdthree() {
        return this.barbersForHsIdthree;
    }
    
    public void setBarbersForHsIdthree(Set<Barber> barbersForHsIdthree) {
        this.barbersForHsIdthree = barbersForHsIdthree;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="begoodathairByHsIdtwo")

    public Set<Barber> getBarbersForHsIdtwo() {
        return this.barbersForHsIdtwo;
    }
    
    public void setBarbersForHsIdtwo(Set<Barber> barbersForHsIdtwo) {
        this.barbersForHsIdtwo = barbersForHsIdtwo;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="begoodathairByHsIdone")

    public Set<Barber> getBarbersForHsIdone() {
        return this.barbersForHsIdone;
    }
    
    public void setBarbersForHsIdone(Set<Barber> barbersForHsIdone) {
        this.barbersForHsIdone = barbersForHsIdone;
    }
   








}