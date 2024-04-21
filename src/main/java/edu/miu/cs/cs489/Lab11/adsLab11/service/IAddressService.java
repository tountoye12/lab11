package edu.miu.cs.cs489.Lab11.adsLab11.service;

import edu.miu.cs.cs489.Lab11.adsLab11.models.Address;

import java.util.List;

public interface IAddressService {
    Address save(Address address);
    List<Address> getAllAddresses();
    String getAllAddressesWithPatientsInJSON();
}
