package com.azure.github.devops;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import com.azure.github.devops.controller.HelloController;

@WebMvcTest(HelloController.class)
public class HelloControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testHelloEndpoint() throws Exception {
		mockMvc.perform(get("/")).andExpect(status().isOk());
	}
}
