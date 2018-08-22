package singleton2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 皇帝
 */
public class Emperor {
    private static int maxNumOfEmperor = 2;
    private static List<String> nameList = new ArrayList<>();
    private static List<Emperor> emperors = new ArrayList<>();
    private static int countNumOfEmperor = 0;

    static {
        for (int i = 0; i < maxNumOfEmperor; i++) {
            emperors.add(new Emperor("皇" + (i + 1) + "帝"));
        }
    }

    // 隐藏构造函数
    private Emperor() {

    }

    private Emperor(String name) {
        nameList.add(name);
    }

    public static Emperor getInstance() {
        Random random = new Random();
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);

        return emperors.get(countNumOfEmperor);
    }


    public void say() {
        System.out.println(nameList.get(countNumOfEmperor));
    }
}