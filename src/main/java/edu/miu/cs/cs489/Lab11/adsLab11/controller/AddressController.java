package edu.miu.cs.cs489.Lab11.adsLab11.controller;

import edu.miu.cs.cs489.Lab11.adsLab11.service.IAddressService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/adsweb/api/v1/address")
public class AddressController {

    private final IAddressService addressService;

    public AddressController(IAddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping(value = "/list")
    public ResponseEntity<?> getAllPatients() {
        return ResponseEntity.ok(addressService.getAllAddressesWithPatientsInJSON());
    }
}
