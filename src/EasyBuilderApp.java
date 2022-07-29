public class EasyBuilderApp {
    public static void main(String[] args) {
        System.out.println("Start Easy Builder App!");
        System.out.println("*********************\n");

        Report report = new Report
                .Builder("Отчёт за 3 квартал 2021 года")
                .setTitle("Закупка")
                        .setContent("Реализовано успешно.")
                                .setTable("Таблица цен.")
                                        .setPageNumber(1)
                                                .build();

        System.out.println(report);

        System.out.println(report.getHeader());
        System.out.println(report.getTable());
        System.out.println(report.getPageNumber());




        System.out.println("\n*****************");
        System.out.println("Easy Builder App is Done!");
    }
}
