package ru.geekbrains.java1.dz_Enver_Eskendarov.dz5;

class Personnel { // создаем класс Personnel (Сотрудник)

    private String name = "no info";                        // ФИО
    private String position = "no info";                    // Должность
    private String mail = "no info";                        // Электронная почта
    private long num = 0;                                   // Тел. номер
    private int salary = 0;                                 // Зарплата
    private int age = 0;                                    // Возраст


    Personnel(String name, String position, String mail, long num, int salary, int age) {
        this.name = name;
        this.position = position;
        this.mail = mail;
        this.num = num;
        this.salary = salary;
        this.age = age;
    }

    void printInfo() {
        System.out.println("ФИО: " + name + "\nДолжность: " + position + "\nE-mail: " + mail + "\nТел. номер: " + num + "\nЗарплата: " + salary + "$" + "\nВозраст: " + age + "\n");
    }

    int getAge() {
        return age;
    }
}    // end Personnel
