package com.blackswan.fake.Bean;

import java.sql.Time;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * Voucher entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="voucher"
    ,catalog="fake"
)

public class Voucher  implements java.io.Serializable {


    // Fields    

     private Integer voucherId;
     private Barbershop barbershop;
     private Integer vouchervalue;
     private String description;
     private Time starttime;
     private Time endtime;
     private Set<Myvoucher> myvouchers = new HashSet<Myvoucher>(0);


    // Constructors

    /** default constructor */
    public Voucher() {
    }

	/** minimal constructor */
    public Voucher(Barbershop barbershop, Integer vouchervalue, String description, Time starttime, Time endtime) {
        this.barbershop = barbershop;
        this.vouchervalue = vouchervalue;
        this.description = description;
        this.starttime = starttime;
        this.endtime = endtime;
    }
    
    /** full constructor */
    public Voucher(Barbershop barbershop, Integer vouchervalue, String description, Time starttime, Time endtime, Set<Myvoucher> myvouchers) {
        this.barbershop = barbershop;
        this.vouchervalue = vouchervalue;
        this.description = description;
        this.starttime = starttime;
        this.endtime = endtime;
        this.myvouchers = myvouchers;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="voucher_id", unique=true, nullable=false)

    public Integer getVoucherId() {
        return this.voucherId;
    }
    
    public void setVoucherId(Integer voucherId) {
        this.voucherId = voucherId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="s_id", nullable=false)

    public Barbershop getBarbershop() {
        return this.barbershop;
    }
    
    public void setBarbershop(Barbershop barbershop) {
        this.barbershop = barbershop;
    }
    
    @Column(name="vouchervalue", nullable=false)

    public Integer getVouchervalue() {
        return this.vouchervalue;
    }
    
    public void setVouchervalue(Integer vouchervalue) {
        this.vouchervalue = vouchervalue;
    }
    
    @Column(name="description", nullable=false)

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    @Column(name="starttime", nullable=false, length=8)

    public Time getStarttime() {
        return this.starttime;
    }
    
    public void setStarttime(Time starttime) {
        this.starttime = starttime;
    }
    
    @Column(name="endtime", nullable=false, length=8)

    public Time getEndtime() {
        return this.endtime;
    }
    
    public void setEndtime(Time endtime) {
        this.endtime = endtime;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="voucher")

    public Set<Myvoucher> getMyvouchers() {
        return this.myvouchers;
    }
    
    public void setMyvouchers(Set<Myvoucher> myvouchers) {
        this.myvouchers = myvouchers;
    }
   








}