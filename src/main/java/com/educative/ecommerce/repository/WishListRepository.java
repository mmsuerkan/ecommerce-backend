package com.educative.ecommerce.repository;

import com.educative.ecommerce.model.User;
import com.educative.ecommerce.model.WishList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WishListRepository extends JpaRepository<WishList,Integer> {

    // find all the products saved to wishlist for a user
    // sort by latest created date
    Optional<WishList> findAllByUserOOrderByCreatedDateAsc(User user);
}
