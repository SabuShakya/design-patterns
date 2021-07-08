package shape;

/**
 * @author Sabu Shakya
 * @email <sabu.shakya@f1soft.com>
 * @createdDate 2021/07/06
 */
public abstract class Shape implements Cloneable {

    private Long id;

    protected String type;

    protected String data;

    public Shape() {
        simulateDBHit();
    }

    public abstract void draw();

    public void simulateDBHit() {
        System.out.println("Started Hitting DB");
        try {
            Thread.sleep(1000);
            data = "Heavy DB data";
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ended Hitting DB");
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "shape.Shape{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
