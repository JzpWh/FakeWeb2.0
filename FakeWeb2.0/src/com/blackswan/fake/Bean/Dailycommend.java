package com.blackswan.fake.Bean;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Dailycommend entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="dailycommend"
    ,catalog="fake"
)

public class Dailycommend  implements java.io.Serializable {


    // Fields    

     private Integer dcId;
     private String dcClass;
     private String dcContent;
     private String dcUrl;
     private String dcName;
     private String dcLink;
     private Timestamp dcTime;


    // Constructors

    /** default constructor */
    public Dailycommend() {
    }

    
    /** full constructor */
    public Dailycommend(String dcClass, String dcContent, String dcUrl, String dcName, String dcLink, Timestamp dcTime) {
        this.dcClass = dcClass;
        this.dcContent = dcContent;
        this.dcUrl = dcUrl;
        this.dcName = dcName;
        this.dcLink = dcLink;
        this.dcTime = dcTime;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="dc_id", unique=true, nullable=false)

    public Integer getDcId() {
        return this.dcId;
    }
    
    public void setDcId(Integer dcId) {
        this.dcId = dcId;
    }
    
    @Column(name="dc_class", nullable=false, length=10)

    public String getDcClass() {
        return this.dcClass;
    }
    
    public void setDcClass(String dcClass) {
        this.dcClass = dcClass;
    }
    
    @Column(name="dc_content", nullable=false)

    public String getDcContent() {
        return this.dcContent;
    }
    
    public void setDcContent(String dcContent) {
        this.dcContent = dcContent;
    }
    
    @Column(name="dc_url", nullable=false, length=300)

    public String getDcUrl() {
        return this.dcUrl;
    }
    
    public void setDcUrl(String dcUrl) {
        this.dcUrl = dcUrl;
    }
    
    @Column(name="dc_name", nullable=false, length=40)

    public String getDcName() {
        return this.dcName;
    }
    
    public void setDcName(String dcName) {
        this.dcName = dcName;
    }
    
    @Column(name="dc_link", nullable=false, length=300)

    public String getDcLink() {
        return this.dcLink;
    }
    
    public void setDcLink(String dcLink) {
        this.dcLink = dcLink;
    }
    
    @Column(name="dc_time", nullable=false, length=19)

    public Timestamp getDcTime() {
        return this.dcTime;
    }
    
    public void setDcTime(Timestamp dcTime) {
        this.dcTime = dcTime;
    }
   








}