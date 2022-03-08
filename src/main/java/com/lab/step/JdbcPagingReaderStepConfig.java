package com.lab.step;


import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lab.domain.Colaboradores;

@Configuration
public class JdbcPagingReaderStepConfig {
	@Autowired
	private StepBuilderFactory stepBuilderFactory;
	
	@Bean
	public Step jdbcPagingReaderStep(ItemReader<Colaboradores> jdbcCursorReader, ItemWriter<Colaboradores> jdbcPagingWriter) {
		return stepBuilderFactory
				.get("jdbcPagingReaderStep")
				.<Colaboradores, Colaboradores>chunk(1)
				.reader(jdbcCursorReader)
				.writer(jdbcPagingWriter)
				.build();
	}
}

