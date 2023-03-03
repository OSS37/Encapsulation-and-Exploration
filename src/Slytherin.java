public class Slytherin extends hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int power;

    public Slytherin(String name, int magicPower, int transgress, int cunning, int determination, int ambition, int resourcefulness, int power) {
        super(name, magicPower, transgress);
        this.cunning = correctnessOfInitialData(cunning);
        this.determination = correctnessOfInitialData(determination);
        this.ambition = correctnessOfInitialData(ambition);
        this.resourcefulness = (resourcefulness);
        this.power = correctnessOfInitialData(power);
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void printStudent() {
        System.out.println("Студент:" + getName());
        printGeneralQualities();
        System.out.println("Хитрость:" + cunning);
        System.out.println("Решительность:" + determination);
        System.out.println("Амбициозность:" + ambition);
        System.out.println("Находчивость:" + resourcefulness);
        System.out.println("Жажда власти:" + power);
        System.out.println();
    }
    @Override
    public int facultyScore () {
        return cunning + determination + ambition + resourcefulness + power;
    }

    public void printFacultytComparison(Slytherin student) {
        int Student1 = this.facultyScore();
        int Student2 = student.facultyScore();
        if (Student1 > Student2) {
            System.out.println(this.getName() + " лучший Слизеринец, чем " + student.getName());
        } else if (Student1 < Student2) {
            System.out.println(student.getName() + " лучший Слизеринец, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + student.getName() + " равны");
        }
    }
}
