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
 * Topicpic entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="topicpic"
    ,catalog="fake"
)

public class Topicpic  implements java.io.Serializable {


    // Fields    

     private Integer TPicId;
     private Topic topic;
     private String TPicName;
     private String TPicPath;


    // Constructors

    /** default constructor */
    public Topicpic() {
    }

	/** minimal constructor */
    public Topicpic(Topic topic, String TPicPath) {
        this.topic = topic;
        this.TPicPath = TPicPath;
    }
    
    /** full constructor */
    public Topicpic(Topic topic, String TPicName, String TPicPath) {
        this.topic = topic;
        this.TPicName = TPicName;
        this.TPicPath = TPicPath;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="t_pic_id", unique=true, nullable=false)

    public Integer getTPicId() {
        return this.TPicId;
    }
    
    public void setTPicId(Integer TPicId) {
        this.TPicId = TPicId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="topic_id", nullable=false)

    public Topic getTopic() {
        return this.topic;
    }
    
    public void setTopic(Topic topic) {
        this.topic = topic;
    }
    
    @Column(name="t_pic_name", length=30)

    public String getTPicName() {
        return this.TPicName;
    }
    
    public void setTPicName(String TPicName) {
        this.TPicName = TPicName;
    }
    
    @Column(name="t_pic_path", nullable=false, length=100)

    public String getTPicPath() {
        return this.TPicPath;
    }
    
    public void setTPicPath(String TPicPath) {
        this.TPicPath = TPicPath;
    }
   








}