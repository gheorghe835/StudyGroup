package study;

import java.util.List;

public class StudyGroupService {
    public StudyGroup createGroup(Teacher teacher, List<Student> students) {
        return new StudyGroup(teacher, students);
    }
}
