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
 * Mycollect entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="mycollect"
    ,catalog="fake"
)

public class Mycollect  implements java.io.Serializable {


    // Fields    

     private Integer collectId;
     private Customer customer;
     private String collectClass;
     private Integer bsId;
     private Timestamp collectTime;


    // Constructors

    /** default constructor */
    public Mycollect() {
    }

    
    /** full constructor */
    public Mycollect(Customer customer, String collectClass, Integer bsId, Timestamp collectTime) {
        this.customer = customer;
        this.collectClass = collectClass;
        this.bsId = bsId;
        this.collectTime = collectTime;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="collect_id", unique=true, nullable=false)

    public Integer getCollectId() {
        return this.collectId;
    }
    
    public void setCollectId(Integer collectId) {
        this.collectId = collectId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="c_id", nullable=false)

    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    @Column(name="collect_class", nullable=false, length=10)

    public String getCollectClass() {
        return this.collectClass;
    }
    
    public void setCollectClass(String collectClass) {
        this.collectClass = collectClass;
    }
    
    @Column(name="bs_id", nullable=false)

    public Integer getBsId() {
        return this.bsId;
    }
    
    public void setBsId(Integer bsId) {
        this.bsId = bsId;
    }
    
    @Column(name="collect_time", nullable=false, length=19)

    public Timestamp getCollectTime() {
        return this.collectTime;
    }
    
    public void setCollectTime(Timestamp collectTime) {
        this.collectTime = collectTime;
    }
   








}