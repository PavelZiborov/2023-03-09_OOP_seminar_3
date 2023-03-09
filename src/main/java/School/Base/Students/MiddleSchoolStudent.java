package School.Base.Students;

import School.Base.Interfaces.Play;
import School.Base.Interfaces.Smoke;
import School.Base.Student;

public class MiddleSchoolStudent extends Student implements Play, Smoke {


    public MiddleSchoolStudent(String name, int classNumber, String letter) {
        super(name, classNumber, letter);
    }

    @Override
    public String Play() {
        return "\nЯ играю Brawl Stars";
    }

    @Override
    public String Smoke() {
        return "\nЯ начинаю курить";

    }

    @Override
    public String Learn() {
        return "\nЯ ненавижу учиться";
    }

    @Override
    public String getInfo() {
        return super.getInfo() + this.Learn() + this.Play() + this.Smoke();
    }
}
