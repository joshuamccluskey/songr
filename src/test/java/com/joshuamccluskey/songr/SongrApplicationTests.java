package com.joshuamccluskey.songr;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
class SongrApplicationTests {

	@Autowired
	MockMvc mockMvc;

	@Test
	void contextLoads() {
		SongrApplication sut = new SongrApplication();
		assertNotNull(sut, "Yo check your app, it came up as null");
	}

	@Test
	void testHelloWorld() throws Exception {
		mockMvc.perform(get("/hello"))
				.andExpect(content().string(containsString("Hello")))
				.andExpect(content().string(containsString("<h1>Hello World!</h1>")))
				.andExpect(status().isOk());
	}

	@Test
	void testIndexPage() throws Exception {
		mockMvc.perform(get("/"))
				.andExpect(content().string(containsString("Welcome")))
				.andExpect(content().string(containsString("to")))
				.andExpect(content().string(containsString("Vibe")))
				.andExpect(content().string(containsString("and")))
				.andExpect(content().string(containsString("Chill")))
				.andExpect(status().isOk());
	}

	@Test
	void testAlbumsPage() throws Exception {
		mockMvc.perform(get("/albums"))
				.andExpect(content().string(containsString("Albums")))
				.andExpect(content().string(containsString("<h1>Albums</h1>")))
				.andExpect(status().isOk());
	}

	@Test
	void testSongsPage() throws Exception {
		mockMvc.perform(get("/songs/1"))
				.andExpect(content().string(containsString("Songs")))
				.andExpect(status().isOk());
	}
}
