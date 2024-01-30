package Design_Pattern.Builder;

public class Main {
    public static void main(String[] args) {
        URL url1 = new URL("https://","localhost:",8080,"/index.html","?name=sagar");
        System.out.println(url1);

        // Building URL is complex as there are many attributes which are optional
        // Those attributes passed sometimes and not passed

        URL url2 = new URL();
        url2.setProtocol("http://");
        url2.setHost("localhost/");
        url2.setPath("index.html");
        System.out.print(url2.getProtocol());
        System.out.print(url2.getHost());
        System.out.println(url2.getPath());

        // Solution is for above problem is to use Builder Design Pattern. Will use URLBuilder for that.

    }
}
