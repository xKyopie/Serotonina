package com.serotonina.serotoninaback;

//import com.serotonina.serotoninaback.repository.TarefaRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SerotoninaBackApplication {
	public static void main(String[] args) {
		//TarefaRepository.init();
		SpringApplication.run(SerotoninaBackApplication.class, args);
	}

}
