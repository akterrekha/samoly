
public class threeDimensionArrayWithString {

    public static void main(String[] args) {
        String threeD[][][] = {
            {
                {"a", "b", "c"},
                {"d", "e", "f"}
            },
            {
                {"g", "h", "i"},
                {"j", "k", "l"},
                {"m", "n", "o", "p"}
            },
            {
                {"q", "r", "s", "t", "u"},
                {"v", "w", "x", "y", "z"}
            },
            {
                {"10", "20", "30", "40", "50"},
                {"60", "70", "80", "90"},
                {"100", "110", "120",},
                {"2000", "9000"},
                {"55555555"}
            }

        };
        for (String twoD[][] : threeD) {
            for (String oneD[] : twoD) {
                for (String i : oneD) {
                    System.out.print(i + "");

                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }
    }
}                                                                                                                                             
