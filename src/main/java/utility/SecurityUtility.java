package utility;

import java.security.SecureRandom;
import java.util.Random;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class SecurityUtility {
	// salt should be protected carefully. Try to use a complicate string. For
	// encrypting/decrypting passwords. i.e using hashing techniques
	private static final String SALT = "salt";

	@Bean
	public static BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder(12, new SecureRandom(SALT.getBytes()));
	}

	// generates random password
	@Bean
	public static String randomPassword() {

		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

		StringBuilder salt = new StringBuilder();
		Random rand = new Random();
		while (salt.length() < 18) {
			int index = (int) (rand.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}

		String saltStr = salt.toString();
		return saltStr;
	}
}
