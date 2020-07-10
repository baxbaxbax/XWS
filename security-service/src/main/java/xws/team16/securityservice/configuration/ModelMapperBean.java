package xws.team16.securityservice.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperBean {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}

