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
 * Shopappraisepraise entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="shopappraisepraise"
    ,catalog="fake"
)

public class Shopappraisepraise  implements java.io.Serializable {


    // Fields    

     private Integer SPraiseId;
     private Shopappraise shopappraise;
     private Customer customer;
     private Timestamp SPraiseTime;


    // Constructors

    /** default constructor */
    public Shopappraisepraise() {
    }

    
    /** full constructor */
    public Shopappraisepraise(Shopappraise shopappraise, Customer customer, Timestamp SPraiseTime) {
        this.shopappraise = shopappraise;
        this.customer = customer;
        this.SPraiseTime = SPraiseTime;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="s_praise_id", unique=true, nullable=false)

    public Integer getSPraiseId() {
        return this.SPraiseId;
    }
    
    public void setSPraiseId(Integer SPraiseId) {
        this.SPraiseId = SPraiseId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="s_a_id", nullable=false)

    public Shopappraise getShopappraise() {
        return this.shopappraise;
    }
    
    public void setShopappraise(Shopappraise shopappraise) {
        this.shopappraise = shopappraise;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="c_id", nullable=false)

    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    @Column(name="s_praise_time", nullable=false, length=19)

    public Timestamp getSPraiseTime() {
        return this.SPraiseTime;
    }
    
    public void setSPraiseTime(Timestamp SPraiseTime) {
        this.SPraiseTime = SPraiseTime;
    }
   








}