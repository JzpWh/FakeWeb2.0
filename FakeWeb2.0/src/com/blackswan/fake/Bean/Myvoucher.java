package com.blackswan.fake.Bean;

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
 * Myvoucher entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="myvoucher"
    ,catalog="fake"
)

public class Myvoucher  implements java.io.Serializable {


    // Fields    

     private Integer myvoucherId;
     private Customer customer;
     private Voucher voucher;


    // Constructors

    /** default constructor */
    public Myvoucher() {
    }

    
    /** full constructor */
    public Myvoucher(Customer customer, Voucher voucher) {
        this.customer = customer;
        this.voucher = voucher;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="myvoucher_id", unique=true, nullable=false)

    public Integer getMyvoucherId() {
        return this.myvoucherId;
    }
    
    public void setMyvoucherId(Integer myvoucherId) {
        this.myvoucherId = myvoucherId;
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
        @JoinColumn(name="voucher_id", nullable=false)

    public Voucher getVoucher() {
        return this.voucher;
    }
    
    public void setVoucher(Voucher voucher) {
        this.voucher = voucher;
    }
   








}