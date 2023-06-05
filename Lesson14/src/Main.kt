object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val words = Words()
        words.add("Car", "машина")
        words.add("Bird", "птица")
        words.add("Cup", "чашка")
        words.add("Самолёт", "airplane")
        words.add("Дом", "house")
        words.add("Лодка", "boat")
        words.printAll()
        //        System.out.println(words.autochek("Парус Car"));
    } //    public static void main(String[] args) {
    //        int select;
    //        int delete;
    //        Scanner scanner = new Scanner(System.in);
    //        Words words = new Words();
    //        do {
    //            System.out.println("""
    //                0)Show all words
    //                1)Translate
    //                2)Add word
    //                3)Delete some word
    //                4)Exit
    //                """);
    //            try {
    //                select = scanner.nextInt();
    //                if (Codes.getEnumByCode(select) == Codes.EXIT){
    //                    System.out.println("Exit");
    //                    break;
    //                } else if (Codes.getEnumByCode(select) == Codes.SHOW) {
    //                    System.out.println("Show");
    //
    //                } else if (Codes.getEnumByCode(select) == Codes.ADD) {
    //                    System.out.println("ADD");
    //                } else if (Codes.getEnumByCode(select) == Codes.TRANSLATE) {
    //                    System.out.println("TRANSLATE");
    //                } else if (Codes.getEnumByCode(select) == Codes.DELETE) {
    //                    System.out.println("DELETE");
    //                }
    //            }catch (InputMismatchException exception){
    //                scanner = new Scanner(System.in);
    //            }catch (Exception exception){
    //                System.out.println("Invalid input");
    //            }
    //        }while (true);
    //    }
}