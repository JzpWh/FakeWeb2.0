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
 * Productclass entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="productclass"
    ,catalog="fake"
)

public class Productclass  implements java.io.Serializable {


    // Fields    

     private Integer productclassId;
     private Barbershop barbershop;
     private Productclass productclass;
     private String productclassName;
     private Set<Productclass> productclasses = new HashSet<Productclass>(0);
     private Set<Product> products = new HashSet<Product>(0);


    // Constructors

    /** default constructor */
    public Productclass() {
    }

	/** minimal constructor */
    public Productclass(Barbershop barbershop) {
        this.barbershop = barbershop;
    }
    
    /** full constructor */
    public Productclass(Barbershop barbershop, Productclass productclass, String productclassName, Set<Productclass> productclasses, Set<Product> products) {
        this.barbershop = barbershop;
        this.productclass = productclass;
        this.productclassName = productclassName;
        this.productclasses = productclasses;
        this.products = products;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="productclass_id", unique=true, nullable=false)

    public Integer getProductclassId() {
        return this.productclassId;
    }
    
    public void setProductclassId(Integer productclassId) {
        this.productclassId = productclassId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="s_id", nullable=false)

    public Barbershop getBarbershop() {
        return this.barbershop;
    }
    
    public void setBarbershop(Barbershop barbershop) {
        this.barbershop = barbershop;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="fproductclass_id")

    public Productclass getProductclass() {
        return this.productclass;
    }
    
    public void setProductclass(Productclass productclass) {
        this.productclass = productclass;
    }
    
    @Column(name="productclass_name", length=10)

    public String getProductclassName() {
        return this.productclassName;
    }
    
    public void setProductclassName(String productclassName) {
        this.productclassName = productclassName;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="productclass")

    public Set<Productclass> getProductclasses() {
        return this.productclasses;
    }
    
    public void setProductclasses(Set<Productclass> productclasses) {
        this.productclasses = productclasses;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="productclass")

    public Set<Product> getProducts() {
        return this.products;
    }
    
    public void setProducts(Set<Product> products) {
        this.products = products;
    }
   








}