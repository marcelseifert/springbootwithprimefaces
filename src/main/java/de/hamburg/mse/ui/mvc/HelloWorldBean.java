package de.hamburg.mse.ui.mvc;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import lombok.Data;

@ManagedBean
@ViewScoped
@Data
public class HelloWorldBean {

	private String something = "test";

	private String hello = "hello";

}
