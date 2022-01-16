package az.sarkhan.blogwebsite;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import az.sarkhan.blogwebsite.file.StorageProperties;
import az.sarkhan.blogwebsite.file.StorageService;
 
 
 
@EnableConfigurationProperties(StorageProperties.class)
@SpringBootApplication
public class BlogWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogWebsiteApplication.class, args);
	}
	@Bean
    CommandLineRunner init(StorageService storageService) {
        return (args) -> {

            storageService.init();
        };
}
}