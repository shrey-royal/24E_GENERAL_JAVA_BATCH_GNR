public class Task8 {
    public static void main(String[] args) {
        String log = "[2023-11-30 10:15:20] ERROR: Database connection failed\n" + 
                     "[2023-11-30 10:20:35] ERROR: File not found";

        int startIndex = 0, endIndex = 0;
        while (startIndex < log.length() && endIndex != -1) {
            endIndex = log.indexOf('\n', startIndex);
            if(endIndex == -1) {
                endIndex = log.length();
            }

            if(endIndex != -1) {
                String line = log.substring(startIndex, endIndex);
                int timeStampEndIndex = line.indexOf(']') + 1;
                if(timeStampEndIndex != 0) {
                    String timestamp = line.substring(0, timeStampEndIndex).trim();
                    String error = line.substring(timeStampEndIndex).trim();
                    System.out.println("TimeStamp: " + timestamp);
                    System.out.println("Error: " + error + "\n");
                }
                startIndex = endIndex+1;
            }
        }
    }
}
