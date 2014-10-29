package com.blackswan.fake.Interface;

import java.util.List;

import com.blackswan.fake.Bean.Administrator;

public interface IAdministratorManager {

    public abstract List<Administrator> loginByName(String name, String pwd);

    public abstract List<Administrator> loginByPhone(String phone, String pwd);

    public abstract List<Administrator> findByFAdministrator(
	    Administrator administrator);

    public abstract List<Administrator> findByAddress(
	    String administratorAddress);

    public abstract List<Administrator> findByRight(String right);

    public abstract List<Administrator> findByAddressRight(String address,
	    String right);

    public abstract List<Administrator> findByName(String name);

    public abstract boolean isUnique(String administratorName,
	    String administratorAddress, String administratorRight);

    public abstract int countByAddressRight(String address, String right);

    public abstract int countByAddress(String address);

    public abstract int countByRight(String right);

    public abstract List<Administrator> listAllByAddressRightPage(
	    String address, String right, int pageNo, int pageSize);

}