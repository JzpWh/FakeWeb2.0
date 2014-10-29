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
 * Transmit entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="transmit"
    ,catalog="fake"
)

public class Transmit  implements java.io.Serializable {


    // Fields    

     private Integer transmitId;
     private Topic topic;
     private String transmitStatus;
     private Integer transmitstatusId;
     private String authorStatus;
     private Integer authorId;
     private Timestamp transmitTime;


    // Constructors

    /** default constructor */
    public Transmit() {
    }

    
    /** full constructor */
    public Transmit(Topic topic, String transmitStatus, Integer transmitstatusId, String authorStatus, Integer authorId, Timestamp transmitTime) {
        this.topic = topic;
        this.transmitStatus = transmitStatus;
        this.transmitstatusId = transmitstatusId;
        this.authorStatus = authorStatus;
        this.authorId = authorId;
        this.transmitTime = transmitTime;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="transmit_id", unique=true, nullable=false)

    public Integer getTransmitId() {
        return this.transmitId;
    }
    
    public void setTransmitId(Integer transmitId) {
        this.transmitId = transmitId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="topic_id", nullable=false)

    public Topic getTopic() {
        return this.topic;
    }
    
    public void setTopic(Topic topic) {
        this.topic = topic;
    }
    
    @Column(name="transmit_status", nullable=false, length=10)

    public String getTransmitStatus() {
        return this.transmitStatus;
    }
    
    public void setTransmitStatus(String transmitStatus) {
        this.transmitStatus = transmitStatus;
    }
    
    @Column(name="transmitstatus_id", nullable=false)

    public Integer getTransmitstatusId() {
        return this.transmitstatusId;
    }
    
    public void setTransmitstatusId(Integer transmitstatusId) {
        this.transmitstatusId = transmitstatusId;
    }
    
    @Column(name="author_status", nullable=false, length=10)

    public String getAuthorStatus() {
        return this.authorStatus;
    }
    
    public void setAuthorStatus(String authorStatus) {
        this.authorStatus = authorStatus;
    }
    
    @Column(name="author_id", nullable=false)

    public Integer getAuthorId() {
        return this.authorId;
    }
    
    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }
    
    @Column(name="transmit_time", nullable=false, length=19)

    public Timestamp getTransmitTime() {
        return this.transmitTime;
    }
    
    public void setTransmitTime(Timestamp transmitTime) {
        this.transmitTime = transmitTime;
    }
   








}