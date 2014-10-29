package com.blackswan.fake.Bean;

import java.sql.Time;
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
 * Barberphoto entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="barberphoto"
    ,catalog="fake"
)

public class Barberphoto  implements java.io.Serializable {


    // Fields    

     private Integer BPId;
     private Barber barber;
     private String BPName;
     private String BPDis;
     private Time BPTime;
     private Integer BPSort;
     private Boolean BPAudit;
     private Set<Barberphotopraise> barberphotopraises = new HashSet<Barberphotopraise>(0);
     private Set<Barberpic> barberpics = new HashSet<Barberpic>(0);
     private Set<Barberphototread> barberphototreads = new HashSet<Barberphototread>(0);


    // Constructors

    /** default constructor */
    public Barberphoto() {
    }

	/** minimal constructor */
    public Barberphoto(Barber barber, Time BPTime) {
        this.barber = barber;
        this.BPTime = BPTime;
    }
    
    /** full constructor */
    public Barberphoto(Barber barber, String BPName, String BPDis, Time BPTime, Integer BPSort, Boolean BPAudit, Set<Barberphotopraise> barberphotopraises, Set<Barberpic> barberpics, Set<Barberphototread> barberphototreads) {
        this.barber = barber;
        this.BPName = BPName;
        this.BPDis = BPDis;
        this.BPTime = BPTime;
        this.BPSort = BPSort;
        this.BPAudit = BPAudit;
        this.barberphotopraises = barberphotopraises;
        this.barberpics = barberpics;
        this.barberphototreads = barberphototreads;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="b_p_id", unique=true, nullable=false)

    public Integer getBPId() {
        return this.BPId;
    }
    
    public void setBPId(Integer BPId) {
        this.BPId = BPId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="b_id", nullable=false)

    public Barber getBarber() {
        return this.barber;
    }
    
    public void setBarber(Barber barber) {
        this.barber = barber;
    }
    
    @Column(name="b_p_name", length=100)

    public String getBPName() {
        return this.BPName;
    }
    
    public void setBPName(String BPName) {
        this.BPName = BPName;
    }
    
    @Column(name="b_p_dis")

    public String getBPDis() {
        return this.BPDis;
    }
    
    public void setBPDis(String BPDis) {
        this.BPDis = BPDis;
    }
    
    @Column(name="b_p_time", nullable=false, length=8)

    public Time getBPTime() {
        return this.BPTime;
    }
    
    public void setBPTime(Time BPTime) {
        this.BPTime = BPTime;
    }
    
    @Column(name="b_p_sort")

    public Integer getBPSort() {
        return this.BPSort;
    }
    
    public void setBPSort(Integer BPSort) {
        this.BPSort = BPSort;
    }
    
    @Column(name="b_p_audit")

    public Boolean getBPAudit() {
        return this.BPAudit;
    }
    
    public void setBPAudit(Boolean BPAudit) {
        this.BPAudit = BPAudit;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="barberphoto")

    public Set<Barberphotopraise> getBarberphotopraises() {
        return this.barberphotopraises;
    }
    
    public void setBarberphotopraises(Set<Barberphotopraise> barberphotopraises) {
        this.barberphotopraises = barberphotopraises;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="barberphoto")

    public Set<Barberpic> getBarberpics() {
        return this.barberpics;
    }
    
    public void setBarberpics(Set<Barberpic> barberpics) {
        this.barberpics = barberpics;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="barberphoto")

    public Set<Barberphototread> getBarberphototreads() {
        return this.barberphototreads;
    }
    
    public void setBarberphototreads(Set<Barberphototread> barberphototreads) {
        this.barberphototreads = barberphototreads;
    }
   








}