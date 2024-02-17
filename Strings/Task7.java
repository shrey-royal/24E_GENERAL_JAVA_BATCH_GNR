public class Task7 {
    public static void main(String[] args) {
        String url = "https://www.example.com/path/to/resource?param1=value1&param2=value2";
        parseURL(url);
    }

    public static void parseURL(String urlString) {
        int protocolEndIndex = urlString.indexOf("://");
        String protocol = urlString.substring(0, protocolEndIndex);
        
        int domainStartIndex = protocolEndIndex + 3;
        int domainEndIndex = urlString.indexOf('/', domainStartIndex);
        String domain = urlString.substring(domainStartIndex, domainEndIndex);

        int pathStartIndex = domainEndIndex;
        int pathEndIndex = urlString.indexOf('?', pathStartIndex);
        String path = urlString.substring(pathStartIndex, pathEndIndex != -1 ? pathEndIndex : urlString.length());

        int queryParamsStartIndex = pathEndIndex != -1 ? pathEndIndex + 1 : urlString.length();
        String queryParamsString = urlString.substring(queryParamsStartIndex);
        String[] queryParamsArray = queryParamsString.split("&");
        // System.out.println(Arrays.deepToString(queryParamsArray));
        System.out.println("Seperated components - ");
        System.out.println("Protocol: " + protocol);
        System.out.println("Domain: " + domain);
        System.out.println("Path: " + path);
        System.out.print("Query Parameters: { ");
        for (String queryParam : queryParamsArray) {
            String[] pair = queryParam.split("=");
            System.out.print("\"" + pair[0] + "\": \"" + pair[1] + "\", ");
        }
        System.out.println("\b\b }");
    }
}

/*
Separated components - 
protocol: "https", 
domain: "www.example.com", 
path: "/path/to/resource", 
query parameters: {"param1": "value1", "param2": "value2"}

*/