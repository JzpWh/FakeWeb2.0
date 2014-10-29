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
 * Adoperation entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="adoperation"
    ,catalog="fake"
)

public class Adoperation  implements java.io.Serializable {


    // Fields    

     private Integer OId;
     private Administrator administrator;
     private String OUrl;
     private String OKey;
     private String ORemoteaddr;
     private String ORemotehost;
     private String ORemoteport;
     private Timestamp OTime;


    // Constructors

    /** default constructor */
    public Adoperation() {
    }

    
    /** full constructor */
    public Adoperation(Administrator administrator, String OUrl, String OKey, String ORemoteaddr, String ORemotehost, String ORemoteport, Timestamp OTime) {
        this.administrator = administrator;
        this.OUrl = OUrl;
        this.OKey = OKey;
        this.ORemoteaddr = ORemoteaddr;
        this.ORemotehost = ORemotehost;
        this.ORemoteport = ORemoteport;
        this.OTime = OTime;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="o_id", unique=true, nullable=false)

    public Integer getOId() {
        return this.OId;
    }
    
    public void setOId(Integer OId) {
        this.OId = OId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ad_id", nullable=false)

    public Administrator getAdministrator() {
        return this.administrator;
    }
    
    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }
    
    @Column(name="o_url", nullable=false, length=300)

    public String getOUrl() {
        return this.OUrl;
    }
    
    public void setOUrl(String OUrl) {
        this.OUrl = OUrl;
    }
    
    @Column(name="o_key", nullable=false, length=100)

    public String getOKey() {
        return this.OKey;
    }
    
    public void setOKey(String OKey) {
        this.OKey = OKey;
    }
    
    @Column(name="o_remoteaddr", nullable=false, length=100)

    public String getORemoteaddr() {
        return this.ORemoteaddr;
    }
    
    public void setORemoteaddr(String ORemoteaddr) {
        this.ORemoteaddr = ORemoteaddr;
    }
    
    @Column(name="o_remotehost", nullable=false, length=100)

    public String getORemotehost() {
        return this.ORemotehost;
    }
    
    public void setORemotehost(String ORemotehost) {
        this.ORemotehost = ORemotehost;
    }
    
    @Column(name="o_remoteport", nullable=false, length=14)

    public String getORemoteport() {
        return this.ORemoteport;
    }
    
    public void setORemoteport(String ORemoteport) {
        this.ORemoteport = ORemoteport;
    }
    
    @Column(name="o_time", nullable=false, length=19)

    public Timestamp getOTime() {
        return this.OTime;
    }
    
    public void setOTime(Timestamp OTime) {
        this.OTime = OTime;
    }
   








}