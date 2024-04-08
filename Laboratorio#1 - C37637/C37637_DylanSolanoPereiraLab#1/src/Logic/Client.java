/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author dylan
 */
public class Client {
    //Atributes
    
    private String id;
    private String name;
    private String phone;
    private String adress;
    
    //Constructors

    public Client() {
    }

    public Client(String id, String name, String phone, String adress) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.adress = adress;
    }

    //Setters and Getters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    
    //toString method

    @Override
    public String toString() {
        
        String results= "\nClient information:"
        +"\n---------------------"
        +"\nID:" +this.getId()
        +"\nName:" +this.getName() 
        +"\nPhone:" +this.getPhone()
        +"\nAdress:" +this.getAdress()+"\n";
        
        return results;
                
    }
    
}
