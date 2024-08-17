package app.design_patterns.data_access_object_pattern;

import java.util.List;

interface StudentDao {

    List<Student> getAllStudents();

    Student getStudent(int rollNo);

    void updateStudent(Student student);

    void deleteStudent(Student student);

}
