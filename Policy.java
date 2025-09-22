public class Policy
{
    //instance fields
    private int      policyNumber;
    private String   providerName;
    private String   firstName;
    private String   lastName;
    private int      age;
    private String   smokingStatus;
    private double   height;
    private double   weight;
    
    //no-arg constructor with default values
    public Policy()
    {
        policyNumber = 0;
        providerName = "No Information";
        firstName = "No Information";
        lastName = "No Information";
        age = 0;
        smokingStatus = "No Information";
        height = 0.0;
        weight = 0.0;
    }
    
    //constructor with values
    public Policy(int policyNumberA, String providerNameA, String firstNameA, String lastNameA, int ageA, 
                  String smokingStatusA, double heightA, double weightA)
    {
        policyNumber = policyNumberA;
        providerName = providerNameA;
        firstName = firstNameA;
        lastName = lastNameA;
        age = ageA;
        smokingStatus = smokingStatusA;
        height = heightA;
        weight = weightA;

    }
    
    //mutator methods (set)
    public void setPolicyNumber(int policyNumberA)
    {
        policyNumber = policyNumberA;
    }
    public void setProviderName(String providerNameA)
    {
        providerName = providerNameA;
    }
    public void setFirstName(String firstNameA)
    {
        firstName = firstNameA;
    }
    public void setLastName(String lastNameA)
    {
        lastName = lastNameA;
    }
    public void setAge(int ageA)
    {
        age = ageA;
    }
    public void setSmokingStatus(String smokingStatusA)
    {
        smokingStatus = smokingStatusA;
    }
    public void setHeight(double heightA)
    {
        height = heightA;
    }
    public void setWeight(double weightA)
    {
        weight = weightA;
    }
    
    //accessor methods (get)
    public int getPolicyNumber()
    {
        return policyNumber;
    }
    public String getProviderName()
    {
        return providerName;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public int getAge()
    {
        return age;
    }
    public String getSmokingStatus()
    {
        return smokingStatus;
    }
    public double getHeight()
    {
        return height;
    }
    public double getWeight()
    {
        return weight;
    }
    
    //method that calculates and returns the BMI
    public double getBMI()
    {
        return (weight * 703) / (height * height);
    }
    //method that calculates and returns the price
    public double getPrice()
    {
        double price = 600.0;
        if (age > 50)
        {
            price += 75.0;
        }
        if (smokingStatus.equalsIgnoreCase("smoker"))
        {
            price += 100.0;
        }
        double bmi = getBMI();
        if (bmi > 35)
        {
            price += (bmi - 35) * 20;
        }
        return price;
    }
    
}