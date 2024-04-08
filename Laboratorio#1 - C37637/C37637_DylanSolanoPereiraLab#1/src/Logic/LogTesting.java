/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import Logic.Log;

/**
 *
 * @author dylan
 */
public class LogTesting {

    public LogTesting() {
    }
    
    public void test(){
        Client clients[] = new Client[10];
        Client client1 = new Client("1234","Dylan","3048","8729");
        Client client2 = new Client("1234","Dylann","30487","87297");
        Client client3 = new Client("1234","Dylannn","30481","87291");
        
        clients[0]=client1;
        clients[1]=client2;
        clients[2]=client3;
        
        SavingAccount account1 = new SavingAccount("12/12/12",12,21,"1243",100,client1);
        SavingAccount account2 = new SavingAccount("12/12/12",12,21,"1243",100,client2);
        
        CurrentAccount account3 = new CurrentAccount(21,"1234",12,client3);
        
        Log log[] = new Log[5];
        log[0]=new Log(1,"Saving Ammount",account3,7000);
        log[1]=new Log(2,"WithDraw Ammount",account2,5000);
        log[2]=new Log(3,"WithDraw Ammount",account3,5000);
        
        for(int i = 0; i<log.length; i++){
            if(log[i]!=null){
                System.out.println(log[i].toString());
            }
        }
    }
}
