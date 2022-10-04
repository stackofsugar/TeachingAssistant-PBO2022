public class RegEx {
    public static void main(String[] args) {
        String strPat = "12[987]34";
        String str1 = "12934";
        String str2 = "129834";
        String str3 = "12734";

        System.out.println("str1: " + str1.matches(strPat));
        System.out.println("str2: " + str2.matches(strPat));
        System.out.println("str3: " + str3.matches(strPat));

        String strPat2 = "A[a-z0-9][A-Z]";
        String str4 = "AzH";
        String str5 = "A3H";
        String str6 = "A+H";
        System.out.println("str4: " + str4.matches(strPat2));
        System.out.println("str5: " + str5.matches(strPat2));
        System.out.println("str6: " + str6.matches(strPat2));

        String strPat3 = "abc[a-z&&[^e-j]]";
        String str7 = "abcd";
        String str8 = "abcf";
        System.out.println("str7: " + str7.matches(strPat3));
        System.out.println("str8: " + str8.matches(strPat3));

        String strPat4 = "A{2}[0-9]{3,4}";
        String str9 = "AA123";
        String str10 = "A123";
        String str11 = "AA873495";
        System.out.println("str9: " + str9.matches(strPat4));
        System.out.println("str10: " + str10.matches(strPat4));
        System.out.println("str11: " + str11.matches(strPat4));

        String strPat5 = "(Hai |Hello ){2}(Dunia|World)";
        String str12 = "Hello Hai World";
        String str13 = "Hai Dunia";
        System.out.println("str12: " + str12.matches(strPat5));
        System.out.println("str13: " + str13.matches(strPat5));
    }
}
