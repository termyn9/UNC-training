package UNC.part1.domain;

import java.util.Objects;

public class Fish {

    private Long id;
    private String name;
    private Long foodLike;

    public Fish(long fishId3, Long id){ this.id = id;}

    public Fish(Long foodLike){
        this.foodLike = foodLike;
    }

    public Fish(Long id, String name, Long foodLike){
        this.id = id;
        this.name = name;
        this.foodLike = foodLike;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getName() {return name;}
    public void setName() {this.name = name;}

    public Long getFood() {return foodLike;}
    public void setFood() {this.foodLike = foodLike;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fish fish = (Fish) o;
        return Objects.equals(id, fish.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        final StringBuffer aqua = new StringBuffer("Fish { ");
        aqua.append("id = ").append(id);
        aqua.append(", name = ").append(name);
        aqua.append(", food preference ").append(foodLike);
        aqua.append(" }");
        return aqua.toString();
    }

}
