package prototype;

public class Mail implements Cloneable {
    private String receiver;
    private String subject;
    private String appellation; // 称谓
    private String context;
    private String tail; // 邮件尾部，一般都是加上"XXX版权所有"等信息

    public Mail(AdvTemplate advTemplate) {
        System.out.println("执行构造方法...");

        this.subject = advTemplate.getAdvSubject();
        this.context = advTemplate.getAdvContext();
    }

    @Override
    protected Mail clone() throws CloneNotSupportedException {
        Mail mail = null;

        try {
            mail = (Mail) super.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }

        return mail;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}
