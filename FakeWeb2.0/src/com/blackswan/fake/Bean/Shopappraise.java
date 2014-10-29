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
 * Shopappraise entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="shopappraise"
    ,catalog="fake"
)

public class Shopappraise  implements java.io.Serializable {


    // Fields    

     private Integer SAId;
     private Customer customer;
     private Barbershop barbershop;
     private Integer SAPstar;
     private Integer SAHstar;
     private Integer SAFstar;
     private Integer SASstar;
     private String SAContent;
     private Timestamp SATime;
     private Set<Shopappraisestamp> shopappraisestamps = new HashSet<Shopappraisestamp>(0);
     private Set<Shopappraisepraise> shopappraisepraises = new HashSet<Shopappraisepraise>(0);
     private Set<Shopappraisereply> shopappraisereplies = new HashSet<Shopappraisereply>(0);


    // Constructors

    /** default constructor */
    public Shopappraise() {
    }

	/** minimal constructor */
    public Shopappraise(Customer customer, Barbershop barbershop, Integer SAPstar, Integer SAHstar, Integer SAFstar, Integer SASstar, Timestamp SATime) {
        this.customer = customer;
        this.barbershop = barbershop;
        this.SAPstar = SAPstar;
        this.SAHstar = SAHstar;
        this.SAFstar = SAFstar;
        this.SASstar = SASstar;
        this.SATime = SATime;
    }
    
    /** full constructor */
    public Shopappraise(Customer customer, Barbershop barbershop, Integer SAPstar, Integer SAHstar, Integer SAFstar, Integer SASstar, String SAContent, Timestamp SATime, Set<Shopappraisestamp> shopappraisestamps, Set<Shopappraisepraise> shopappraisepraises, Set<Shopappraisereply> shopappraisereplies) {
        this.customer = customer;
        this.barbershop = barbershop;
        this.SAPstar = SAPstar;
        this.SAHstar = SAHstar;
        this.SAFstar = SAFstar;
        this.SASstar = SASstar;
        this.SAContent = SAContent;
        this.SATime = SATime;
        this.shopappraisestamps = shopappraisestamps;
        this.shopappraisepraises = shopappraisepraises;
        this.shopappraisereplies = shopappraisereplies;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="s_a_id", unique=true, nullable=false)

    public Integer getSAId() {
        return this.SAId;
    }
    
    public void setSAId(Integer SAId) {
        this.SAId = SAId;
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
        @JoinColumn(name="s_id", nullable=false)

    public Barbershop getBarbershop() {
        return this.barbershop;
    }
    
    public void setBarbershop(Barbershop barbershop) {
        this.barbershop = barbershop;
    }
    
    @Column(name="s_a_pstar", nullable=false)

    public Integer getSAPstar() {
        return this.SAPstar;
    }
    
    public void setSAPstar(Integer SAPstar) {
        this.SAPstar = SAPstar;
    }
    
    @Column(name="s_a_hstar", nullable=false)

    public Integer getSAHstar() {
        return this.SAHstar;
    }
    
    public void setSAHstar(Integer SAHstar) {
        this.SAHstar = SAHstar;
    }
    
    @Column(name="s_a_fstar", nullable=false)

    public Integer getSAFstar() {
        return this.SAFstar;
    }
    
    public void setSAFstar(Integer SAFstar) {
        this.SAFstar = SAFstar;
    }
    
    @Column(name="s_a_sstar", nullable=false)

    public Integer getSASstar() {
        return this.SASstar;
    }
    
    public void setSASstar(Integer SASstar) {
        this.SASstar = SASstar;
    }
    
    @Column(name="s_a_content")

    public String getSAContent() {
        return this.SAContent;
    }
    
    public void setSAContent(String SAContent) {
        this.SAContent = SAContent;
    }
    
    @Column(name="s_a_time", nullable=false, length=19)

    public Timestamp getSATime() {
        return this.SATime;
    }
    
    public void setSATime(Timestamp SATime) {
        this.SATime = SATime;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="shopappraise")

    public Set<Shopappraisestamp> getShopappraisestamps() {
        return this.shopappraisestamps;
    }
    
    public void setShopappraisestamps(Set<Shopappraisestamp> shopappraisestamps) {
        this.shopappraisestamps = shopappraisestamps;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="shopappraise")

    public Set<Shopappraisepraise> getShopappraisepraises() {
        return this.shopappraisepraises;
    }
    
    public void setShopappraisepraises(Set<Shopappraisepraise> shopappraisepraises) {
        this.shopappraisepraises = shopappraisepraises;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="shopappraise")

    public Set<Shopappraisereply> getShopappraisereplies() {
        return this.shopappraisereplies;
    }
    
    public void setShopappraisereplies(Set<Shopappraisereply> shopappraisereplies) {
        this.shopappraisereplies = shopappraisereplies;
    }
   








}