public class Ravenclaw extends hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public Ravenclaw(String name, int magicPower, int transgress, int smart, int wise, int witty, int creativity) {
        super(name, magicPower, transgress);
        this.smart = correctnessOfInitialData(smart);
        this.wise = correctnessOfInitialData(wise);
        this.witty = correctnessOfInitialData(witty);
        this.creativity = correctnessOfInitialData(creativity);
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    public void printStudent() {
        System.out.println("Студент:" + getName());
        printGeneralQualities();
        System.out.println("Интелект:" + smart);
        System.out.println("Мудрость:" + wise);
        System.out.println("Остроумность:" + witty);
        System.out.println("Творчество:" + creativity);
        System.out.println();
    }
    @Override
    public int facultyScore () {
        return smart + wise + witty + creativity;
    }
    public void printFacultytComparison(Ravenclaw student) {
        int Student1 = this.facultyScore();
        int Student2 = student.facultyScore();
        if (Student1 > Student2) {
            System.out.println(this.getName() + " лучший Когтевранец, чем " + student.getName());
        } else if (Student1 < Student2) {
            System.out.println(student.getName() + " лучший Когтевранец, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + student.getName() + " равны");
        }
    }


}
