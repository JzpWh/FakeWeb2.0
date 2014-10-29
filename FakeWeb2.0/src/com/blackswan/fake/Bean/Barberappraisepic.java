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
 * Barberappraisepic entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="barberappraisepic"
    ,catalog="fake"
)

public class Barberappraisepic  implements java.io.Serializable {


    // Fields    

     private Integer BApicId;
     private Barberappraise barberappraise;
     private String BApicName;
     private String BApicPath;


    // Constructors

    /** default constructor */
    public Barberappraisepic() {
    }

	/** minimal constructor */
    public Barberappraisepic(Barberappraise barberappraise, String BApicPath) {
        this.barberappraise = barberappraise;
        this.BApicPath = BApicPath;
    }
    
    /** full constructor */
    public Barberappraisepic(Barberappraise barberappraise, String BApicName, String BApicPath) {
        this.barberappraise = barberappraise;
        this.BApicName = BApicName;
        this.BApicPath = BApicPath;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="b_apic_id", unique=true, nullable=false)

    public Integer getBApicId() {
        return this.BApicId;
    }
    
    public void setBApicId(Integer BApicId) {
        this.BApicId = BApicId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="b_a_id", nullable=false)

    public Barberappraise getBarberappraise() {
        return this.barberappraise;
    }
    
    public void setBarberappraise(Barberappraise barberappraise) {
        this.barberappraise = barberappraise;
    }
    
    @Column(name="b_apic_name", length=30)

    public String getBApicName() {
        return this.BApicName;
    }
    
    public void setBApicName(String BApicName) {
        this.BApicName = BApicName;
    }
    
    @Column(name="b_apic_path", nullable=false, length=100)

    public String getBApicPath() {
        return this.BApicPath;
    }
    
    public void setBApicPath(String BApicPath) {
        this.BApicPath = BApicPath;
    }
   








}