package org.zerock.myapp.uuid;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Timeout;
import org.zerock.myapp.util.UUIDGenerator;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Log4j2
@NoArgsConstructor

@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UUIDGeneratorTests {
	
	
//	@Disabled
	@Order(1)
	@Test
//	@RepeatedTest(1)
	@DisplayName("1. generateType1UUID")
	@Timeout(1L)
	void testGenerateType1UUID() {
		log.trace("testGenerateType1UUID() invoked.");
		
		UUID typeUUID = UUIDGenerator.generateType1UUID();
		log.info("\t+ typeUUID: {}", typeUUID);
	} // testGenerateType1UUID

	
//	@Disabled
	@Order(2)
	@Test
//	@RepeatedTest(1)
	@DisplayName("2. generateType3UUID")
	@Timeout(1L)
	void testGenerateType3UUID() throws UnsupportedEncodingException {
		log.trace("testGenerateType3UUID() invoked.");
		
		// Must-be 32 lengths.
		String namespace = "12345678901234567890123456789012";
		String name = "Trinity12345";
		
		assert namespace.length() == 32;
		
		UUID type3UUID = UUIDGenerator.generateType3UUID(namespace, name);
		log.info("\t+ type3UUID: {}", type3UUID);
	} // testGenerateType3UUID

	
//	@Disabled
	@Order(3)
	@Test
//	@RepeatedTest(1)
	@DisplayName("3. generateType4UUID")
	@Timeout(1L)
	void testGenerateType4UUID() throws UnsupportedEncodingException {
		log.trace("testGenerateType4UUID() invoked.");
		
		UUID type4UUID = UUIDGenerator.generateType4UUID();
		log.info("\t+ type4UUID: {}", type4UUID);
	} // testGenerateType4UUID

	
//	@Disabled
	@Order(4)
	@Test
//	@RepeatedTest(1)
	@DisplayName("4. generateType5UUID")
	@Timeout(1L)
	void testGenerateType5UUID() throws UnsupportedEncodingException {
		log.trace("testGenerateType5UUID() invoked.");
		
		// Must-be 32 lengths.
		String namespace = "12345678901234567890123456789012";
		String name = "Trinity12345";
		
		assert namespace.length() == 32;
		
		UUID type5UUID = UUIDGenerator.generateType5UUID(namespace, name);
		log.info("\t+ type5UUID: {}", type5UUID);
	} // testGenerateType5UUID

	
//	@Disabled
	@Order(5)
//	@Test
	@RepeatedTest(3)
	@DisplayName("5. generateUniqueKeysWithUUIDAndMessageDigest")
	@Timeout(1L)
	void testGenerateUniqueKeysWithUUIDAndMessageDigest()
			throws UnsupportedEncodingException, NoSuchAlgorithmException {
		log.trace("testGenerateUniqueKeysWithUUIDAndMessageDigest() invoked.");
		
		String uuid = UUIDGenerator.generateUniqueKeysWithUUIDAndMessageDigest();
		log.info("\t+ length: {}, uuid: {}", uuid.length(), uuid);
	} // testGenerateType5UUID
	
	
	

} // end class
