package edu.miu.cs.cs489.Lab11.adsLab11.dao;

import edu.miu.cs.cs489.Lab11.adsLab11.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long> {
    List<Address> findAllByOrderByCityAsc();
}
