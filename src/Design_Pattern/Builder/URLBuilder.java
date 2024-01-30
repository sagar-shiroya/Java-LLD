package Design_Pattern.Builder;

public class URLBuilder {
    private final String protocol;
    private final String host;
    private final Integer port;
    private final String path;
    private final String queryParam;

    public URLBuilder(Builder builder) {
        this.protocol = builder.protocol;
        this.host = builder.host;
        this.port = builder.port;
        this.path = builder.path;
        this.queryParam = builder.queryParam;
    }

    public String getProtocol() {
        return protocol;
    }

    public String getHost() {
        return host;
    }

    public Integer getPort() {
        return port;
    }

    public String getPath() {
        return path;
    }

    public String getQueryParam() {
        return queryParam;
    }

    public static class Builder{
        private String protocol;
        private String host;
        private Integer port;
        private String path;
        private String queryParam;

        public String getProtocol() {
            return protocol;
        }

        public String getHost() {
            return host;
        }

        public Integer getPort() {
            return port;
        }

        public String getPath() {
            return path;
        }

        public String getQueryParam() {
            return queryParam;
        }

        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder host(String host) {
            this.host = host;
            return this;
        }

        public Builder port(Integer port) {
            this.port = port;
            return this;
        }

        public Builder path(String path) {
            this.path = path;
            return this;
        }

        public Builder queryParam(String queryParam) {
            this.queryParam = queryParam;
            return this;
        }

        public URLBuilder build(){
            return new URLBuilder(this);
        }
    }
}
