package com.blackswan.fake.Bean;

import java.sql.Time;
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
 * Barbershopemployee entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="barbershopemployee"
    ,catalog="fake"
)

public class Barbershopemployee  implements java.io.Serializable {


    // Fields    

     private Integer employeeId;
     private Barbershop barbershop;
     private Barber barber;
     private String department;
     private Integer femployeeId;
     private String employeelevel;
     private Time employedtime;


    // Constructors

    /** default constructor */
    public Barbershopemployee() {
    }

	/** minimal constructor */
    public Barbershopemployee(Barbershop barbershop, String department, Integer femployeeId, String employeelevel, Time employedtime) {
        this.barbershop = barbershop;
        this.department = department;
        this.femployeeId = femployeeId;
        this.employeelevel = employeelevel;
        this.employedtime = employedtime;
    }
    
    /** full constructor */
    public Barbershopemployee(Barbershop barbershop, Barber barber, String department, Integer femployeeId, String employeelevel, Time employedtime) {
        this.barbershop = barbershop;
        this.barber = barber;
        this.department = department;
        this.femployeeId = femployeeId;
        this.employeelevel = employeelevel;
        this.employedtime = employedtime;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="employee_id", unique=true, nullable=false)

    public Integer getEmployeeId() {
        return this.employeeId;
    }
    
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="s_id", nullable=false)

    public Barbershop getBarbershop() {
        return this.barbershop;
    }
    
    public void setBarbershop(Barbershop barbershop) {
        this.barbershop = barbershop;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="b_id")

    public Barber getBarber() {
        return this.barber;
    }
    
    public void setBarber(Barber barber) {
        this.barber = barber;
    }
    
    @Column(name="department", nullable=false, length=20)

    public String getDepartment() {
        return this.department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
    
    @Column(name="femployee_id", nullable=false)

    public Integer getFemployeeId() {
        return this.femployeeId;
    }
    
    public void setFemployeeId(Integer femployeeId) {
        this.femployeeId = femployeeId;
    }
    
    @Column(name="employeelevel", nullable=false, length=20)

    public String getEmployeelevel() {
        return this.employeelevel;
    }
    
    public void setEmployeelevel(String employeelevel) {
        this.employeelevel = employeelevel;
    }
    
    @Column(name="employedtime", nullable=false, length=8)

    public Time getEmployedtime() {
        return this.employedtime;
    }
    
    public void setEmployedtime(Time employedtime) {
        this.employedtime = employedtime;
    }
   








}