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
 * Barberappraisereply entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="barberappraisereply"
    ,catalog="fake"
)

public class Barberappraisereply  implements java.io.Serializable {


    // Fields    

     private Integer BReplyid;
     private Customer customer;
     private Barber barber;
     private Barberappraise barberappraise;
     private String BReplycontent;
     private Timestamp replytime;


    // Constructors

    /** default constructor */
    public Barberappraisereply() {
    }

    
    /** full constructor */
    public Barberappraisereply(Customer customer, Barber barber, Barberappraise barberappraise, String BReplycontent, Timestamp replytime) {
        this.customer = customer;
        this.barber = barber;
        this.barberappraise = barberappraise;
        this.BReplycontent = BReplycontent;
        this.replytime = replytime;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="b_replyid", unique=true, nullable=false)

    public Integer getBReplyid() {
        return this.BReplyid;
    }
    
    public void setBReplyid(Integer BReplyid) {
        this.BReplyid = BReplyid;
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
        @JoinColumn(name="b_id", nullable=false)

    public Barber getBarber() {
        return this.barber;
    }
    
    public void setBarber(Barber barber) {
        this.barber = barber;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="b_a_id", nullable=false)

    public Barberappraise getBarberappraise() {
        return this.barberappraise;
    }
    
    public void setBarberappraise(Barberappraise barberappraise) {
        this.barberappraise = barberappraise;
    }
    
    @Column(name="b_replycontent", nullable=false)

    public String getBReplycontent() {
        return this.BReplycontent;
    }
    
    public void setBReplycontent(String BReplycontent) {
        this.BReplycontent = BReplycontent;
    }
    
    @Column(name="replytime", nullable=false, length=19)

    public Timestamp getReplytime() {
        return this.replytime;
    }
    
    public void setReplytime(Timestamp replytime) {
        this.replytime = replytime;
    }
   








}