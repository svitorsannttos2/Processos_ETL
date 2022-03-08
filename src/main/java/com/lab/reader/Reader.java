package com.lab.reader;

import javax.sql.DataSource;

import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.database.builder.JdbcCursorItemReaderBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import com.lab.domain.Colaboradores;

@Configuration
public class Reader {

	@Bean
	public JdbcCursorItemReader<Colaboradores> jdbcCursorReader(
			@Qualifier("springDataSource") DataSource dataSource){
		return new JdbcCursorItemReaderBuilder<Colaboradores>()
				.name("jdbcCursorReader")
				.dataSource(dataSource)
				.sql("select * from folha.colaboradores")
				.rowMapper(new BeanPropertyRowMapper<Colaboradores>(Colaboradores.class))
				.build();
	}

}
