package School.Base;

public abstract class Student {
    private String name;
    private int classNumber;
    private String letter;
    public abstract String Learn();

    public Student(String name, int classNumber, String letter) {
        this.name = name;
        this.classNumber = classNumber;
        this.letter = letter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public String getInfo(){
        return String.format("Имя: %s; Класс: %d%s", name, classNumber, letter);
    }

    @Override
    public String toString() {
        return String.format("Имя: %s; Класс: %d%s", name, classNumber, letter);
    }
}
