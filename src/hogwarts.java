public abstract class hogwarts {
    private int magicPower;
    private int transgress;
    private String name;

    public hogwarts(String name, int magicPower, int transgress) {
        this.magicPower = correctnessOfInitialData(magicPower);
        this.transgress = correctnessOfInitialData(transgress);
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgress() {
        return transgress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }

    public abstract void printStudent();
    public void printGeneralQualities(){
        System.out.println("Сила магии: " + magicPower);
        System.out.println("Трансгрессировность: " + transgress);
    }

    public abstract int facultyScore();

    public int hogwartsScore(){
        return magicPower + transgress;
    }

    public void printComparison(hogwarts student) {
        int Student1 = this.hogwartsScore();
        int Student2 = student.hogwartsScore();
        if (Student1 > Student2) {
            System.out.println(this.getName() + " обладает большей мощностью магии, чем " + student.getName());
        } else if (Student1 < Student2) {
            System.out.println(student.getName() + " обладает большей мощностью магии, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + student.getName() + " равны");
        }
    }
    public int correctnessOfInitialData(int magnitude){
        if (magnitude < 0 || magnitude > 100) {
            System.out.println("Недопустимое значение: " + magnitude);
            throw new IllegalArgumentException();
        }
        return magnitude;
    }

}
