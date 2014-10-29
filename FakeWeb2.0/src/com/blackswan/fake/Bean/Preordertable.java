package com.blackswan.fake.Bean;

import java.sql.Time;
import java.sql.Timestamp;
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
 * Preordertable entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="preordertable"
    ,catalog="fake"
)

public class Preordertable  implements java.io.Serializable {


    // Fields    

     private Integer preorderId;
     private Serviceclass serviceclass;
     private Customer customer;
     private Barbershop barbershop;
     private Barber barber;
     private Time preorderTimestart;
     private Time preorderTimeend;
     private Timestamp ordertime;
     private Boolean isagree;
     private Boolean ispay;
     private Time paytime;
     private String orderstate;
     private String payment;


    // Constructors

    /** default constructor */
    public Preordertable() {
    }

	/** minimal constructor */
    public Preordertable(Serviceclass serviceclass, Customer customer, Barbershop barbershop, Barber barber, Time preorderTimestart, Time preorderTimeend, Timestamp ordertime, Boolean isagree, Boolean ispay) {
        this.serviceclass = serviceclass;
        this.customer = customer;
        this.barbershop = barbershop;
        this.barber = barber;
        this.preorderTimestart = preorderTimestart;
        this.preorderTimeend = preorderTimeend;
        this.ordertime = ordertime;
        this.isagree = isagree;
        this.ispay = ispay;
    }
    
    /** full constructor */
    public Preordertable(Serviceclass serviceclass, Customer customer, Barbershop barbershop, Barber barber, Time preorderTimestart, Time preorderTimeend, Timestamp ordertime, Boolean isagree, Boolean ispay, Time paytime, String orderstate, String payment) {
        this.serviceclass = serviceclass;
        this.customer = customer;
        this.barbershop = barbershop;
        this.barber = barber;
        this.preorderTimestart = preorderTimestart;
        this.preorderTimeend = preorderTimeend;
        this.ordertime = ordertime;
        this.isagree = isagree;
        this.ispay = ispay;
        this.paytime = paytime;
        this.orderstate = orderstate;
        this.payment = payment;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="preorder_id", unique=true, nullable=false)

    public Integer getPreorderId() {
        return this.preorderId;
    }
    
    public void setPreorderId(Integer preorderId) {
        this.preorderId = preorderId;
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
        @JoinColumn(name="b_id", nullable=false)

    public Barber getBarber() {
        return this.barber;
    }
    
    public void setBarber(Barber barber) {
        this.barber = barber;
    }
    
    @Column(name="preorder_timestart", nullable=false, length=8)

    public Time getPreorderTimestart() {
        return this.preorderTimestart;
    }
    
    public void setPreorderTimestart(Time preorderTimestart) {
        this.preorderTimestart = preorderTimestart;
    }
    
    @Column(name="preorder_timeend", nullable=false, length=8)

    public Time getPreorderTimeend() {
        return this.preorderTimeend;
    }
    
    public void setPreorderTimeend(Time preorderTimeend) {
        this.preorderTimeend = preorderTimeend;
    }
    
    @Column(name="ordertime", nullable=false, length=19)

    public Timestamp getOrdertime() {
        return this.ordertime;
    }
    
    public void setOrdertime(Timestamp ordertime) {
        this.ordertime = ordertime;
    }
    
    @Column(name="isagree", nullable=false)

    public Boolean getIsagree() {
        return this.isagree;
    }
    
    public void setIsagree(Boolean isagree) {
        this.isagree = isagree;
    }
    
    @Column(name="ispay", nullable=false)

    public Boolean getIspay() {
        return this.ispay;
    }
    
    public void setIspay(Boolean ispay) {
        this.ispay = ispay;
    }
    
    @Column(name="paytime", length=8)

    public Time getPaytime() {
        return this.paytime;
    }
    
    public void setPaytime(Time paytime) {
        this.paytime = paytime;
    }
    
    @Column(name="orderstate", length=20)

    public String getOrderstate() {
        return this.orderstate;
    }
    
    public void setOrderstate(String orderstate) {
        this.orderstate = orderstate;
    }
    
    @Column(name="payment", length=20)

    public String getPayment() {
        return this.payment;
    }
    
    public void setPayment(String payment) {
        this.payment = payment;
    }
   








}