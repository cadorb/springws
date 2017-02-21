package eu.goldenk.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Firmware {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name ="name", nullable = false)
    private String name;

    @Column(name = "version", nullable = false)
    private int version;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

}
