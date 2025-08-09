package com.tnsif.ShopOwner.controller;

import com.tnsif.ShopOwner.entity.ShopOwner;
import com.tnsif.ShopOwner.service.ShopOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/shopowners")
public class ShopOwnerController {

    @Autowired
    private ShopOwnerService shopOwnerService;

    // Create or Update ShopOwner
    @PostMapping
    public ShopOwner addShopOwner(@RequestBody ShopOwner shopOwner) {
        return shopOwnerService.saveShopOwner(shopOwner);
    }

    // Get all ShopOwners
    @GetMapping
    public List<ShopOwner> getAllShopOwners() {
        return shopOwnerService.getAllShopOwners();
    }

    // Get ShopOwner by ID
    @GetMapping("/{id}")
    public Optional<ShopOwner> getShopOwnerById(@PathVariable int id) {
        return shopOwnerService.getShopOwnerById(id);
    }

    // Delete ShopOwner by ID
    @DeleteMapping("/{id}")
    public String deleteShopOwner(@PathVariable int id) {
        shopOwnerService.deleteShopOwner(id);
        return "ShopOwner with ID " + id + " has been deleted successfully.";
    }

    // Get ShopOwner by email
    @GetMapping("/email/{email}")
    public ShopOwner getShopOwnerByEmail(@PathVariable String email) {
        return shopOwnerService.getShopOwnerByEmail(email);
    }

    // Get ShopOwner by phone number
    @GetMapping("/phone/{phoneNumber}")
    public ShopOwner getShopOwnerByPhoneNumber(@PathVariable String phoneNumber) {
        return shopOwnerService.getShopOwnerByPhoneNumber(phoneNumber);
    }

    // Get ShopOwner by shop name
    @GetMapping("/shopname/{shopName}")
    public ShopOwner getShopOwnerByShopName(@PathVariable String shopName) {
        return shopOwnerService.getShopOwnerByShopName(shopName);
    }
}
