package me.dio.repository;

import me.dio.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author mariana
 * @Project: santander-week-2023
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
