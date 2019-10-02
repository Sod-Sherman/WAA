package mum.edu.validator;

import mum.edu.model.OurNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class ValidatorImpl implements Validator {
    private final static String DOUBLE_PATTERN = "[0-9]+(\\.){0,1}[0-9]*";

    @Override
    public List<String> validate(Object domainObject) {

        List<String> errors = new ArrayList<String>();
        OurNumber ourNumber = (OurNumber) domainObject;
        List<String> strNums = Arrays.asList(ourNumber.getNum1().toString().trim(),
                ourNumber.getNum2().toString().trim(),
                ourNumber.getNum3().toString().trim(),
                ourNumber.getNum4().toString().trim());
        for (String s : strNums) {
            if(!Pattern.matches(DOUBLE_PATTERN, s) || s.isEmpty())
                errors.add("Invalid Number Pattern for " + s);

        }

            return errors;
    }
}
