package mum.edu.data;

import java.util.ArrayList;
import java.util.List;

// Implements Singleton Pattern
public class TestDataImpl implements DataFacade {

    private static final Database data = new Database();

    // Private constructor. Prevents instantiation from other classes.
    private TestDataImpl() {

    }

    // eager init'ed singleton...
    public final static TestDataImpl INSTANCE = new TestDataImpl();

    public String findPassword(String name) {
		return data.getPassword(name);
    }

    public List<String> getAdvice(String roast) {
        return data.getAdvice(roast);
    }
}



