package study;

import java.util.List;

public class StudyGroupController {
    private StudyGroupService studyGroupService;

    public StudyGroupController() {
        this.studyGroupService = new StudyGroupService();
    }

    public StudyGroup createGroup(int teacherId, List<Integer> studentIds) {
        Teacher teacher = getTeacherById(teacherId); // Method to get teacher by id
        List<Student> students = getStudentsByIds(studentIds); // Method to get the list of students by their id
        return studyGroupService.createGroup(teacher, students);
    }

    private Teacher getTeacherById(int id) {
        // Implement a method to retrieve a teacher by id
        return new Teacher(id, "Ben Teacher"); // Заглушка
    }

    private List<Student> getStudentsByIds(List<Integer> ids) {
        // Implement a method to get the list of students by their id
        return List.of(
                new Student(1, "Bill Smith"),
                new Student(2, "Joan Like"),
                new Student(3, "Adeline Fly")
        );
    }
}
