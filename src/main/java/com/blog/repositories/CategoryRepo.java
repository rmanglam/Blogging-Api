package com.blog.repositories;

import com.blog.entites.Category;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
