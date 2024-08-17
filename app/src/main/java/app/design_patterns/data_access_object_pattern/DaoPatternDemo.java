package app.design_patterns.data_access_object_pattern;

class DaoPatternDemo {

   public static void main(String[] args) {

      StudentDao studentDao = new StudentDaoImpl();

      //print all students
      for (Student student : studentDao.getAllStudents()) {
         System.out.println("Student: [RollNo : "
                 + student.getRollNo() + ", Name : " + student.getName() + " ]");
      }


      //update student
      Student student =studentDao.getAllStudents().get(0);
      student.setName("Mo7kk Konan");
      studentDao.updateStudent(student);

      //get the student
      studentDao.getStudent(0);
      System.out.println("Student: [RollNo : " + student.getRollNo()
              + ", Name : " + student.getName() + " ]");




   }


}
