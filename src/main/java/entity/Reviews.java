package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "reviews")
public class Reviews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "review", length = 150)
    private String review;


    public Reviews(){}
    public Reviews(String review){
        this.review = review;
    }

    @Override
    public String toString(){
        return this.review;
    }

}
