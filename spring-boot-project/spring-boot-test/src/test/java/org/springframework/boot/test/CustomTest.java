package org.springframework.boot.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.util.TestPropertyValues;
import org.springframework.boot.test.util.TestPropertyValuesTests;
import org.springframework.core.env.PropertySource;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomTest {

	@Test
	public void applyToEnvironmentShouldAttachConfigurationPropertySource() {
		Logger logger = LoggerFactory.getLogger(TestPropertyValuesTests.class);
		logger.info("DDDD");
		System.out.println("HELLO");
	}
}
