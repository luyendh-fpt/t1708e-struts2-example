package hello.world.entity;


public class User {

    private String username;
    private String password;
    private String email;
    private long createdAtMLS;
    private long updatedAtMLS;
    private int status;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCreatedAtMLS() {
        return createdAtMLS;
    }

    public void setCreatedAtMLS(long createdAtMLS) {
        this.createdAtMLS = createdAtMLS;
    }

    public long getUpdatedAtMLS() {
        return updatedAtMLS;
    }

    public void setUpdatedAtMLS(long updatedAtMLS) {
        this.updatedAtMLS = updatedAtMLS;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }


    public static final class Builder {
        private String username;
        private String password;
        private String email;
        private long createdAtMLS;
        private long updatedAtMLS;
        private int status;

        private Builder() {
        }

        public static Builder anUser() {
            return new Builder();
        }

        public Builder withUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder withPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withCreatedAtMLS(long createdAtMLS) {
            this.createdAtMLS = createdAtMLS;
            return this;
        }

        public Builder withUpdatedAtMLS(long updatedAtMLS) {
            this.updatedAtMLS = updatedAtMLS;
            return this;
        }

        public Builder withStatus(int status) {
            this.status = status;
            return this;
        }

        public User build() {
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            user.setEmail(email);
            user.setCreatedAtMLS(createdAtMLS);
            user.setUpdatedAtMLS(updatedAtMLS);
            user.setStatus(status);
            return user;
        }
    }
}
