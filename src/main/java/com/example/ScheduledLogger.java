package com.example;

import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author Madhura Bhave
 */
@Component
public class ScheduledLogger {

	Logger logger = LoggerFactory.getLogger(ScheduledLogger.class);

	AtomicLong count = new AtomicLong();

	@Scheduled(fixedRate = 1000)
	public void log() {
		this.logger.debug("Logging count " + this.count.getAndIncrement());
	}

}
