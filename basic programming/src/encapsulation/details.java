package encapsulation;

public class details {
	String name;
	String address;
	String contactNumber;
	String email;
	 String proofType;
	String proofID;
	public String getName() {
		return name;
	}
	public boolean setName(String name)
    {
        if (name.matches("^[a-zA-Z]+$"))
        {
            this.name=name;
            return true;
        }
        else
        {
            System.out.println("Invalid name");
            return false;
        }
    }

public String getAddress() {
		return address;
	}
	
public boolean setaddress(String address)
{
    if (name.matches("^[a-zA-Z0-9]+$"))
    {
        this.address=address;
        return true;
    }
    else
    {
        System.out.println("Invalid address");
        return false;
    }
}
	public String getContactNumber() {
		return contactNumber;
	}
	public boolean setcontactNumber(String contactNumber)
    {
        if (contactNumber.matches("^[0-9]*$"))
        {
            this.contactNumber=contactNumber;
            return true;
        }
        else
        {
            System.out.println("Invalid Contact Number");
            return false;
        }
    }
	
	public String getEmail() {
		return email;
	}
	public boolean setEmail(String email)
    {
        if (email.contains("@"))
        {
            this.email=email;
            return true;
        }
        else
        {
            System.out.println("Invalid Email");
            return false;
        }
    }
	
	
	public String getProofType() {
		return proofType;
	}
	public boolean setprooftype(String prooftype)
    {
        if (prooftype.contains("^[a-zA-Z]+$"))
        {
            this.proofType=prooftype;
            return true;
        }
        else
        {
            System.out.println("Invalid prooftype");
            return false;
        }
    }
	
	public String getProofID() {
		return proofID;
	}
	public boolean setproofid(String proofid)
    {
        if (proofid.contains("^[a-zA-Z0-9]+$"))
        {
            this.proofType=proofid;
            return true;
        }
        else
        {
            System.out.println("Invalid proofid");
            return false;
        }
    }
	
	public void show()
	{
		System.out.println("*****REGISTRATION*****");
		System.out.println("Name"+name);
	     System.out.println("Address"+address);
	     System.out.println("ContactNumber"+contactNumber);
	     System.out.println("Email"+email);
	     System.out.println("ProofType"+proofType);
	     System.out.println("ProofID"+proofID);
	     System.out.println("Thank you for registering. Your id is 1.");
	}
	
   

}
