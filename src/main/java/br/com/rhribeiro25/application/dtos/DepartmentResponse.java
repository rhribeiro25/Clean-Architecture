package br.com.rhribeiro25.application.dtos;

// Dto Response
public class DepartmentResponse {

    private String code;

    public DepartmentResponse() {}

    private DepartmentResponse(Builder builder) {
        this.code = builder.code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "DepartmentFileEntity{" +
                "code='" + code + '\'' +
                '}';
    }

    public static class Builder {

        private String code;

        public Builder code(String name) {
            this.code = code;
            return this;
        }

        public DepartmentResponse build() {
            return new DepartmentResponse(this);
        }
    }
}
