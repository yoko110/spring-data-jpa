package com.spring.data.jpa.example.repository.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 性別の列挙
     */
    public static enum Sex {
        male, female
    }

    /** 社員番号 */
    @Id
    @GeneratedValue
    private Integer no;

    /** 名前 */
    @Column(length = 20, nullable = false)
    private String firstName;

    /** 苗字 */
    @Column(length = 20, nullable = false)
    private String lastName;

    /** 性別 */
    @Column(length = 10)
    @Enumerated(EnumType.STRING)
    private Sex sex;

    /** 生年月日 */
    private java.sql.Date birthday;

    /** メールアドレス */
    @Column(unique = true)
    private String mailAddress;
}