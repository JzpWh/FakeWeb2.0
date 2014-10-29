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
 * Cancelpreordertable entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="cancelpreordertable"
    ,catalog="fake"
)

public class Cancelpreordertable  implements java.io.Serializable {


    // Fields    

     private Integer cancelpreorderId;
     private Serviceclass serviceclass;
     private Customer customer;
     private Barbershop barbershop;
     private Barber barber;
     private Time cancelpreorderTimestart;
     private Time cancelpreorderTimeend;
     private Time ordertime;
     private Time paytime;
     private String payment;


    // Constructors

    /** default constructor */
    public Cancelpreordertable() {
    }

	/** minimal constructor */
    public Cancelpreordertable(Serviceclass serviceclass, Customer customer, Barbershop barbershop, Barber barber, Time cancelpreorderTimestart, Time cancelpreorderTimeend, Time ordertime, Time paytime) {
        this.serviceclass = serviceclass;
        this.customer = customer;
        this.barbershop = barbershop;
        this.barber = barber;
        this.cancelpreorderTimestart = cancelpreorderTimestart;
        this.cancelpreorderTimeend = cancelpreorderTimeend;
        this.ordertime = ordertime;
        this.paytime = paytime;
    }
    
    /** full constructor */
    public Cancelpreordertable(Serviceclass serviceclass, Customer customer, Barbershop barbershop, Barber barber, Time cancelpreorderTimestart, Time cancelpreorderTimeend, Time ordertime, Time paytime, String payment) {
        this.serviceclass = serviceclass;
        this.customer = customer;
        this.barbershop = barbershop;
        this.barber = barber;
        this.cancelpreorderTimestart = cancelpreorderTimestart;
        this.cancelpreorderTimeend = cancelpreorderTimeend;
        this.ordertime = ordertime;
        this.paytime = paytime;
        this.payment = payment;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="cancelpreorder_id", unique=true, nullable=false)

    public Integer getCancelpreorderId() {
        return this.cancelpreorderId;
    }
    
    public void setCancelpreorderId(Integer cancelpreorderId) {
        this.cancelpreorderId = cancelpreorderId;
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
    
    @Column(name="cancelpreorder_timestart", nullable=false, length=8)

    public Time getCancelpreorderTimestart() {
        return this.cancelpreorderTimestart;
    }
    
    public void setCancelpreorderTimestart(Time cancelpreorderTimestart) {
        this.cancelpreorderTimestart = cancelpreorderTimestart;
    }
    
    @Column(name="cancelpreorder_timeend", nullable=false, length=8)

    public Time getCancelpreorderTimeend() {
        return this.cancelpreorderTimeend;
    }
    
    public void setCancelpreorderTimeend(Time cancelpreorderTimeend) {
        this.cancelpreorderTimeend = cancelpreorderTimeend;
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