package com.blackswan.fake.Bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * Meteringcard entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="meteringcard"
    ,catalog="fake"
)

public class Meteringcard  implements java.io.Serializable {


    // Fields    

     private Integer meteringcardId;
     private Serviceclass serviceclass;
     private Barbershop barbershop;
     private String meteringcardName;
     private Integer meteringcardMoney;
     private Integer usecount;


    // Constructors

    /** default constructor */
    public Meteringcard() {
    }

    
    /** full constructor */
    public Meteringcard(Serviceclass serviceclass, Barbershop barbershop, String meteringcardName, Integer meteringcardMoney, Integer usecount) {
        this.serviceclass = serviceclass;
        this.barbershop = barbershop;
        this.meteringcardName = meteringcardName;
        this.meteringcardMoney = meteringcardMoney;
        this.usecount = usecount;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="meteringcard_id", unique=true, nullable=false)

    public Integer getMeteringcardId() {
        return this.meteringcardId;
    }
    
    public void setMeteringcardId(Integer meteringcardId) {
        this.meteringcardId = meteringcardId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="serviceclass_id", nullable=false)

    public Serviceclass getServiceclass() {
        return this.serviceclass;
    }
    
    public void setServiceclass(Serviceclass serviceclass) {
        this.serviceclass = serviceclass;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="s_id", nullable=false)

    public Barbershop getBarbershop() {
        return this.barbershop;
    }
    
    public void setBarbershop(Barbershop barbershop) {
        this.barbershop = barbershop;
    }
    
    @Column(name="meteringcard_name", nullable=false, length=20)

    public String getMeteringcardName() {
        return this.meteringcardName;
    }
    
    public void setMeteringcardName(String meteringcardName) {
        this.meteringcardName = meteringcardName;
    }
    
    @Column(name="meteringcard_money", nullable=false)

    public Integer getMeteringcardMoney() {
        return this.meteringcardMoney;
    }
    
    public void setMeteringcardMoney(Integer meteringcardMoney) {
        this.meteringcardMoney = meteringcardMoney;
    }
    
    @Column(name="usecount", nullable=false)

    public Integer getUsecount() {
        return this.usecount;
    }
    
    public void setUsecount(Integer usecount) {
        this.usecount = usecount;
    }
   








}