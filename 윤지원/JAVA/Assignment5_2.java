public class Assignment5_2 {
    public static void main(String[] args) throws Exception {
        light("RED");
        light("YELLOW");
        light("GREEN");
        light("BLUE");
        System.out.println("Hello, World!");
    }

    public static void light (String color) {
        switch (color) {
            case "RED" -> System.out.println("빨간불이 켜집니다.");
            case "YELLOW" -> System.out.println("노란불이 켜집니다.");
            case "GREEN" -> System.out.println("초록불이 켜집니다.");
            default -> System.out.printf("에러, 잘못된 색 입력: %s\n", color);
        }
      }
}