package controllers;

import models.Mail;
import org.springframework.web.bind.annotation.RequestBody;

import java.sql.Date;
import java.util.List;

//@RestController
//@RequestMapping(value="/Mail")
public class MailController {



    private Mail mails;
    public MailController() {
        mails=new Mail();
    }
   // @RequestMapping(method=RequestMethod.POST,value="addMail")
    public void addMail(@RequestBody Mail newMail){
        System.out.println("add");
        //mails.addMail(newMail);
    }
 //   @RequestMapping(method=RequestMethod.DELETE,value="deleteMail")
    public void deleteMail(@RequestBody int mailId){
        System.out.println("delete");
        //mails.deleteMail(mailId);
    }
   // @RequestMapping(method=RequestMethod.UPDATE,value="updateMailStatus")
    public void updateMailStatus(@RequestBody int mailId,@RequestBody int readen){
        System.out.println("update");
        //mails.updateMailStatus(mailId,readen);
    }
    //  @RequestMapping(method=RequestMethod.GET,value="getAllMails")
    /*public List<Mail> getAllMails(){
        List<Mail> lm= new Mail(1,mails.getTime(),"hello","how are you",2,3,0);
        return lm;
    }*/
  //  @RequestMapping(method=RequestMethod.GET,value="getMailContentById")
    public String getMailContentById(@RequestBody int mailId){
        return "content";
        //String mailContent=mails.getMailContentById(mailId);
        //return mailContent;
    }
}
