package edu.mum.data;

import edu.mum.model.starbucks.Category;
import edu.mum.model.starbucks.Coffee;
import edu.mum.model.starbucks.User;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private static List<User> users = new ArrayList<>();
    private static List<Coffee> coffees = new ArrayList<>();
    private static List<Category> categories = new ArrayList<>();

    private Database() {
        users.add(new User(1L, "Dave", "111"));
        users.add(new User(2L, "Steve", "222"));

        Category dark = new Category(1L, "DARK"); categories.add(dark);
        Category medium = new Category(2L, "MEDIUM"); categories.add(medium);
        Category light = new Category(3L, "LIGHT"); categories.add(light);


        coffees.add(new Coffee(1L,"Sumatra", dark));
        coffees.add(new Coffee(2L, "Verona", dark));
		coffees.add(new Coffee(3L, "French Roast", dark));

		coffees.add(new Coffee(4L, "Breakfast Blend", medium));
		coffees.add(new Coffee(5L, "Colombia", medium));
		coffees.add(new Coffee(6L, "Yukon", medium));
		coffees.add(new Coffee(7L, "Pike Place", medium));

		coffees.add(new Coffee(8L, "Willow", light));
		coffees.add(new Coffee(9L, "Aria", light));
		coffees.add(new Coffee(10L, "Bright Sky",light));
		coffees.add(new Coffee(11L, "Veranda", light));
    }

    public static Database INSTANCE = new Database();
    public User findByUser(User user){
    	if(user == null) return null;
    	for(User u: users){
    		if(u.getName().equalsIgnoreCase(user.getName()))
				System.out.println("u = " + u);
    			return u;
		}
    	return null;
	}
	public List<Coffee> getCoffeesByCategory(Category category){
    	List<Coffee> result = new ArrayList<>();
    	for(Coffee c: coffees){
    		if(c.getCategory().equals(category))
    			 result.add(c);
		}
    	return result;
	}

	public List<Category> listCategories(){
    	return categories;
	}

}
