package com.cybage;

 

public class User extends Object implements Comparable<User>{
    private int id;
    private String name;
    public User() {
        super();
    }
    public User(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
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
    @Override
    public String toString() {
        return "\nUser [id=" + id + ", name=" + name + "]";
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
//    @Override
//    public int compareTo(User o) {    // positive, negative , 0
//        return this.getId() - o.getId();
//    }
//    @Override
//    public int compareTo(User o) {    // positive, negative , 0
//        return o.getId() - this.getId();
//    }
//    @Override
//    public int compareTo(User o) {    // positive, negative , 0
//        return this.getName().compareTo(o.getName());
//    }
    @Override
    public int compareTo(User o) {    // positive, negative , 0
        return o.getName().compareTo(this.getName());
    }
    
}
 