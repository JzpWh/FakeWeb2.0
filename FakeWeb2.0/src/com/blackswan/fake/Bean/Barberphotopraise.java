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
 * Barberphotopraise entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="barberphotopraise"
    ,catalog="fake"
)

public class Barberphotopraise  implements java.io.Serializable {


    // Fields    

     private Integer BPpId;
     private Barberphoto barberphoto;
     private Customer customer;
     private Timestamp BPpTime;


    // Constructors

    /** default constructor */
    public Barberphotopraise() {
    }

    
    /** full constructor */
    public Barberphotopraise(Barberphoto barberphoto, Customer customer, Timestamp BPpTime) {
        this.barberphoto = barberphoto;
        this.customer = customer;
        this.BPpTime = BPpTime;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="b_pp_id", unique=true, nullable=false)

    public Integer getBPpId() {
        return this.BPpId;
    }
    
    public void setBPpId(Integer BPpId) {
        this.BPpId = BPpId;
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
    
    @Column(name="b_pp_time", nullable=false, length=19)

    public Timestamp getBPpTime() {
        return this.BPpTime;
    }
    
    public void setBPpTime(Timestamp BPpTime) {
        this.BPpTime = BPpTime;
    }
   








}