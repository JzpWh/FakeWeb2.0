package com.blackswan.fake.Bean;

import java.sql.Time;
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
 * Vip entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="vip"
    ,catalog="fake"
)

public class Vip  implements java.io.Serializable {


    // Fields    

     private Integer vipId;
     private Customer customer;
     private Barbershop barbershop;
     private Vipclass vipclass;
     private Integer vipPoint;
     private Integer meteringcardIdone;
     private Integer meteringcardIdtwo;
     private Integer meteringcardIdthree;
     private Float valuecard;
     private Integer lastvalue;
     private Time lastvaluetime;
     private Integer accumulationmoney;
     private Integer lastpresent;
     private Integer remainmoney;
     private Float accumulationcosume;
     private Float perhundred;


    // Constructors

    /** default constructor */
    public Vip() {
    }

	/** minimal constructor */
    public Vip(Customer customer, Barbershop barbershop, Vipclass vipclass) {
        this.customer = customer;
        this.barbershop = barbershop;
        this.vipclass = vipclass;
    }
    
    /** full constructor */
    public Vip(Customer customer, Barbershop barbershop, Vipclass vipclass, Integer vipPoint, Integer meteringcardIdone, Integer meteringcardIdtwo, Integer meteringcardIdthree, Float valuecard, Integer lastvalue, Time lastvaluetime, Integer accumulationmoney, Integer lastpresent, Integer remainmoney, Float accumulationcosume, Float perhundred) {
        this.customer = customer;
        this.barbershop = barbershop;
        this.vipclass = vipclass;
        this.vipPoint = vipPoint;
        this.meteringcardIdone = meteringcardIdone;
        this.meteringcardIdtwo = meteringcardIdtwo;
        this.meteringcardIdthree = meteringcardIdthree;
        this.valuecard = valuecard;
        this.lastvalue = lastvalue;
        this.lastvaluetime = lastvaluetime;
        this.accumulationmoney = accumulationmoney;
        this.lastpresent = lastpresent;
        this.remainmoney = remainmoney;
        this.accumulationcosume = accumulationcosume;
        this.perhundred = perhundred;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="vip_id", unique=true, nullable=false)

    public Integer getVipId() {
        return this.vipId;
    }
    
    public void setVipId(Integer vipId) {
        this.vipId = vipId;
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
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="vipclass_id", nullable=false)

    public Vipclass getVipclass() {
        return this.vipclass;
    }
    
    public void setVipclass(Vipclass vipclass) {
        this.vipclass = vipclass;
    }
    
    @Column(name="vip_point")

    public Integer getVipPoint() {
        return this.vipPoint;
    }
    
    public void setVipPoint(Integer vipPoint) {
        this.vipPoint = vipPoint;
    }
    
    @Column(name="meteringcard_idone")

    public Integer getMeteringcardIdone() {
        return this.meteringcardIdone;
    }
    
    public void setMeteringcardIdone(Integer meteringcardIdone) {
        this.meteringcardIdone = meteringcardIdone;
    }
    
    @Column(name="meteringcard_idtwo")

    public Integer getMeteringcardIdtwo() {
        return this.meteringcardIdtwo;
    }
    
    public void setMeteringcardIdtwo(Integer meteringcardIdtwo) {
        this.meteringcardIdtwo = meteringcardIdtwo;
    }
    
    @Column(name="meteringcard_idthree")

    public Integer getMeteringcardIdthree() {
        return this.meteringcardIdthree;
    }
    
    public void setMeteringcardIdthree(Integer meteringcardIdthree) {
        this.meteringcardIdthree = meteringcardIdthree;
    }
    
    @Column(name="valuecard", precision=12, scale=0)

    public Float getValuecard() {
        return this.valuecard;
    }
    
    public void setValuecard(Float valuecard) {
        this.valuecard = valuecard;
    }
    
    @Column(name="lastvalue")

    public Integer getLastvalue() {
        return this.lastvalue;
    }
    
    public void setLastvalue(Integer lastvalue) {
        this.lastvalue = lastvalue;
    }
    
    @Column(name="lastvaluetime", length=8)

    public Time getLastvaluetime() {
        return this.lastvaluetime;
    }
    
    public void setLastvaluetime(Time lastvaluetime) {
        this.lastvaluetime = lastvaluetime;
    }
    
    @Column(name="accumulationmoney")

    public Integer getAccumulationmoney() {
        return this.accumulationmoney;
    }
    
    public void setAccumulationmoney(Integer accumulationmoney) {
        this.accumulationmoney = accumulationmoney;
    }
    
    @Column(name="lastpresent")

    public Integer getLastpresent() {
        return this.lastpresent;
    }
    
    public void setLastpresent(Integer lastpresent) {
        this.lastpresent = lastpresent;
    }
    
    @Column(name="remainmoney")

    public Integer getRemainmoney() {
        return this.remainmoney;
    }
    
    public void setRemainmoney(Integer remainmoney) {
        this.remainmoney = remainmoney;
    }
    
    @Column(name="accumulationcosume", precision=12, scale=0)

    public Float getAccumulationcosume() {
        return this.accumulationcosume;
    }
    
    public void setAccumulationcosume(Float accumulationcosume) {
        this.accumulationcosume = accumulationcosume;
    }
    
    @Column(name="perhundred", precision=12, scale=0)

    public Float getPerhundred() {
        return this.perhundred;
    }
    
    public void setPerhundred(Float perhundred) {
        this.perhundred = perhundred;
    }
   








}