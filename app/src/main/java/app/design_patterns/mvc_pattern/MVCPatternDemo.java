package app.design_patterns.mvc_pattern;

class MVCPatternDemo {

   public static void main(String[] args) {

      Student model  = retrieveStudentFromDatabase();
      StudentView view = new StudentView();

      StudentController controller = new StudentController(model, view);

      controller.updateView();

      controller.setStudentName("Mohamed");
      controller.setStudentRollNo("30");
      controller.updateView();


   }

   private static Student retrieveStudentFromDatabase(){
      Student student = new Student();
      student.setName("Omar");
      student.setRollNo("10");
      return student;
   }


}
