package com.example.demo;

import org.springframework.boot.SpringApplication;

public class Greeting {

		private final long id;
		private final String content;

		public Greeting(long id, String content) {
			this.id = id;
			this.content = content;
		}

		public long getId() {
			return id;
		}

		public String getContent() {
			return content;
		}

	}
public static void main(String[] args) {
	SpringApplication.run(Greeting.class, args);

}
