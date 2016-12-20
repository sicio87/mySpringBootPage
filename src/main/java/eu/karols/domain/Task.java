package eu.karols.domain;

import javax.persistence.*;

@Entity
@Table(name = "tasks")
public class Task {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
	@Column(nullable = false, length = 300)
    private String name;
 
	@Lob @Column(nullable = false)
    private String description;
 
	@Column(nullable = false)
    private Double budget;
 
    @Column(nullable = false)
    private Boolean done;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private User author;
 
    //Gettery, Settery itp.
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getDescription() {
        return description;
    }
 
    public void setDescription(String description) {
        this.description = description;
    }
 
    public Double getBudget() {
        return budget;
    }
 
    public void setBudget(Double budget) {
        this.budget = budget;
    }
 
    public Boolean getDone() {
        return done;
    }
 
    public void setDone(Boolean done) {
        this.done = done;
    }
    
    public User getAuthor() {
        return author;
    }
 
    public void setDone(User author) {
        this.author = author;
    }
 
    public Task withId(final Long id) {
        this.id = id;
        return this;
    }
 
    public Task withName(final String name) {
        this.name = name;
        return this;
    }
 
    public Task withDescription(final String description) {
        this.description = description;
        return this;
    }
 
    public Task withBudget(final Double budget) {
        this.budget = budget;
        return this;
    }
 
    public Task withDone(final Boolean done) {
        this.done = done;
        return this;
    }
    
    public Task() {
	}

	public Task(Long id, String name, String description, Double budget, Boolean done, User author) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.budget = budget;
		this.done = done;
		this.author = author;
	}

	@Override
    public String toString() {
        return "TaskEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", budget=" + budget +
                ", done=" + done +
                ", author=" + author +
                '}';
    }
}
