package app.design_patterns.filter_pattern;

import java.util.ArrayList;
import java.util.List;

class CriteriaPatternDemo {

   public static void main(String[] args) {

      List<Person> persons = new ArrayList<>();

      persons.add(new Person("Omar","Male", "Single"));
      persons.add(new Person("Mo7kk Konan", "Male", "Married"));
      persons.add(new Person("3a2esha", "Female", "Married"));
      persons.add(new Person("Khadiga", "Female", "Single"));
      persons.add(new Person("Abo 7meed", "Male", "Single"));
      persons.add(new Person("Mohamed", "Male", "Single"));



      Criteria male = new CriteriaMale();
      Criteria female = new CriteriaFemale();
      Criteria single = new CriteriaSingle();
      Criteria singleMale = new AndCriteria(single, male);
      Criteria singleOrFemale = new OrCriteria(single, female);

      System.out.println("Males: ");
      printPersons(male.meetCriteria(persons));

      System.out.println("\nFemales: ");
      printPersons(female.meetCriteria(persons));

      System.out.println("\nSingle Males: ");
      printPersons(singleMale.meetCriteria(persons));

      System.out.println("\nSingle Or Females: ");
      printPersons(singleOrFemale.meetCriteria(persons));

   }

   public static void printPersons(List<Person> persons){
      for (Person person : persons) {
         System.out.println("Person : [ Name : "
                 + person.getName() + ", Gender : " + person.getGender()
                 + ", Marital Status : " + person.getMaritalStatus() + " ]");
      }
   }
}
