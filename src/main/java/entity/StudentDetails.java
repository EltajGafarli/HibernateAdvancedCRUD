package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student_details")
public class StudentDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "description", length = 250)
    private String description;

    @OneToOne(cascade = {
            CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH
    }, mappedBy = "studentDetails")
    private Student student;

    public StudentDetails(){}
    public StudentDetails(String description){ this.description = description; }

    public Student getStudent(){return this.student;}
    public void setStudent(Student student){ this.student = student; }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString(){
        return this.description;
    }
}
