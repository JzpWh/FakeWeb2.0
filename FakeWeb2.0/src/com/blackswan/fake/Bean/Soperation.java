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
 * Soperation entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="soperation"
    ,catalog="fake"
)

public class Soperation  implements java.io.Serializable {


    // Fields    

     private Integer soId;
     private Barbershop barbershop;
     private String soUrl;
     private String soKey;
     private String soRemoteaddr;
     private String soRemotehost;
     private String soRemoteport;
     private Timestamp soTime;


    // Constructors

    /** default constructor */
    public Soperation() {
    }

    
    /** full constructor */
    public Soperation(Barbershop barbershop, String soUrl, String soKey, String soRemoteaddr, String soRemotehost, String soRemoteport, Timestamp soTime) {
        this.barbershop = barbershop;
        this.soUrl = soUrl;
        this.soKey = soKey;
        this.soRemoteaddr = soRemoteaddr;
        this.soRemotehost = soRemotehost;
        this.soRemoteport = soRemoteport;
        this.soTime = soTime;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="so_id", unique=true, nullable=false)

    public Integer getSoId() {
        return this.soId;
    }
    
    public void setSoId(Integer soId) {
        this.soId = soId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="s_id", nullable=false)

    public Barbershop getBarbershop() {
        return this.barbershop;
    }
    
    public void setBarbershop(Barbershop barbershop) {
        this.barbershop = barbershop;
    }
    
    @Column(name="so_url", nullable=false, length=300)

    public String getSoUrl() {
        return this.soUrl;
    }
    
    public void setSoUrl(String soUrl) {
        this.soUrl = soUrl;
    }
    
    @Column(name="so_key", nullable=false, length=100)

    public String getSoKey() {
        return this.soKey;
    }
    
    public void setSoKey(String soKey) {
        this.soKey = soKey;
    }
    
    @Column(name="so_remoteaddr", nullable=false, length=100)

    public String getSoRemoteaddr() {
        return this.soRemoteaddr;
    }
    
    public void setSoRemoteaddr(String soRemoteaddr) {
        this.soRemoteaddr = soRemoteaddr;
    }
    
    @Column(name="so_remotehost", nullable=false, length=100)

    public String getSoRemotehost() {
        return this.soRemotehost;
    }
    
    public void setSoRemotehost(String soRemotehost) {
        this.soRemotehost = soRemotehost;
    }
    
    @Column(name="so_remoteport", nullable=false, length=14)

    public String getSoRemoteport() {
        return this.soRemoteport;
    }
    
    public void setSoRemoteport(String soRemoteport) {
        this.soRemoteport = soRemoteport;
    }
    
    @Column(name="so_time", nullable=false, length=19)

    public Timestamp getSoTime() {
        return this.soTime;
    }
    
    public void setSoTime(Timestamp soTime) {
        this.soTime = soTime;
    }
   








}