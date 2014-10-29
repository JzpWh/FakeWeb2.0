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
 * Serviceclass entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="serviceclass"
    ,catalog="fake"
)

public class Serviceclass  implements java.io.Serializable {


    // Fields    

     private Integer serviceclassId;
     private Barbershop barbershop;
     private String serviceclassName;
     private Float serviceclassMprice;
     private Float serviceclassPrice;
     private String servicePic;
     private Integer neadtimehour;
     private Integer neadtimeminute;
     private Float royaty;
     private String serviceclassDis;
     private Set<Meteringcard> meteringcards = new HashSet<Meteringcard>(0);
     private Set<Cancelpreordertable> cancelpreordertables = new HashSet<Cancelpreordertable>(0);
     private Set<Noapordertable> noapordertables = new HashSet<Noapordertable>(0);
     private Set<Cancelordertable> cancelordertables = new HashSet<Cancelordertable>(0);
     private Set<Ordertable> ordertables = new HashSet<Ordertable>(0);
     private Set<Preordertable> preordertables = new HashSet<Preordertable>(0);


    // Constructors

    /** default constructor */
    public Serviceclass() {
    }

	/** minimal constructor */
    public Serviceclass(Barbershop barbershop, Float serviceclassPrice, String servicePic, Integer neadtimehour, Integer neadtimeminute) {
        this.barbershop = barbershop;
        this.serviceclassPrice = serviceclassPrice;
        this.servicePic = servicePic;
        this.neadtimehour = neadtimehour;
        this.neadtimeminute = neadtimeminute;
    }
    
    /** full constructor */
    public Serviceclass(Barbershop barbershop, String serviceclassName, Float serviceclassMprice, Float serviceclassPrice, String servicePic, Integer neadtimehour, Integer neadtimeminute, Float royaty, String serviceclassDis, Set<Meteringcard> meteringcards, Set<Cancelpreordertable> cancelpreordertables, Set<Noapordertable> noapordertables, Set<Cancelordertable> cancelordertables, Set<Ordertable> ordertables, Set<Preordertable> preordertables) {
        this.barbershop = barbershop;
        this.serviceclassName = serviceclassName;
        this.serviceclassMprice = serviceclassMprice;
        this.serviceclassPrice = serviceclassPrice;
        this.servicePic = servicePic;
        this.neadtimehour = neadtimehour;
        this.neadtimeminute = neadtimeminute;
        this.royaty = royaty;
        this.serviceclassDis = serviceclassDis;
        this.meteringcards = meteringcards;
        this.cancelpreordertables = cancelpreordertables;
        this.noapordertables = noapordertables;
        this.cancelordertables = cancelordertables;
        this.ordertables = ordertables;
        this.preordertables = preordertables;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="serviceclass_id", unique=true, nullable=false)

    public Integer getServiceclassId() {
        return this.serviceclassId;
    }
    
    public void setServiceclassId(Integer serviceclassId) {
        this.serviceclassId = serviceclassId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="s_id", nullable=false)

    public Barbershop getBarbershop() {
        return this.barbershop;
    }
    
    public void setBarbershop(Barbershop barbershop) {
        this.barbershop = barbershop;
    }
    
    @Column(name="serviceclass_name", length=10)

    public String getServiceclassName() {
        return this.serviceclassName;
    }
    
    public void setServiceclassName(String serviceclassName) {
        this.serviceclassName = serviceclassName;
    }
    
    @Column(name="serviceclass_mprice", precision=12, scale=0)

    public Float getServiceclassMprice() {
        return this.serviceclassMprice;
    }
    
    public void setServiceclassMprice(Float serviceclassMprice) {
        this.serviceclassMprice = serviceclassMprice;
    }
    
    @Column(name="serviceclass_price", nullable=false, precision=12, scale=0)

    public Float getServiceclassPrice() {
        return this.serviceclassPrice;
    }
    
    public void setServiceclassPrice(Float serviceclassPrice) {
        this.serviceclassPrice = serviceclassPrice;
    }
    
    @Column(name="service_pic", nullable=false, length=100)

    public String getServicePic() {
        return this.servicePic;
    }
    
    public void setServicePic(String servicePic) {
        this.servicePic = servicePic;
    }
    
    @Column(name="neadtimehour", nullable=false)

    public Integer getNeadtimehour() {
        return this.neadtimehour;
    }
    
    public void setNeadtimehour(Integer neadtimehour) {
        this.neadtimehour = neadtimehour;
    }
    
    @Column(name="neadtimeminute", nullable=false)

    public Integer getNeadtimeminute() {
        return this.neadtimeminute;
    }
    
    public void setNeadtimeminute(Integer neadtimeminute) {
        this.neadtimeminute = neadtimeminute;
    }
    
    @Column(name="royaty", precision=12, scale=0)

    public Float getRoyaty() {
        return this.royaty;
    }
    
    public void setRoyaty(Float royaty) {
        this.royaty = royaty;
    }
    
    @Column(name="serviceclass_dis")

    public String getServiceclassDis() {
        return this.serviceclassDis;
    }
    
    public void setServiceclassDis(String serviceclassDis) {
        this.serviceclassDis = serviceclassDis;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="serviceclass")

    public Set<Meteringcard> getMeteringcards() {
        return this.meteringcards;
    }
    
    public void setMeteringcards(Set<Meteringcard> meteringcards) {
        this.meteringcards = meteringcards;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="serviceclass")

    public Set<Cancelpreordertable> getCancelpreordertables() {
        return this.cancelpreordertables;
    }
    
    public void setCancelpreordertables(Set<Cancelpreordertable> cancelpreordertables) {
        this.cancelpreordertables = cancelpreordertables;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="serviceclass")

    public Set<Noapordertable> getNoapordertables() {
        return this.noapordertables;
    }
    
    public void setNoapordertables(Set<Noapordertable> noapordertables) {
        this.noapordertables = noapordertables;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="serviceclass")

    public Set<Cancelordertable> getCancelordertables() {
        return this.cancelordertables;
    }
    
    public void setCancelordertables(Set<Cancelordertable> cancelordertables) {
        this.cancelordertables = cancelordertables;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="serviceclass")

    public Set<Ordertable> getOrdertables() {
        return this.ordertables;
    }
    
    public void setOrdertables(Set<Ordertable> ordertables) {
        this.ordertables = ordertables;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="serviceclass")

    public Set<Preordertable> getPreordertables() {
        return this.preordertables;
    }
    
    public void setPreordertables(Set<Preordertable> preordertables) {
        this.preordertables = preordertables;
    }
   








}