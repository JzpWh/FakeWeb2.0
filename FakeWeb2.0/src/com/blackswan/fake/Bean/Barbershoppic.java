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
 * Barbershoppic entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="barbershoppic"
    ,catalog="fake"
)

public class Barbershoppic  implements java.io.Serializable {


    // Fields    

     private Integer SPId;
     private Barbershop barbershop;
     private String SPName;
     private String SPDis;
     private String SPPath;


    // Constructors

    /** default constructor */
    public Barbershoppic() {
    }

	/** minimal constructor */
    public Barbershoppic(Barbershop barbershop, String SPPath) {
        this.barbershop = barbershop;
        this.SPPath = SPPath;
    }
    
    /** full constructor */
    public Barbershoppic(Barbershop barbershop, String SPName, String SPDis, String SPPath) {
        this.barbershop = barbershop;
        this.SPName = SPName;
        this.SPDis = SPDis;
        this.SPPath = SPPath;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="s_p_id", unique=true, nullable=false)

    public Integer getSPId() {
        return this.SPId;
    }
    
    public void setSPId(Integer SPId) {
        this.SPId = SPId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="s_id", nullable=false)

    public Barbershop getBarbershop() {
        return this.barbershop;
    }
    
    public void setBarbershop(Barbershop barbershop) {
        this.barbershop = barbershop;
    }
    
    @Column(name="s_p_name", length=20)

    public String getSPName() {
        return this.SPName;
    }
    
    public void setSPName(String SPName) {
        this.SPName = SPName;
    }
    
    @Column(name="s_p_dis")

    public String getSPDis() {
        return this.SPDis;
    }
    
    public void setSPDis(String SPDis) {
        this.SPDis = SPDis;
    }
    
    @Column(name="s_p_path", nullable=false, length=100)

    public String getSPPath() {
        return this.SPPath;
    }
    
    public void setSPPath(String SPPath) {
        this.SPPath = SPPath;
    }
   








}