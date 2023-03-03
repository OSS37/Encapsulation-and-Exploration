public class Main {
    public static void main(String[] args) {
        Gryffindor HarryPotter = new Gryffindor("Гарри Поттер", 90, 90,90,90, 90);
        Gryffindor HermioneGranger = new Gryffindor("Гермиона Грейнджер", 90, 95,50,50, 50);
        Gryffindor RonWeasley = new Gryffindor("Рон Уизли", 60, 50,60,70, 70);

        Hufflepuff ZachariasSmith = new Hufflepuff("Захария Смит",60,50,65,55,70);
        Hufflepuff CedricDiggory = new Hufflepuff("Седрик Диггори",55,55,80,70,65);
        Hufflepuff JustinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли",65,45,45,50,70);

        Ravenclaw ZhouChang = new Ravenclaw("Чжоу Чанг", 45,45,70,65,60,80);
        Ravenclaw PadmaPatil = new Ravenclaw("Падма Патил", 45,45,70,65,60,80);
        Ravenclaw MarcusBelby = new Ravenclaw("Маркус Белби", 55,55,65,60,50,55);

        Slytherin DracoMalfoy = new Slytherin("Драко Малфой", 70,80,80,80,90,70,85);
        Slytherin GrahamMontague = new Slytherin("Грэхэм Монтегю", 65,60,50,55,45,55,60);
        Slytherin GregoryGoyle = new Slytherin("Грегори Гойл", 55,55,55,50,55,45,65);

        HarryPotter.printStudent();
        ZachariasSmith.printStudent();
        ZhouChang.printStudent();
        DracoMalfoy.printStudent();

        HarryPotter.printFacultytComparison(RonWeasley);
        ZachariasSmith.printFacultytComparison(JustinFinchFletchley);
        ZhouChang.printFacultytComparison(PadmaPatil);
        DracoMalfoy.printFacultytComparison(GrahamMontague);

        HermioneGranger.printComparison(CedricDiggory);
        MarcusBelby.printComparison(GregoryGoyle);
    }
}