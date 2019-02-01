package database;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Doctor {
    private int id;
    private String docName;
    private String area;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DOC_NAME", nullable = false, length = 20)
    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    @Basic
    @Column(name = "AREA", nullable = false, length = 20)
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return id == doctor.id &&
                Objects.equals(docName, doctor.docName) &&
                Objects.equals(area, doctor.area);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, docName, area);
    }
}
