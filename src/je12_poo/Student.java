package je12_poo;

// Definindo o enum Color
enum Color {
    FAIR, DARK
}

// Definindo o enum Sex
enum Sex {
    MALE, FEMALE
}

public class Student {
    // Definindo as variáveis de instância
    String name;
    int age;
    Color color;
    Sex sex;

    public static void main(String[] args) {
        // Criando e inicializando o primeiro estudante
        Student student1 = new Student();
        student1.name = "John";
        student1.age = 12;
        student1.color = Color.FAIR;
        student1.sex = Sex.MALE;

        // Criando e inicializando o segundo estudante
        Student student2 = new Student();
        student2.name = "Sophia";
        student2.age = 10;
        student2.color = Color.FAIR;
        student2.sex = Sex.FEMALE;

        // Criando e inicializando o terceiro estudante
        Student student3 = new Student();
        student3.name = "Lily";
        student3.age = 11;
        student3.color = Color.DARK;
        student3.sex = Sex.FEMALE;

        // Imprimir informações dos estudantes (opcional)
        System.out.println(student1.name + ", " + student1.age + " anos, " + student1.color + ", " + student1.sex);
        System.out.println(student2.name + ", " + student2.age + " anos, " + student2.color + ", " + student2.sex);
        System.out.println(student3.name + ", " + student3.age + " anos, " + student3.color + ", " + student3.sex);
    }
}







