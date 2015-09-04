package de.hamburg.mse.ui.mvc;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class HelloWorldBean {

	private String something = "test";

	private String hello = "hello";

}
