package az.sarkhan.blogwebsite.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;

import az.sarkhan.blogwebsite.model.Content;

public interface ContentRepo  extends JpaRepository<Content,Integer>{
    
}
