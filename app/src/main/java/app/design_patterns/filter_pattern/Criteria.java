package app.design_patterns.filter_pattern;

import java.util.List;

public interface  Criteria {

    List<Person> meetCriteria(List<Person> persons);

}
