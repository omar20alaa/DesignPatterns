package app.design_patterns.iterator_pattern;

class IteratorPatternDemo {


   public static void main(String[] args) {

      NameRepository namesRepository = new NameRepository();

      for (Iterator iterator = namesRepository.getIterator(); iterator.hasNext();) {
         String name = (String)iterator.next();
         System.out.println("Name --> " + name);

      }



   }



}
