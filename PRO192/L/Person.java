package L;

public abstract class Person {
    public String email, fullName, gender, phoneNumber, address, birthday;



    public Person (String email, String fullName, String gender, String phoneNumber, String address, String birthday){
        this.email = email;
        this.fullName = fullName;
        this. gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.birthday = birthday;
    }
//    hàm khởi tạo khong đối số
    public  Person() {
    }

//    method
    public void changePhoneNumber(String newPhoneNumber){
        this.phoneNumber = newPhoneNumber;
    }

    public void changeAddress(String newAddress){
        this.address = newAddress;
    }


    public void showInformation (){
        System.out.println("Your email: "+ email);
        System.out.println("Your full name: "+ fullName);
        System.out.println("Your gender: "+ gender);
        System.out.println("Your phone number: "+ phoneNumber);
        System.out.println("Your address: "+ address);
        System.out.println("Your birthday: "+ birthday);
    }

}
