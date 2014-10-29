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
 * Shopappraisestamp entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="shopappraisestamp"
    ,catalog="fake"
)

public class Shopappraisestamp  implements java.io.Serializable {


    // Fields    

     private Integer SStampId;
     private Shopappraise shopappraise;
     private Customer customer;
     private Timestamp SStampTime;


    // Constructors

    /** default constructor */
    public Shopappraisestamp() {
    }

    
    /** full constructor */
    public Shopappraisestamp(Shopappraise shopappraise, Customer customer, Timestamp SStampTime) {
        this.shopappraise = shopappraise;
        this.customer = customer;
        this.SStampTime = SStampTime;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="s_stamp_id", unique=true, nullable=false)

    public Integer getSStampId() {
        return this.SStampId;
    }
    
    public void setSStampId(Integer SStampId) {
        this.SStampId = SStampId;
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
    
    @Column(name="s_stamp_time", nullable=false, length=19)

    public Timestamp getSStampTime() {
        return this.SStampTime;
    }
    
    public void setSStampTime(Timestamp SStampTime) {
        this.SStampTime = SStampTime;
    }
   








}