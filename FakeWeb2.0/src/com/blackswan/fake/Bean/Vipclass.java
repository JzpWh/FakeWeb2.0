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
 * Vipclass entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="vipclass"
    ,catalog="fake"
)

public class Vipclass  implements java.io.Serializable {


    // Fields    

     private Integer vipclassId;
     private Barbershop barbershop;
     private String vipclassType;
     private String viplevel;
     private Float servicediscount;
     private Float productdiscount;
     private Integer count;
     private Set<Vip> vips = new HashSet<Vip>(0);


    // Constructors

    /** default constructor */
    public Vipclass() {
    }

	/** minimal constructor */
    public Vipclass(Barbershop barbershop, String vipclassType, String viplevel, Float servicediscount, Float productdiscount) {
        this.barbershop = barbershop;
        this.vipclassType = vipclassType;
        this.viplevel = viplevel;
        this.servicediscount = servicediscount;
        this.productdiscount = productdiscount;
    }
    
    /** full constructor */
    public Vipclass(Barbershop barbershop, String vipclassType, String viplevel, Float servicediscount, Float productdiscount, Integer count, Set<Vip> vips) {
        this.barbershop = barbershop;
        this.vipclassType = vipclassType;
        this.viplevel = viplevel;
        this.servicediscount = servicediscount;
        this.productdiscount = productdiscount;
        this.count = count;
        this.vips = vips;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="vipclass_id", unique=true, nullable=false)

    public Integer getVipclassId() {
        return this.vipclassId;
    }
    
    public void setVipclassId(Integer vipclassId) {
        this.vipclassId = vipclassId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="s_id", nullable=false)

    public Barbershop getBarbershop() {
        return this.barbershop;
    }
    
    public void setBarbershop(Barbershop barbershop) {
        this.barbershop = barbershop;
    }
    
    @Column(name="vipclass_type", nullable=false, length=20)

    public String getVipclassType() {
        return this.vipclassType;
    }
    
    public void setVipclassType(String vipclassType) {
        this.vipclassType = vipclassType;
    }
    
    @Column(name="viplevel", nullable=false, length=20)

    public String getViplevel() {
        return this.viplevel;
    }
    
    public void setViplevel(String viplevel) {
        this.viplevel = viplevel;
    }
    
    @Column(name="servicediscount", nullable=false, precision=12, scale=0)

    public Float getServicediscount() {
        return this.servicediscount;
    }
    
    public void setServicediscount(Float servicediscount) {
        this.servicediscount = servicediscount;
    }
    
    @Column(name="productdiscount", nullable=false, precision=12, scale=0)

    public Float getProductdiscount() {
        return this.productdiscount;
    }
    
    public void setProductdiscount(Float productdiscount) {
        this.productdiscount = productdiscount;
    }
    
    @Column(name="count")

    public Integer getCount() {
        return this.count;
    }
    
    public void setCount(Integer count) {
        this.count = count;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="vipclass")

    public Set<Vip> getVips() {
        return this.vips;
    }
    
    public void setVips(Set<Vip> vips) {
        this.vips = vips;
    }
   








}