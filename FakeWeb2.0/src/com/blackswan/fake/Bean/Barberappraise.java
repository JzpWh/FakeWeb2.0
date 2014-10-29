package com.blackswan.fake.Bean;

import java.sql.Timestamp;
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
 * Barberappraise entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="barberappraise"
    ,catalog="fake"
)

public class Barberappraise  implements java.io.Serializable {


    // Fields    

     private Integer BAId;
     private Customer customer;
     private Barber barber;
     private Integer BAStar;
     private String BAContent;
     private Timestamp BATime;
     private Set<Barberappraisereply> barberappraisereplies = new HashSet<Barberappraisereply>(0);
     private Set<Barberappraisepic> barberappraisepics = new HashSet<Barberappraisepic>(0);
     private Set<Barberappraisetread> barberappraisetreads = new HashSet<Barberappraisetread>(0);
     private Set<Barberappraisepraise> barberappraisepraises = new HashSet<Barberappraisepraise>(0);


    // Constructors

    /** default constructor */
    public Barberappraise() {
    }

	/** minimal constructor */
    public Barberappraise(Customer customer, Barber barber, Integer BAStar, String BAContent, Timestamp BATime) {
        this.customer = customer;
        this.barber = barber;
        this.BAStar = BAStar;
        this.BAContent = BAContent;
        this.BATime = BATime;
    }
    
    /** full constructor */
    public Barberappraise(Customer customer, Barber barber, Integer BAStar, String BAContent, Timestamp BATime, Set<Barberappraisereply> barberappraisereplies, Set<Barberappraisepic> barberappraisepics, Set<Barberappraisetread> barberappraisetreads, Set<Barberappraisepraise> barberappraisepraises) {
        this.customer = customer;
        this.barber = barber;
        this.BAStar = BAStar;
        this.BAContent = BAContent;
        this.BATime = BATime;
        this.barberappraisereplies = barberappraisereplies;
        this.barberappraisepics = barberappraisepics;
        this.barberappraisetreads = barberappraisetreads;
        this.barberappraisepraises = barberappraisepraises;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="b_a_id", unique=true, nullable=false)

    public Integer getBAId() {
        return this.BAId;
    }
    
    public void setBAId(Integer BAId) {
        this.BAId = BAId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="c_id", nullable=false)

    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="b_id", nullable=false)

    public Barber getBarber() {
        return this.barber;
    }
    
    public void setBarber(Barber barber) {
        this.barber = barber;
    }
    
    @Column(name="b_a_star", nullable=false)

    public Integer getBAStar() {
        return this.BAStar;
    }
    
    public void setBAStar(Integer BAStar) {
        this.BAStar = BAStar;
    }
    
    @Column(name="b_a_content", nullable=false)

    public String getBAContent() {
        return this.BAContent;
    }
    
    public void setBAContent(String BAContent) {
        this.BAContent = BAContent;
    }
    
    @Column(name="b_a_time", nullable=false, length=19)

    public Timestamp getBATime() {
        return this.BATime;
    }
    
    public void setBATime(Timestamp BATime) {
        this.BATime = BATime;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="barberappraise")

    public Set<Barberappraisereply> getBarberappraisereplies() {
        return this.barberappraisereplies;
    }
    
    public void setBarberappraisereplies(Set<Barberappraisereply> barberappraisereplies) {
        this.barberappraisereplies = barberappraisereplies;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="barberappraise")

    public Set<Barberappraisepic> getBarberappraisepics() {
        return this.barberappraisepics;
    }
    
    public void setBarberappraisepics(Set<Barberappraisepic> barberappraisepics) {
        this.barberappraisepics = barberappraisepics;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="barberappraise")

    public Set<Barberappraisetread> getBarberappraisetreads() {
        return this.barberappraisetreads;
    }
    
    public void setBarberappraisetreads(Set<Barberappraisetread> barberappraisetreads) {
        this.barberappraisetreads = barberappraisetreads;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="barberappraise")

    public Set<Barberappraisepraise> getBarberappraisepraises() {
        return this.barberappraisepraises;
    }
    
    public void setBarberappraisepraises(Set<Barberappraisepraise> barberappraisepraises) {
        this.barberappraisepraises = barberappraisepraises;
    }
   








}