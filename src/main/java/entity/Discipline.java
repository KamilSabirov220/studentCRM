package entity;

import java.util.Objects;

public class Discipline {

    private int id;
    private String discipline_name;

    private byte status;

    public Discipline() {
    }

    public Discipline(int id, String discipline_name, byte status) {
        this.id = id;
        this.discipline_name = discipline_name;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDiscipline_name() {
        return discipline_name;
    }

    public void setDiscipline_name(String discipline_name) {
        this.discipline_name = discipline_name;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Discipline that = (Discipline) o;
        return id == that.id && status == that.status && Objects.equals(discipline_name, that.discipline_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, discipline_name, status);
    }

    @Override
    public String toString() {
        return "Discipline{" +
                "id=" + id +
                ", discipline_name='" + discipline_name + '\'' +
                ", status=" + status +
                '}';
    }
}
