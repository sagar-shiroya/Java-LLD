package Design_Pattern.Builder;

public class URL {
    private String protocol;
    private String host;
    private Integer port;
    private String path;
    private String queryParam;

    public URL(){

    }

    public URL(String protocol, String host){
        this.protocol = protocol;
        this.host = host;
    }

    //    If port is passed while creating URL
    public URL(String protocol, String host, Integer port){
        this.protocol = protocol;
        this.host = host;
        this.port = port;
    }

    //    If path is passed while creating URL
    public URL(String protocol, String host, String path){
        this.protocol = protocol;
        this.host = host;
        this.path= path;
    }

    // If port and path passed while creating URL
    public URL(String protocol, String host, Integer port, String path) {
        this.protocol = protocol;
        this.host = host;
        this.port = port;
        this.path = path;
    }

    // If all attributes passed while creating URL
    public URL(String protocol, String host, Integer port, String path, String queryParam) {
        this.protocol = protocol;
        this.host = host;
        this.port = port;
        this.path = path;
        this.queryParam = queryParam;
    }

    // If port not passed while creating URL
    public URL(String protocol, String host, String path, String queryParam) {
        this.protocol = protocol;
        this.host = host;
        this.path = path;
        this.queryParam = queryParam;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getQueryParam() {
        return queryParam;
    }

    public void setQueryParam(String queryParam) {
        this.queryParam = queryParam;
    }

    @Override
    public String toString() {
        return getProtocol() + getHost() + getPort() + getPath() + getQueryParam();
    }
}
