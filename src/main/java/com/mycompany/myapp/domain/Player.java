package com.mycompany.myapp.domain;


import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * A Player.
 */
@Entity
@Table(name = "player")
public class Player implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

    @NotNull
    @Size(max = 20)
    @Column(name = "surname", length = 20, nullable = false)
    private String surname;

    @Column(name = "birthday")
    private LocalDate birthday;

    @Column(name = "baskets")
    private Integer baskets;

    @Min(value = 0)
    @Column(name = "rebouts")
    private Integer rebouts;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Player name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public Player surname(String surname) {
        this.surname = surname;
        return this;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Player birthday(LocalDate birthday) {
        this.birthday = birthday;
        return this;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Integer getBaskets() {
        return baskets;
    }

    public Player baskets(Integer baskets) {
        this.baskets = baskets;
        return this;
    }

    public void setBaskets(Integer baskets) {
        this.baskets = baskets;
    }

    public Integer getRebouts() {
        return rebouts;
    }

    public Player rebouts(Integer rebouts) {
        this.rebouts = rebouts;
        return this;
    }

    public void setRebouts(Integer rebouts) {
        this.rebouts = rebouts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Player player = (Player) o;
        if(player.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, player.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Player{" +
            "id=" + id +
            ", name='" + name + "'" +
            ", surname='" + surname + "'" +
            ", birthday='" + birthday + "'" +
            ", baskets='" + baskets + "'" +
            ", rebouts='" + rebouts + "'" +
            '}';
    }
}
