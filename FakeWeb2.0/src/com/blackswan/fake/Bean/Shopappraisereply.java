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
 * Shopappraisereply entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="shopappraisereply"
    ,catalog="fake"
)

public class Shopappraisereply  implements java.io.Serializable {


    // Fields    

     private Integer SReplyid;
     private Shopappraise shopappraise;
     private Customer customer;
     private Barbershop barbershop;
     private String SReplycontent;
     private Timestamp replytime;


    // Constructors

    /** default constructor */
    public Shopappraisereply() {
    }

	/** minimal constructor */
    public Shopappraisereply(Shopappraise shopappraise, Customer customer, Barbershop barbershop, Timestamp replytime) {
        this.shopappraise = shopappraise;
        this.customer = customer;
        this.barbershop = barbershop;
        this.replytime = replytime;
    }
    
    /** full constructor */
    public Shopappraisereply(Shopappraise shopappraise, Customer customer, Barbershop barbershop, String SReplycontent, Timestamp replytime) {
        this.shopappraise = shopappraise;
        this.customer = customer;
        this.barbershop = barbershop;
        this.SReplycontent = SReplycontent;
        this.replytime = replytime;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="s_replyid", unique=true, nullable=false)

    public Integer getSReplyid() {
        return this.SReplyid;
    }
    
    public void setSReplyid(Integer SReplyid) {
        this.SReplyid = SReplyid;
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
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="s_id", nullable=false)

    public Barbershop getBarbershop() {
        return this.barbershop;
    }
    
    public void setBarbershop(Barbershop barbershop) {
        this.barbershop = barbershop;
    }
    
    @Column(name="s_replycontent")

    public String getSReplycontent() {
        return this.SReplycontent;
    }
    
    public void setSReplycontent(String SReplycontent) {
        this.SReplycontent = SReplycontent;
    }
    
    @Column(name="replytime", nullable=false, length=19)

    public Timestamp getReplytime() {
        return this.replytime;
    }
    
    public void setReplytime(Timestamp replytime) {
        this.replytime = replytime;
    }
   








}