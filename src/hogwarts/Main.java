package hogwarts;

public class Main {
    public static void main(String[] args) {
        GryffindorStudent harryPotter = new GryffindorStudent("Гарри Поттер", 10, 10, 8, 7, 10);
        GryffindorStudent hermioneGranger = new GryffindorStudent("Гермиона Грейнджер", 7, 2, 10, 10, 9);
        GryffindorStudent ronWeasley = new GryffindorStudent("Рон Уизли", 6, 4, 3, 6, 2);

        SlytherinStudent dracoMalfoy = new SlytherinStudent("Драко Малфой", 4, 3, 6, 2, 8, 10, 2);
        SlytherinStudent grahamMontague = new SlytherinStudent("Грэхэм Монтегю", 4, 5, 6, 5, 4, 9, 3);
        SlytherinStudent gregoryGuile = new SlytherinStudent("Грегори Гайл", 3, 7, 1, 7, 2, 11, 6);

        HufflepuffStudent zachariahSmith = new HufflepuffStudent("Захария Смит", 8, 5, 5, 4, 11);
        HufflepuffStudent cedricDiggory = new HufflepuffStudent("Седрик Диггори", 9, 3, 5, 2, 12);
        HufflepuffStudent justinFinchFletchley = new HufflepuffStudent("Джастин Финч-Флетчли", 5, 2, 6, 7, 8);

        RavenclawStudent zhouChang = new RavenclawStudent("Чжоу Чанг", 5, 8, 3, 4, 7, 5);
        RavenclawStudent padmaPatil = new RavenclawStudent("Падма Патил", 4, 7, 9, 3, 5, 6);
        RavenclawStudent marcusBelby = new RavenclawStudent("Маркус Белби", 6, 4, 7, 2, 9, 4);

        HogwartsStudent[] students = {harryPotter, hermioneGranger, ronWeasley,
                dracoMalfoy, grahamMontague, gregoryGuile,
                zachariahSmith, cedricDiggory, justinFinchFletchley,
                zhouChang, padmaPatil, marcusBelby};

        for (int i = 0; i < students.length; i++) {
            HogwartsStudent first = students[i];
            for (int j = i + 1; j < students.length; j++) {
                HogwartsStudent second = students[j];
                first.compareTo(second);
            }
        }

        harryPotter.innerCompareTo(hermioneGranger);
        ronWeasley.innerCompareTo(hermioneGranger);
        harryPotter.innerCompareTo(ronWeasley);

        dracoMalfoy.innerCompareTo(grahamMontague);
        gregoryGuile.innerCompareTo(dracoMalfoy);
        grahamMontague.innerCompareTo(gregoryGuile);

        zachariahSmith.innerCompareTo(justinFinchFletchley);
        justinFinchFletchley.innerCompareTo(cedricDiggory);
        cedricDiggory.innerCompareTo(zachariahSmith);

        zhouChang.innerCompareTo(marcusBelby);
        padmaPatil.innerCompareTo(zhouChang);
        marcusBelby.innerCompareTo(padmaPatil);

    }
}