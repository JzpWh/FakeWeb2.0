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
 * Barberappraisetread entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="barberappraisetread"
    ,catalog="fake"
)

public class Barberappraisetread  implements java.io.Serializable {


    // Fields    

     private Integer BApId;
     private Customer customer;
     private Barberappraise barberappraise;
     private Timestamp BTreadTime;


    // Constructors

    /** default constructor */
    public Barberappraisetread() {
    }

    
    /** full constructor */
    public Barberappraisetread(Customer customer, Barberappraise barberappraise, Timestamp BTreadTime) {
        this.customer = customer;
        this.barberappraise = barberappraise;
        this.BTreadTime = BTreadTime;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="b_ap_id", unique=true, nullable=false)

    public Integer getBApId() {
        return this.BApId;
    }
    
    public void setBApId(Integer BApId) {
        this.BApId = BApId;
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
        @JoinColumn(name="b_a_id", nullable=false)

    public Barberappraise getBarberappraise() {
        return this.barberappraise;
    }
    
    public void setBarberappraise(Barberappraise barberappraise) {
        this.barberappraise = barberappraise;
    }
    
    @Column(name="b_tread_time", nullable=false, length=19)

    public Timestamp getBTreadTime() {
        return this.BTreadTime;
    }
    
    public void setBTreadTime(Timestamp BTreadTime) {
        this.BTreadTime = BTreadTime;
    }
   








}