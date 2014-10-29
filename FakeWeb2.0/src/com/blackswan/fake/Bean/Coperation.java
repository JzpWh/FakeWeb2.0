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
 * Coperation entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="coperation"
    ,catalog="fake"
)

public class Coperation  implements java.io.Serializable {


    // Fields    

     private Integer coId;
     private Customer customer;
     private String coUrl;
     private String coKey;
     private String coRemoteaddr;
     private String coRemotehost;
     private String coRemoteport;
     private Timestamp coTime;


    // Constructors

    /** default constructor */
    public Coperation() {
    }

    
    /** full constructor */
    public Coperation(Customer customer, String coUrl, String coKey, String coRemoteaddr, String coRemotehost, String coRemoteport, Timestamp coTime) {
        this.customer = customer;
        this.coUrl = coUrl;
        this.coKey = coKey;
        this.coRemoteaddr = coRemoteaddr;
        this.coRemotehost = coRemotehost;
        this.coRemoteport = coRemoteport;
        this.coTime = coTime;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="co_id", unique=true, nullable=false)

    public Integer getCoId() {
        return this.coId;
    }
    
    public void setCoId(Integer coId) {
        this.coId = coId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="c_id", nullable=false)

    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    @Column(name="co_url", nullable=false, length=300)

    public String getCoUrl() {
        return this.coUrl;
    }
    
    public void setCoUrl(String coUrl) {
        this.coUrl = coUrl;
    }
    
    @Column(name="co_key", nullable=false, length=100)

    public String getCoKey() {
        return this.coKey;
    }
    
    public void setCoKey(String coKey) {
        this.coKey = coKey;
    }
    
    @Column(name="co_remoteaddr", nullable=false, length=100)

    public String getCoRemoteaddr() {
        return this.coRemoteaddr;
    }
    
    public void setCoRemoteaddr(String coRemoteaddr) {
        this.coRemoteaddr = coRemoteaddr;
    }
    
    @Column(name="co_remotehost", nullable=false, length=100)

    public String getCoRemotehost() {
        return this.coRemotehost;
    }
    
    public void setCoRemotehost(String coRemotehost) {
        this.coRemotehost = coRemotehost;
    }
    
    @Column(name="co_remoteport", nullable=false, length=14)

    public String getCoRemoteport() {
        return this.coRemoteport;
    }
    
    public void setCoRemoteport(String coRemoteport) {
        this.coRemoteport = coRemoteport;
    }
    
    @Column(name="co_time", nullable=false, length=19)

    public Timestamp getCoTime() {
        return this.coTime;
    }
    
    public void setCoTime(Timestamp coTime) {
        this.coTime = coTime;
    }
   








}