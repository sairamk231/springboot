package com.springboot.repo;

import com.springboot.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<UserInfo, Integer> {

    @Query("Select u.* from user_info u join address a on u.address_id=a.address_id where a.city = :city")
    List<UserInfo> findUsersByCity(String city);

}
