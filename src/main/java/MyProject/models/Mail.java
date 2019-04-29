package models;

import java.sql.Date;


public class Mail {
    private String id;
    private Date time;
    private String subject;
    private String content;
    private int receiverId;
    private int senderId;
    private int readen;

    public Mail() {

    }

    public Mail(String id, Date time, String subject, String content, int receiverId, int senderId, int readen) {
        this.id = id;
        this.time =time;


        //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        //LocalDateTime now = LocalDateTime.now();
        //this.time=dtf.format(now);


        this.subject = subject;
        this.content = content;
        this.receiverId = receiverId;
        this.senderId = senderId;
        this.readen = readen;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(int receiverId) {
        this.receiverId = receiverId;
    }

    public int getSenderId() {
        return senderId;
    }

    public void setSenderId(int senderId) {
        this.senderId = senderId;
    }

    public int getReaden() {
        return readen;
    }

    public void setReaden(int readen) {
        this.readen = readen;
    }
}
