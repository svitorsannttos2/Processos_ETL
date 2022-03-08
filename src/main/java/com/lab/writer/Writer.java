package com.lab.writer;

import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lab.domain.Colaboradores;

@Configuration
public class Writer {
	
	@Bean
	public ItemWriter<Colaboradores> jdbcPagingWriter() {
		return colaboradores -> colaboradores.forEach(System.out::println);
	}
}
