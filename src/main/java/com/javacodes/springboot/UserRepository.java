package com.javacodes.springboot;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository("userRepository")
public interface UserRepository extends CrudRepository<UserEntity, String> {

	 UserEntity findByEmailIdIgnoreCase(String emailId);
}
