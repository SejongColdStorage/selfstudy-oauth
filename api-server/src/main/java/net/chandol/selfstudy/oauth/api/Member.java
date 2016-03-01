package net.chandol.selfstudy.oauth.api;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class Member implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String username;
    private String remark;

    public Member() {
    }

    public Member(String name, String username, String remark) {
        this.name = name;
        this.username = username;
        this.remark = remark;
    }
}
