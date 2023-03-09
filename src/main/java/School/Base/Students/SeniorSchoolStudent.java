package School.Base.Students;

import School.Base.Interfaces.FallingInLove;
import School.Base.Interfaces.Smoke;
import School.Base.Student;

public class SeniorSchoolStudent extends Student implements Smoke, FallingInLove {

    public SeniorSchoolStudent(String name, int classNumber, String letter) {
        super(name, classNumber, letter);
    }

    @Override
    public String FallingInLove() {
        return "\nЯ ищу себе пару";

    }

    @Override
    public String Smoke() {
        return "\nЯ бросаю курить";

    }

    @Override
    public String Learn() {
        return "\nЯ должен учиться";
    }

    @Override
    public String getInfo() {
        return super.getInfo() + this.Learn() + this.FallingInLove() + this.Smoke();
    }
}
