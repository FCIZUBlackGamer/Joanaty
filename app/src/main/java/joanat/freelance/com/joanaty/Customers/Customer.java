package joanat.freelance.com.joanaty.Customers;

public class Customer {
    int Id;
    float totalDept;
    String name, phone, image, address, jobTitle;

    public Customer(int id, float totalDept, String name, String phone, String image, String address, String jobTitle) {
        Id = id;
        this.totalDept = totalDept;
        this.name = name;
        this.phone = phone;
        this.image = image;
        this.address = address;
        this.jobTitle = jobTitle;
    }

    public String getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return Id;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public float getTotalDept() {
        return totalDept;
    }

    public String getJobTitle() {
        return jobTitle;
    }
}
