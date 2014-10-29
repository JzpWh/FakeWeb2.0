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
 * Barberappraisepraise entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="barberappraisepraise"
    ,catalog="fake"
)

public class Barberappraisepraise  implements java.io.Serializable {


    // Fields    

     private Integer BPraiseId;
     private Customer customer;
     private Barberappraise barberappraise;
     private Timestamp BPraiseTime;


    // Constructors

    /** default constructor */
    public Barberappraisepraise() {
    }

    
    /** full constructor */
    public Barberappraisepraise(Customer customer, Barberappraise barberappraise, Timestamp BPraiseTime) {
        this.customer = customer;
        this.barberappraise = barberappraise;
        this.BPraiseTime = BPraiseTime;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="b_praise_id", unique=true, nullable=false)

    public Integer getBPraiseId() {
        return this.BPraiseId;
    }
    
    public void setBPraiseId(Integer BPraiseId) {
        this.BPraiseId = BPraiseId;
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
    
    @Column(name="b_praise_time", nullable=false, length=19)

    public Timestamp getBPraiseTime() {
        return this.BPraiseTime;
    }
    
    public void setBPraiseTime(Timestamp BPraiseTime) {
        this.BPraiseTime = BPraiseTime;
    }
   








}