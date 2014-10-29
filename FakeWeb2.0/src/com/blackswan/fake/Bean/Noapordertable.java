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
 * Noapordertable entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="noapordertable"
    ,catalog="fake"
)

public class Noapordertable  implements java.io.Serializable {


    // Fields    

     private Integer noaporderId;
     private Serviceclass serviceclass;
     private Customer customer;
     private Barbershop barbershop;
     private Barber barber;
     private Time noaporderTimestart;
     private Time noaporderTimeend;
     private Time ordertime;
     private Time paytime;
     private String payment;


    // Constructors

    /** default constructor */
    public Noapordertable() {
    }

	/** minimal constructor */
    public Noapordertable(Serviceclass serviceclass, Customer customer, Barbershop barbershop, Barber barber, Time noaporderTimestart, Time noaporderTimeend, Time ordertime, Time paytime) {
        this.serviceclass = serviceclass;
        this.customer = customer;
        this.barbershop = barbershop;
        this.barber = barber;
        this.noaporderTimestart = noaporderTimestart;
        this.noaporderTimeend = noaporderTimeend;
        this.ordertime = ordertime;
        this.paytime = paytime;
    }
    
    /** full constructor */
    public Noapordertable(Serviceclass serviceclass, Customer customer, Barbershop barbershop, Barber barber, Time noaporderTimestart, Time noaporderTimeend, Time ordertime, Time paytime, String payment) {
        this.serviceclass = serviceclass;
        this.customer = customer;
        this.barbershop = barbershop;
        this.barber = barber;
        this.noaporderTimestart = noaporderTimestart;
        this.noaporderTimeend = noaporderTimeend;
        this.ordertime = ordertime;
        this.paytime = paytime;
        this.payment = payment;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="noaporder_id", unique=true, nullable=false)

    public Integer getNoaporderId() {
        return this.noaporderId;
    }
    
    public void setNoaporderId(Integer noaporderId) {
        this.noaporderId = noaporderId;
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
    
    @Column(name="noaporder_timestart", nullable=false, length=8)

    public Time getNoaporderTimestart() {
        return this.noaporderTimestart;
    }
    
    public void setNoaporderTimestart(Time noaporderTimestart) {
        this.noaporderTimestart = noaporderTimestart;
    }
    
    @Column(name="noaporder_timeend", nullable=false, length=8)

    public Time getNoaporderTimeend() {
        return this.noaporderTimeend;
    }
    
    public void setNoaporderTimeend(Time noaporderTimeend) {
        this.noaporderTimeend = noaporderTimeend;
    }
    
    @Column(name="ordertime", nullable=false, length=8)

    public Time getOrdertime() {
        return this.ordertime;
    }
    
    public void setOrdertime(Time ordertime) {
        this.ordertime = ordertime;
    }
    
    @Column(name="paytime", nullable=false, length=8)

    public Time getPaytime() {
        return this.paytime;
    }
    
    public void setPaytime(Time paytime) {
        this.paytime = paytime;
    }
    
    @Column(name="payment", length=20)

    public String getPayment() {
        return this.payment;
    }
    
    public void setPayment(String payment) {
        this.payment = payment;
    }
   








}