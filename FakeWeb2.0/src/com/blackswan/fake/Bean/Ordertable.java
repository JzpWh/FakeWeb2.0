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
 * Ordertable entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="ordertable"
    ,catalog="fake"
)

public class Ordertable  implements java.io.Serializable {


    // Fields    

     private Integer orderId;
     private Serviceclass serviceclass;
     private Customer customer;
     private Barbershop barbershop;
     private Barber barber;
     private Time orderTimestart;
     private Time orderTimeend;
     private Time ordertime;
     private Time paytime;
     private String appraisetime;
     private String payment;


    // Constructors

    /** default constructor */
    public Ordertable() {
    }

	/** minimal constructor */
    public Ordertable(Serviceclass serviceclass, Customer customer, Barbershop barbershop, Barber barber, Time orderTimestart, Time orderTimeend, Time ordertime, Time paytime) {
        this.serviceclass = serviceclass;
        this.customer = customer;
        this.barbershop = barbershop;
        this.barber = barber;
        this.orderTimestart = orderTimestart;
        this.orderTimeend = orderTimeend;
        this.ordertime = ordertime;
        this.paytime = paytime;
    }
    
    /** full constructor */
    public Ordertable(Serviceclass serviceclass, Customer customer, Barbershop barbershop, Barber barber, Time orderTimestart, Time orderTimeend, Time ordertime, Time paytime, String appraisetime, String payment) {
        this.serviceclass = serviceclass;
        this.customer = customer;
        this.barbershop = barbershop;
        this.barber = barber;
        this.orderTimestart = orderTimestart;
        this.orderTimeend = orderTimeend;
        this.ordertime = ordertime;
        this.paytime = paytime;
        this.appraisetime = appraisetime;
        this.payment = payment;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="order_id", unique=true, nullable=false)

    public Integer getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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
    
    @Column(name="order_timestart", nullable=false, length=8)

    public Time getOrderTimestart() {
        return this.orderTimestart;
    }
    
    public void setOrderTimestart(Time orderTimestart) {
        this.orderTimestart = orderTimestart;
    }
    
    @Column(name="order_timeend", nullable=false, length=8)

    public Time getOrderTimeend() {
        return this.orderTimeend;
    }
    
    public void setOrderTimeend(Time orderTimeend) {
        this.orderTimeend = orderTimeend;
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
    
    @Column(name="appraisetime", length=20)

    public String getAppraisetime() {
        return this.appraisetime;
    }
    
    public void setAppraisetime(String appraisetime) {
        this.appraisetime = appraisetime;
    }
    
    @Column(name="payment", length=20)

    public String getPayment() {
        return this.payment;
    }
    
    public void setPayment(String payment) {
        this.payment = payment;
    }
   








}