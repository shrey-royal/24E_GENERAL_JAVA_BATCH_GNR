public class StrBuild {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer sbuff = new StringBuffer("String");
        for (int i = 0; i < 1000; i++) {
            // sbuild.append("(T_T)");
            System.out.println(sbuff);
        }
        
        long buffTime = System.currentTimeMillis() - startTime;
        
        StringBuilder sbuild = new StringBuilder("String");
        for (int i = 0; i < 1000; i++) {
            // sbuild.append("(T_T)");
            System.out.println(sbuild);
        }

        long buildTime = System.currentTimeMillis() - startTime;
        System.out.println("StringBuffer: " + buffTime + " ms\nStringBuilder: " + buildTime + " ms");
    }
}
