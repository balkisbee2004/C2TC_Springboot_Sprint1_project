package com.tnsif.ShopOwner.service;

import com.tnsif.ShopOwner.entity.ShopOwner;
import com.tnsif.ShopOwner.repository.ShopOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShopOwnerService {

    @Autowired
    private ShopOwnerRepository shopOwnerRepository;

    // Create or Update ShopOwner
    public ShopOwner saveShopOwner(ShopOwner shopOwner) {
        return shopOwnerRepository.save(shopOwner);
    }

    // Get all ShopOwners
    public List<ShopOwner> getAllShopOwners() {
        return shopOwnerRepository.findAll();
    }

    // Get ShopOwner by ID
    public Optional<ShopOwner> getShopOwnerById(int id) {
        return shopOwnerRepository.findById(id);
    }

    // Delete ShopOwner by ID
    public void deleteShopOwner(int id) {
        shopOwnerRepository.deleteById(id);
    }

    // Find ShopOwner by email
    public ShopOwner getShopOwnerByEmail(String email) {
        return shopOwnerRepository.findByEmail(email);
    }

    // Find ShopOwner by phone number
    public ShopOwner getShopOwnerByPhoneNumber(String phoneNumber) {
        return shopOwnerRepository.findByPhoneNumber(phoneNumber);
    }

    // Find ShopOwner by shop name
    public ShopOwner getShopOwnerByShopName(String shopName) {
        return shopOwnerRepository.findByShopName(shopName);
    }
}
