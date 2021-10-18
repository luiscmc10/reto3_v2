
package com.usa.reto3.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.usa.reto3.Interface.interfaceCategory;
import com.usa.reto3.Model.Category;
import java.util.List;
import java.util.Optional;

@Repository
public class CategoryRepositorio {
    
    @Autowired
    private interfaceCategory crud;
    
    public List<Category> getAll(){
        return (List<Category>) crud.findAll();
    }
    
    public Optional<Category> getCategory(int id){
        return crud.findById(id);
    }
    
    public Category save(Category category){
        return crud.save(category);
    }
       
    public void delete(Category category){
       crud.delete(category);
    }
    
}
