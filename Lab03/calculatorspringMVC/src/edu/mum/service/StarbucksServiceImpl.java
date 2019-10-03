package edu.mum.service;

import edu.mum.data.Database;
import edu.mum.model.starbucks.Category;
import edu.mum.model.starbucks.Coffee;
import edu.mum.model.starbucks.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StarbucksServiceImpl {

    private Database database = Database.INSTANCE;

    public Boolean checkAuthentication(User user) {
        User tUser = database.findByUser(user);
        if (tUser == null) return false;
        if (tUser.getPassword().equals(user.getPassword()))
            return true;
        return false;
    }

    public List<Category> getCategories() {
        return database.listCategories();
    }

    public Category getCategoryBiId(Long Id){
        for(Category c: database.listCategories()){
            if(c.getId() == Id) return c;
        }
        return null;
    }

    public List<Coffee> advice(Category category) {
        return database.getCoffeesByCategory(category);
    }

}
