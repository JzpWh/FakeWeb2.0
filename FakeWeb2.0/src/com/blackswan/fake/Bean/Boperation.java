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
 * Boperation entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="boperation"
    ,catalog="fake"
)

public class Boperation  implements java.io.Serializable {


    // Fields    

     private Integer boId;
     private Barber barber;
     private String boUrl;
     private String boKey;
     private String boRemoteaddr;
     private String boRemotehost;
     private String boRemoteport;
     private Timestamp boTime;


    // Constructors

    /** default constructor */
    public Boperation() {
    }

    
    /** full constructor */
    public Boperation(Barber barber, String boUrl, String boKey, String boRemoteaddr, String boRemotehost, String boRemoteport, Timestamp boTime) {
        this.barber = barber;
        this.boUrl = boUrl;
        this.boKey = boKey;
        this.boRemoteaddr = boRemoteaddr;
        this.boRemotehost = boRemotehost;
        this.boRemoteport = boRemoteport;
        this.boTime = boTime;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="bo_id", unique=true, nullable=false)

    public Integer getBoId() {
        return this.boId;
    }
    
    public void setBoId(Integer boId) {
        this.boId = boId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="b_id", nullable=false)

    public Barber getBarber() {
        return this.barber;
    }
    
    public void setBarber(Barber barber) {
        this.barber = barber;
    }
    
    @Column(name="bo_url", nullable=false, length=300)

    public String getBoUrl() {
        return this.boUrl;
    }
    
    public void setBoUrl(String boUrl) {
        this.boUrl = boUrl;
    }
    
    @Column(name="bo_key", nullable=false, length=100)

    public String getBoKey() {
        return this.boKey;
    }
    
    public void setBoKey(String boKey) {
        this.boKey = boKey;
    }
    
    @Column(name="bo_remoteaddr", nullable=false, length=100)

    public String getBoRemoteaddr() {
        return this.boRemoteaddr;
    }
    
    public void setBoRemoteaddr(String boRemoteaddr) {
        this.boRemoteaddr = boRemoteaddr;
    }
    
    @Column(name="bo_remotehost", nullable=false, length=100)

    public String getBoRemotehost() {
        return this.boRemotehost;
    }
    
    public void setBoRemotehost(String boRemotehost) {
        this.boRemotehost = boRemotehost;
    }
    
    @Column(name="bo_remoteport", nullable=false, length=14)

    public String getBoRemoteport() {
        return this.boRemoteport;
    }
    
    public void setBoRemoteport(String boRemoteport) {
        this.boRemoteport = boRemoteport;
    }
    
    @Column(name="bo_time", nullable=false, length=19)

    public Timestamp getBoTime() {
        return this.boTime;
    }
    
    public void setBoTime(Timestamp boTime) {
        this.boTime = boTime;
    }
   








}