package com.blackswan.fake.Bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


/**
 * Barber entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="barber"
    ,catalog="fake"
, uniqueConstraints = @UniqueConstraint(columnNames="b_name")
)

public class Barber  implements java.io.Serializable {


    // Fields    

     private Integer BId;
     private Begoodathair begoodathairByHsIdfour;
     private Begoodathair begoodathairByHsIdthree;
     private Barbershop barbershop;
     private Begoodathair begoodathairByHsIdone;
     private Begoodathair begoodathairByHsIdfive;
     private Begoodathair begoodathairByHsIdtwo;
     private String BHPath;
     private String BName;
     private Integer BAge;
     private Boolean BSex;
     private String BPwd;
     private String BIdcard;
     private String BBankcard;
     private String BBank;
     private String BZhifubao;
     private String BPhone;
     private String BDis;
     private Timestamp BInfotime;
     private Timestamp BCreatetime;
     private Boolean BAudited;
     private Set<Boperation> boperations = new HashSet<Boperation>(0);
     private Set<Barbershopfire> barbershopfires = new HashSet<Barbershopfire>(0);
     private Set<Ordertable> ordertables = new HashSet<Ordertable>(0);
     private Set<Barberappraisereply> barberappraisereplies = new HashSet<Barberappraisereply>(0);
     private Set<Barberappraise> barberappraises = new HashSet<Barberappraise>(0);
     private Set<Noapordertable> noapordertables = new HashSet<Noapordertable>(0);
     private Set<Cancelordertable> cancelordertables = new HashSet<Cancelordertable>(0);
     private Set<Barbershopemployee> barbershopemployees = new HashSet<Barbershopemployee>(0);
     private Set<Barberphoto> barberphotos = new HashSet<Barberphoto>(0);
     private Set<Preordertable> preordertables = new HashSet<Preordertable>(0);
     private Set<Cancelpreordertable> cancelpreordertables = new HashSet<Cancelpreordertable>(0);


    // Constructors

    /** default constructor */
    public Barber() {
    }

	/** minimal constructor */
    public Barber(String BPwd, String BPhone, Timestamp BInfotime, Timestamp BCreatetime) {
        this.BPwd = BPwd;
        this.BPhone = BPhone;
        this.BInfotime = BInfotime;
        this.BCreatetime = BCreatetime;
    }
    
    /** full constructor */
    public Barber(Begoodathair begoodathairByHsIdfour, Begoodathair begoodathairByHsIdthree, Barbershop barbershop, Begoodathair begoodathairByHsIdone, Begoodathair begoodathairByHsIdfive, Begoodathair begoodathairByHsIdtwo, String BHPath, String BName, Integer BAge, Boolean BSex, String BPwd, String BIdcard, String BBankcard, String BBank, String BZhifubao, String BPhone, String BDis, Timestamp BInfotime, Timestamp BCreatetime, Boolean BAudited, Set<Boperation> boperations, Set<Barbershopfire> barbershopfires, Set<Ordertable> ordertables, Set<Barberappraisereply> barberappraisereplies, Set<Barberappraise> barberappraises, Set<Noapordertable> noapordertables, Set<Cancelordertable> cancelordertables, Set<Barbershopemployee> barbershopemployees, Set<Barberphoto> barberphotos, Set<Preordertable> preordertables, Set<Cancelpreordertable> cancelpreordertables) {
        this.begoodathairByHsIdfour = begoodathairByHsIdfour;
        this.begoodathairByHsIdthree = begoodathairByHsIdthree;
        this.barbershop = barbershop;
        this.begoodathairByHsIdone = begoodathairByHsIdone;
        this.begoodathairByHsIdfive = begoodathairByHsIdfive;
        this.begoodathairByHsIdtwo = begoodathairByHsIdtwo;
        this.BHPath = BHPath;
        this.BName = BName;
        this.BAge = BAge;
        this.BSex = BSex;
        this.BPwd = BPwd;
        this.BIdcard = BIdcard;
        this.BBankcard = BBankcard;
        this.BBank = BBank;
        this.BZhifubao = BZhifubao;
        this.BPhone = BPhone;
        this.BDis = BDis;
        this.BInfotime = BInfotime;
        this.BCreatetime = BCreatetime;
        this.BAudited = BAudited;
        this.boperations = boperations;
        this.barbershopfires = barbershopfires;
        this.ordertables = ordertables;
        this.barberappraisereplies = barberappraisereplies;
        this.barberappraises = barberappraises;
        this.noapordertables = noapordertables;
        this.cancelordertables = cancelordertables;
        this.barbershopemployees = barbershopemployees;
        this.barberphotos = barberphotos;
        this.preordertables = preordertables;
        this.cancelpreordertables = cancelpreordertables;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="b_id", unique=true, nullable=false)

    public Integer getBId() {
        return this.BId;
    }
    
    public void setBId(Integer BId) {
        this.BId = BId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="hs_idfour")

    public Begoodathair getBegoodathairByHsIdfour() {
        return this.begoodathairByHsIdfour;
    }
    
    public void setBegoodathairByHsIdfour(Begoodathair begoodathairByHsIdfour) {
        this.begoodathairByHsIdfour = begoodathairByHsIdfour;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="hs_idthree")

    public Begoodathair getBegoodathairByHsIdthree() {
        return this.begoodathairByHsIdthree;
    }
    
    public void setBegoodathairByHsIdthree(Begoodathair begoodathairByHsIdthree) {
        this.begoodathairByHsIdthree = begoodathairByHsIdthree;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="s_id")

    public Barbershop getBarbershop() {
        return this.barbershop;
    }
    
    public void setBarbershop(Barbershop barbershop) {
        this.barbershop = barbershop;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="hs_idone")

    public Begoodathair getBegoodathairByHsIdone() {
        return this.begoodathairByHsIdone;
    }
    
    public void setBegoodathairByHsIdone(Begoodathair begoodathairByHsIdone) {
        this.begoodathairByHsIdone = begoodathairByHsIdone;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="hs_idfive")

    public Begoodathair getBegoodathairByHsIdfive() {
        return this.begoodathairByHsIdfive;
    }
    
    public void setBegoodathairByHsIdfive(Begoodathair begoodathairByHsIdfive) {
        this.begoodathairByHsIdfive = begoodathairByHsIdfive;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="hs_idtwo")

    public Begoodathair getBegoodathairByHsIdtwo() {
        return this.begoodathairByHsIdtwo;
    }
    
    public void setBegoodathairByHsIdtwo(Begoodathair begoodathairByHsIdtwo) {
        this.begoodathairByHsIdtwo = begoodathairByHsIdtwo;
    }
    
    @Column(name="b_h_path", length=100)

    public String getBHPath() {
        return this.BHPath;
    }
    
    public void setBHPath(String BHPath) {
        this.BHPath = BHPath;
    }
    
    @Column(name="b_name", unique=true, length=10)

    public String getBName() {
        return this.BName;
    }
    
    public void setBName(String BName) {
        this.BName = BName;
    }
    
    @Column(name="b_age")

    public Integer getBAge() {
        return this.BAge;
    }
    
    public void setBAge(Integer BAge) {
        this.BAge = BAge;
    }
    
    @Column(name="b_sex")

    public Boolean getBSex() {
        return this.BSex;
    }
    
    public void setBSex(Boolean BSex) {
        this.BSex = BSex;
    }
    
    @Column(name="b_pwd", nullable=false, length=20)

    public String getBPwd() {
        return this.BPwd;
    }
    
    public void setBPwd(String BPwd) {
        this.BPwd = BPwd;
    }
    
    @Column(name="b_idcard", length=20)

    public String getBIdcard() {
        return this.BIdcard;
    }
    
    public void setBIdcard(String BIdcard) {
        this.BIdcard = BIdcard;
    }
    
    @Column(name="b_bankcard", length=20)

    public String getBBankcard() {
        return this.BBankcard;
    }
    
    public void setBBankcard(String BBankcard) {
        this.BBankcard = BBankcard;
    }
    
    @Column(name="b_bank", length=10)

    public String getBBank() {
        return this.BBank;
    }
    
    public void setBBank(String BBank) {
        this.BBank = BBank;
    }
    
    @Column(name="b_zhifubao", length=20)

    public String getBZhifubao() {
        return this.BZhifubao;
    }
    
    public void setBZhifubao(String BZhifubao) {
        this.BZhifubao = BZhifubao;
    }
    
    @Column(name="b_phone", nullable=false, length=20)

    public String getBPhone() {
        return this.BPhone;
    }
    
    public void setBPhone(String BPhone) {
        this.BPhone = BPhone;
    }
    
    @Column(name="b_dis")

    public String getBDis() {
        return this.BDis;
    }
    
    public void setBDis(String BDis) {
        this.BDis = BDis;
    }
    
    @Column(name="b_infotime", nullable=false, length=19)

    public Timestamp getBInfotime() {
        return this.BInfotime;
    }
    
    public void setBInfotime(Timestamp BInfotime) {
        this.BInfotime = BInfotime;
    }
    
    @Column(name="b_createtime", nullable=false, length=19)

    public Timestamp getBCreatetime() {
        return this.BCreatetime;
    }
    
    public void setBCreatetime(Timestamp BCreatetime) {
        this.BCreatetime = BCreatetime;
    }
    
    @Column(name="b_audited")

    public Boolean getBAudited() {
        return this.BAudited;
    }
    
    public void setBAudited(Boolean BAudited) {
        this.BAudited = BAudited;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="barber")

    public Set<Boperation> getBoperations() {
        return this.boperations;
    }
    
    public void setBoperations(Set<Boperation> boperations) {
        this.boperations = boperations;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="barber")

    public Set<Barbershopfire> getBarbershopfires() {
        return this.barbershopfires;
    }
    
    public void setBarbershopfires(Set<Barbershopfire> barbershopfires) {
        this.barbershopfires = barbershopfires;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="barber")

    public Set<Ordertable> getOrdertables() {
        return this.ordertables;
    }
    
    public void setOrdertables(Set<Ordertable> ordertables) {
        this.ordertables = ordertables;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="barber")

    public Set<Barberappraisereply> getBarberappraisereplies() {
        return this.barberappraisereplies;
    }
    
    public void setBarberappraisereplies(Set<Barberappraisereply> barberappraisereplies) {
        this.barberappraisereplies = barberappraisereplies;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="barber")

    public Set<Barberappraise> getBarberappraises() {
        return this.barberappraises;
    }
    
    public void setBarberappraises(Set<Barberappraise> barberappraises) {
        this.barberappraises = barberappraises;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="barber")

    public Set<Noapordertable> getNoapordertables() {
        return this.noapordertables;
    }
    
    public void setNoapordertables(Set<Noapordertable> noapordertables) {
        this.noapordertables = noapordertables;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="barber")

    public Set<Cancelordertable> getCancelordertables() {
        return this.cancelordertables;
    }
    
    public void setCancelordertables(Set<Cancelordertable> cancelordertables) {
        this.cancelordertables = cancelordertables;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="barber")

    public Set<Barbershopemployee> getBarbershopemployees() {
        return this.barbershopemployees;
    }
    
    public void setBarbershopemployees(Set<Barbershopemployee> barbershopemployees) {
        this.barbershopemployees = barbershopemployees;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="barber")

    public Set<Barberphoto> getBarberphotos() {
        return this.barberphotos;
    }
    
    public void setBarberphotos(Set<Barberphoto> barberphotos) {
        this.barberphotos = barberphotos;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="barber")

    public Set<Preordertable> getPreordertables() {
        return this.preordertables;
    }
    
    public void setPreordertables(Set<Preordertable> preordertables) {
        this.preordertables = preordertables;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="barber")

    public Set<Cancelpreordertable> getCancelpreordertables() {
        return this.cancelpreordertables;
    }
    
    public void setCancelpreordertables(Set<Cancelpreordertable> cancelpreordertables) {
        this.cancelpreordertables = cancelpreordertables;
    }
   








}