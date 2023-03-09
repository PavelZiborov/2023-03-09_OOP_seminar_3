package School;

import School.Base.*;
import School.Base.Interfaces.ExtraLearning;
import School.Base.Interfaces.FallingInLove;
import School.Base.Interfaces.Play;
import School.Base.Interfaces.Smoke;
import School.Base.Students.JuniorSchoolStudent;
import School.Base.Students.MiddleSchoolStudent;
import School.Base.Students.SeniorSchoolStudent;

public class Program {
    /*
        Разработать следующую иерархию школьников:
    1. Младшеклассник, содержащий следующие методы:
    1.1. Учиться, выводящий на экран фразу "Я люблю учиться"
    1.2. Ходить в продёнку, выводящий на экран фразу "Я хожу в продлёнку"
    1.3. Играть, выводящий на экран фразу "Я играю в игрушки"
    2. Ученик средней школы, содержащий следующие методы:
    2.1. Учиться, выводящий на экран фразу "Я ненавижу учиться"
    2.2. Играть, выводящий на экран фразу "Я играю Brawl Stars"
    2.3. Курить, выводящий на экран фразу "Я начинаю курить"
    3. Старшеклассник, содержащий следующие методы:
    3.1. Учиться, выводящий на экран фразу "Я должен учиться"
    3.2. Курить, выводящий на экран фразу "Я бросаю курить"
    3.3. Влюбляться, выводящий на экран фразу "Я ищу себе пару"
    В классе Program в методе main создать массив школьников. Так же создать метод, принимающий объект школьника и
    вызывающий все его методы

    1. абстрактный класс  Schoolboy
      методы: учиться,
        1.1 класс школьник младших классов
          методы: учиться, ходить в продленку, играть
        1.2 школьник средних классов
          методы: учиться, игарть, курить
        1.3. школьник старших классов
          методы: учиться, курить, влюбляться

    Интерфейсы: ходить в продленку, играть, курить, влюбляться
     */


    public static void main(String[] args) {
        Student juniorSchoolStudent1 = new JuniorSchoolStudent("Павел", 2, "А");
        Student juniorSchoolStudent2 = new JuniorSchoolStudent("Алексей", 3, "Б");
        Student middleSchoolStudent1 = new MiddleSchoolStudent("Петр", 6,"А");
        Student seniorSchoolStudent1 = new SeniorSchoolStudent("Алексей", 10, "А");

        Student[] students = new Student[]{juniorSchoolStudent1, juniorSchoolStudent2, middleSchoolStudent1, seniorSchoolStudent1};

        for (Student student: students) {
            System.out.println("\n---------------------");
            StudentInfo(student);

        }
    }
    public static void StudentInfo(Student student){
//        System.out.println(student.getInfo());

        System.out.println(student);
        System.out.print(student.Learn());

        if (student instanceof ExtraLearning){
            ExtraLearning extraLearning = (ExtraLearning) student;
            System.out.print(extraLearning.ExtraLearning());
        }
        if (student instanceof Play){
            Play play = (Play) student;
            System.out.print(play.Play());
        }
        if (student instanceof Smoke) {
            Smoke smoke = (Smoke) student;
            System.out.print(smoke.Smoke());
        }
        if (student instanceof FallingInLove) {
            FallingInLove senior = (FallingInLove) student;
            System.out.print(senior.FallingInLove());
        }
    }
}