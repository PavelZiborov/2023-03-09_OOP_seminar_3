package School.Base.Students;

import School.Base.Interfaces.ExtraLearning;
import School.Base.Interfaces.Play;
import School.Base.Student;

public class JuniorSchoolStudent extends Student implements Play, ExtraLearning {

    public JuniorSchoolStudent(String name, int classNumber, String letter) {
        super(name, classNumber, letter);
    }

    @Override
    public String ExtraLearning() {
        return "\nЯ хожу в продлёнку";
    }

    @Override
    public String Play() {
        return "\nЯ играю в игрушки";
    }

    @Override
    public String Learn() {
        return "\nЯ люблю учиться";
    }

    @Override
    public String getInfo() {
        return super.getInfo() + this.ExtraLearning() + this.Play() + this.Learn();
    }
}
