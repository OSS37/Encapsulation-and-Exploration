public class Hufflepuff extends hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, int magicPower, int transgress, int hardworking, int loyal, int honest) {
        super(name, magicPower, transgress);
        this.hardworking = correctnessOfInitialData(hardworking);
        this.loyal = correctnessOfInitialData(loyal);
        this.honest = correctnessOfInitialData(honest);
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }
    public void printStudent() {
        System.out.println("Студент:" + getName());
        printGeneralQualities();
        System.out.println("Трудолюбие:" + hardworking);
        System.out.println("Верность:" + loyal);
        System.out.println("Честность:" + honest);
        System.out.println();
    }

    @Override
    public int facultyScore () {
        return hardworking + loyal + honest;
    }

    public void printFacultytComparison(Hufflepuff student) {
        int Student1 = this.facultyScore();
        int Student2 = student.facultyScore();
        if (Student1 > Student2) {
            System.out.println(this.getName() + " лучший Пуффендуец, чем " + student.getName());
        } else if (Student1 < Student2) {
            System.out.println(student.getName() + " лучший Пуффендуец, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + student.getName() + " равны");
        }
    }
}
