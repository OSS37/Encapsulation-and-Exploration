public class  Gryffindor extends hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, int magicPower, int transgress, int nobility, int honor, int courage) {
        super(name, magicPower, transgress);
        this.nobility = correctnessOfInitialData(nobility);
        this.honor = correctnessOfInitialData(honor);
        this.courage = correctnessOfInitialData(courage);
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    @Override
    public void printStudent() {
        System.out.println("Студент:" + getName());
        printGeneralQualities();
        System.out.println("Благородство:" + nobility);
        System.out.println("Честь:" + honor);
        System.out.println("Храбрость:" + courage);
        System.out.println();
    }
    @Override
    public int facultyScore () {
        return nobility + honor + courage;
    }

    public void printFacultytComparison(Gryffindor student) {
        int Student1 = this.facultyScore();
        int Student2 = student.facultyScore();
        if (Student1 > Student2) {
            System.out.println(this.getName() + " лучший Гриффиндорец, чем " + student.getName());
        } else if (Student1 < Student2) {
            System.out.println(student.getName() + " лучший Гриффиндорец, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + student.getName() + " равны");
        }
    }
}
