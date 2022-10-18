package laden;

import static java.lang.Math.floor;

public class Product
{
    private double basePrice;
    private int age;

    public Product(double basePrice, int age) {
        setBasePrice(basePrice);
        this.age = age;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        if((basePrice/0.05d) % 1 == 0)
            this.basePrice = basePrice;
        else
        {
            this.basePrice = (floor(basePrice/0.05d)+1)*0.05d;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getDiscountPrice()
    {
        if(age >20)
            return basePrice * 0.8d;
        if(age >10)
            return basePrice * 0.9d;
        return basePrice;
    }
}


