package repository;

import org.springframework.data.repository.CrudRepository;

import domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
	// this method is not defined in CrudRepository
	/*
	 * username field is defined in User class, so Spring will parse this method so
	 * it knows it will accept "username" as parameter and return username.S
	 */
	User findByUsername(String username);
}
