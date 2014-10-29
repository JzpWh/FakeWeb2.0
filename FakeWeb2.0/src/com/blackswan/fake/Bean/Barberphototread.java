package com.blackswan.fake.Bean;

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
 * Barberphototread entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="barberphototread"
    ,catalog="fake"
)

public class Barberphototread  implements java.io.Serializable {


    // Fields    

     private Integer BPtId;
     private Barberphoto barberphoto;
     private Customer customer;
     private Timestamp BPtTime;
     private Integer BId;


    // Constructors

    /** default constructor */
    public Barberphototread() {
    }

    
    /** full constructor */
    public Barberphototread(Barberphoto barberphoto, Customer customer, Timestamp BPtTime, Integer BId) {
        this.barberphoto = barberphoto;
        this.customer = customer;
        this.BPtTime = BPtTime;
        this.BId = BId;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="b_pt_id", unique=true, nullable=false)

    public Integer getBPtId() {
        return this.BPtId;
    }
    
    public void setBPtId(Integer BPtId) {
        this.BPtId = BPtId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="b_p_id", nullable=false)

    public Barberphoto getBarberphoto() {
        return this.barberphoto;
    }
    
    public void setBarberphoto(Barberphoto barberphoto) {
        this.barberphoto = barberphoto;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="c_id", nullable=false)

    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    @Column(name="b_pt_time", nullable=false, length=19)

    public Timestamp getBPtTime() {
        return this.BPtTime;
    }
    
    public void setBPtTime(Timestamp BPtTime) {
        this.BPtTime = BPtTime;
    }
    
    @Column(name="b_id", nullable=false)

    public Integer getBId() {
        return this.BId;
    }
    
    public void setBId(Integer BId) {
        this.BId = BId;
    }
   








}