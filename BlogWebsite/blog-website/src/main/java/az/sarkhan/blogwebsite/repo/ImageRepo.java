package az.sarkhan.blogwebsite.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import az.sarkhan.blogwebsite.model.Image;

public interface ImageRepo extends JpaRepository<Image,Integer> {
    
}
