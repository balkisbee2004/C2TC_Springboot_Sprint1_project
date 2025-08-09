package com.tnsif.ShopOwner.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tnsif.ShopOwner.entity.ShopOwner;

@Repository
public interface ShopOwnerRepository extends JpaRepository<ShopOwner, Integer> {

    // Custom finder methods
    ShopOwner findByEmail(String email);
    ShopOwner findByPhoneNumber(String phoneNumber);
    ShopOwner findByShopName(String shopName);
}
