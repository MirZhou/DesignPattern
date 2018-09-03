package prototype;

import java.util.Random;

public class Client {
    private static final int MAX_COUNT = 10; // 发送账单的数量

    public static void main(String[] args) throws CloneNotSupportedException {
        int i = 0;

        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XXX版权所有");

        while (i < MAX_COUNT) {
            Mail cloneMail = mail.clone();

            cloneMail.setAppellation(getRandString(5) + "先生（女士）");
            cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");

            sendMail(cloneMail);

            i++;
        }
    }

    private static void sendMail(Mail mail) {
        System.out.println(String.format("标题：%s\t收件人：%s\t...发送成功！", mail.getSubject(), mail.getReceiver()));
    }

    private static String getRandString(int maxLength) {
        String source = "abcdefghijklmnopqrstuovwxyzABCDEFGHIJKLMNOPQRSTOUVWXYZ";

        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < maxLength; i++) {
            sb.append(source.charAt(random.nextInt(source.length())));
        }

        return sb.toString();
    }

}
